package com.tf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tf.entity.User;

public interface UserRepository extends JpaRepository<User, String> {
	@Query(name="user.getUser",value="select u from User u where u.userName=:username")
	public List<User> getUser(@Param("username") String userName);
}
