package com.kingflyer.flightbooking.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kingflyer.flightbooking.Model.Users;

@Repository
public interface UserRepo extends CrudRepository<Users, Integer> {
	// @Query(value = "SELECT * From User WHERE email = :email", nativeQuery = true)
	public Users findByEmail(@Param("email") String email);
}
