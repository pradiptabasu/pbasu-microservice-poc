package org.sameerean.springcrud.usermanagement.jpa.dao;

import org.sameerean.springcrud.usermanagement.jpa.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	User findByPid(String pid);
}
