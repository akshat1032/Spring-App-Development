package com.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springapp.Greeting;

public interface GreetingRepository extends JpaRepository<Greeting,Long>{
	
}
