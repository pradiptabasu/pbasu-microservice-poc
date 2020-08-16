package org.sameerean.springcrud.boot.data;

import org.sameerean.springcrud.usermanagement.jpa.dao.UserRepository;
import org.sameerean.springcrud.usermanagement.jpa.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDataLoader implements DataLoader {

	@Autowired
	private UserRepository dao;

	public UserDataLoader() {
	}

	@Override
	public void loadData() {
		dao.save(new User("u12234", "sameerean", "Shameer", "Kunjumohamed",
				"https://avatars1.githubusercontent.com/u/6382917"));
		dao.save(new User("u12245", "zaki", "Zaki", "Mirza",
				"http://lol-rofl.com/wp-content/uploads/2014/08/Boy_Face1.gif"));

	}

}
