package com.jagadish.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jagadish.entity.Reviews;

@Repository
public interface ReviewRepository extends JpaRepository<Reviews, Integer>{

	
}
