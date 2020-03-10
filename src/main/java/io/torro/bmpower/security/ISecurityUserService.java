package io.torro.bmpower.security;

public interface ISecurityUserService {

    String validatePasswordResetToken(long id, String token);

}
