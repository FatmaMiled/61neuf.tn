package com.six.cent.dix.neuf.app.service;

import com.six.cent.dix.neuf.app.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);

	User findByEmail(String username);
}
