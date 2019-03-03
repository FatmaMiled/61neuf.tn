package com.six.cent.dix.neuf.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.six.cent.dix.neuf.app.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

	User findByEmail(String email);
}
