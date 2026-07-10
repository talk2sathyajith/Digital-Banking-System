package com.sathyajith.digital_banking_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sathyajith.digital_banking_system.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
	

}
