package com.superweb.superwebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.superweb.superwebapp.entities.Complaint;

public interface ComplaintRepository extends JpaRepository<Complaint, Long> {
	
	
}
