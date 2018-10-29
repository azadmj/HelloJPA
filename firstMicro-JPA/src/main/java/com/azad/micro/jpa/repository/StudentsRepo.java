package com.azad.micro.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.azad.micro.jpa.domain.Students;

@Repository 
public interface StudentsRepo extends JpaRepository<Students, Integer>{

}
