package com.example;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<Student, String> 
{
	List<Student> findByMobileNo(Long no, Pageable page			);
}
