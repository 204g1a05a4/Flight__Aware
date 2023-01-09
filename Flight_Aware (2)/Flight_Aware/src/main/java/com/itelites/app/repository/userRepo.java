package com.itelites.app.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.itelites.app.model.User;
import com.itelites.app.model.UserIp;

@Repository
public interface userRepo extends CrudRepository<User,Long> {
	User findByEmailIdIgnoreCase(String emailId);

}