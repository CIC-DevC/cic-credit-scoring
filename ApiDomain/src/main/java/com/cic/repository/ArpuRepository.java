package com.cic.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cic.domain.Arpu;

@Repository
public interface ArpuRepository extends JpaRepository<Arpu, Long>{
	
	List<Arpu> findAll();
}
