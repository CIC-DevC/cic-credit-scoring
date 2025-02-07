package com.cic.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cic.domain.Arpu;

@Repository
@Transactional
public interface ArpuRepository extends  JpaRepository<Arpu, Long>{
	
	List<Arpu> findAll();
	
	@Query("SELECT a FROM Arpu a WHERE a.phoneNum = :phoneNum")
	Arpu findByPhoneNum(@Param("phoneNum") String phoneNum);
}
