package com.six.cent.dix.neuf.app.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
