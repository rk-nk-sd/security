package web.service;

public interface SecurityService {
    String findLoggerUsername();

    void autoLogin(String username, String password);
}
