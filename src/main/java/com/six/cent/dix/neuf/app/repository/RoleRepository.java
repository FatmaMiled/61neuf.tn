package com.six.cent.dix.neuf.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.six.cent.dix.neuf.app.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

	Optional<Role> findByName(String string);
}
