package com.six.cent.dix.neuf.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.six.cent.dix.neuf.app.model.User;
import com.six.cent.dix.neuf.app.repository.RoleRepository;
import com.six.cent.dix.neuf.app.repository.UserRepository;

import java.util.Arrays;
import java.util.HashSet;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setEmail(user.getEmail());
        user.setRoles(new HashSet<>(Arrays.asList(roleRepository.findByName("ROLE_USER").isPresent()?roleRepository.findByName("ROLE_USER").get():null)));
        userRepository.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

	@Override
	public User findByEmail(String email) {
        return userRepository.findByEmail(email);
	}
}
