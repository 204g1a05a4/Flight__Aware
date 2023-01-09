package com.itelites.app.model;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.itelites.app.model.UserIp;

@Repository
public interface FlightRepo extends CrudRepository<UserIp, Long> {

}