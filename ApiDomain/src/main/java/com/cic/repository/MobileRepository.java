package com.cic.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cic.domain.Mobile;
import com.cic.domain.Submission;

@Repository
@Transactional
public interface MobileRepository extends  JpaRepository<Mobile, Long>{
	
	List<Mobile> findAll();
	
	@Query("SELECT a FROM Mobile a "
			+ " INNER JOIN Arpu b ON a.msisdn = b.msisdn "
			+ " WHERE b.phoneNum = :phoneNum")
	Mobile check(@Param("phoneNum") String phoneNum);
	
	@Query("SELECT a FROM Submission a" 
			+ " INNER JOIN Arpu b ON a.msisdn = b.msisdn "
			+ " WHERE b.phoneNum = :phoneNum")
	List<Submission> checkHistory(@Param("phoneNum") String phoneNum);
}
