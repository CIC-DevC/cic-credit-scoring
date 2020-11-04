package com.cic.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cic.domain.Loan;

@Repository
@Transactional
public interface LoanRepository extends  JpaRepository<Loan, Long>{
	
	List<Loan> findAll();
	
	@Query("SELECT a FROM Loan a "
			+ " INNER JOIN Arpu b ON a.msisdn = b.msisdn"
			+ " WHERE b.phoneNum = :phoneNum AND a.amount IS NOT NULL")
	List<Loan> findByPhoneNum(@Param("phoneNum") String phoneNum);
}
