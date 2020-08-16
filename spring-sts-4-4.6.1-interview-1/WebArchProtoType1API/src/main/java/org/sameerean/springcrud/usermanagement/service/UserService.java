package org.sameerean.springcrud.usermanagement.service;

import java.util.List;

import org.sameerean.springcrud.usermanagement.jpa.entity.User;

public interface UserService {
	
	List<User> getAllUsers();
	User getUserById(long id);
	User getUserByPid(String pid);

}
