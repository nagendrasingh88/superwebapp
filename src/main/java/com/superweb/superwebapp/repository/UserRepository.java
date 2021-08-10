package com.superweb.superwebapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.superweb.superwebapp.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
		
	@Query(value = "select * from user where email=?1",nativeQuery = true)
	public List<User> findByEmail(String uname);
	
	@Query(value = "select * from user where email=?1 and pass=?2",nativeQuery = true)
	public List<User> authenticate(String uname,String pass);
}
