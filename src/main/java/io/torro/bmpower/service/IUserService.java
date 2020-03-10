package io.torro.bmpower.service;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Optional;

import io.torro.bmpower.web.dto.UserDto;
import io.torro.bmpower.web.error.UserAlreadyExistException;
import io.torro.bmpower.persistence.model.PasswordResetToken;
import io.torro.bmpower.persistence.model.User;
import io.torro.bmpower.persistence.model.VerificationToken;

public interface IUserService {

    User registerNewUserAccount(UserDto accountDto) throws UserAlreadyExistException;

    User getUser(String verificationToken);

    void saveRegisteredUser(User user);

    void deleteUser(User user);

    void createVerificationTokenForUser(User user, String token);

    VerificationToken getVerificationToken(String VerificationToken);

    VerificationToken generateNewVerificationToken(String token);

    void createPasswordResetTokenForUser(User user, String token);

    User findUserByEmail(String email);

    PasswordResetToken getPasswordResetToken(String token);

    User getUserByPasswordResetToken(String token);

    Optional<User> getUserByID(long id);

    void changeUserPassword(User user, String password);

    boolean checkIfValidOldPassword(User user, String password);

    String validateVerificationToken(String token);

    String generateQRUrl(User user) throws UnsupportedEncodingException;

    User updateUser2FA(boolean use2FA);

    List<String> getUsersFromSessionRegistry();

}
