package com.geekreboot.localdeal.jpa;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.geekreboot.localdeal.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, String> {

	public Optional<Users> findByUsername(String username);

}
