package kz.tal.ais.security;

public interface ISecurityUserService {

    String validatePasswordResetToken(String token);

}
