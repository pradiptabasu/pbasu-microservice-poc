package org.sameerean.springcrud.usermanagement.service;

import java.util.List;

import org.sameerean.springcrud.usermanagement.jpa.dao.UserRepository;
import org.sameerean.springcrud.usermanagement.jpa.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userDao;

	@Override
	public List<User> getAllUsers() {
		// return null;
		return (List<User>) userDao.findAll();
	}

	@Override
	public User getUserById(long id) {
		// return null;
		return userDao.findOne(id);
	}

	@Override
	public User getUserByPid(String pid) {
		// return null;
		return userDao.findByPid(pid);
	}

}
