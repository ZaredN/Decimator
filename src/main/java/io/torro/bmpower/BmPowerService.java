package io.torro.bmpower;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.Scanner;

@Service // A stereotype annotation (class-path scan/ singleton )
public class BmPowerService {
	Date d1 = null;
	Date d2 = null;
	// private static final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd
	// HH:mm:ss");

	// SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	Scanner scan = new Scanner(System.in);

	@Autowired // allows a member variable to have access to service class, injects an instance
				// to spring framework
	private BmPowerRepository bmPowerRepository;

	public List<BmPower> getAllCustomers() { // method which returns list of topics.
		// return topics;
		List<BmPower> customers = new ArrayList<>();
		bmPowerRepository.findAll().forEach(customers::add);// lambda expression Method reference
		return customers;
	}

	public Optional<BmPower> getCustomer(String carOwnerName) {
		return bmPowerRepository.findById(carOwnerName);

	}

	public void addCustomer(BmPower carOwnerName) {
		bmPowerRepository.save(carOwnerName);

	}

	public void updateCustomer(String carOwnerName, BmPower bmPower) {
		bmPowerRepository.save(bmPower); // the save method in the CRUD repository can do both Add and Update, checks if
										// the row exists, if row exists it updates if not it inserts a row.

	}

	public void deleteCustomer(String carOwnerName) {
	bmPowerRepository.deleteById(carOwnerName);

	}

	public void startTime(Date date3) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Date ");

		String date = scanner.next();

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		Date date2 = null;
		try {
			// Parsing the String
			date2 = dateFormat.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(date2);

		scanner.close();
	}

	public static long daysBetween(Date one, Date two) {

		long difference = (one.getTime() - two.getTime()) / 86400000;
		return Math.abs(difference);

		/*
		 * 
		 * d1.getTime(); System.out.println("Current DateTime: " + currentTime);
		 * scan.close();
		 */
	}

}
