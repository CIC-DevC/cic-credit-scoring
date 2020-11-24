package com.cic.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cic.domain.Arpu;
import com.cic.domain.Loan;
import com.cic.domain.Recharge;
import com.cic.domain.ServiceUse;
import com.cic.domain.Submission;

@Repository
@Transactional
public interface HomeRepository extends  JpaRepository<Arpu, Long>{
	
	@Query("SELECT a FROM Arpu a WHERE a.phoneNum = :phoneNum")
	Arpu findArpuByPhoneNum(@Param("phoneNum") String phoneNum);
	
	@Query("SELECT a.score FROM Submission a" 
			+ " INNER JOIN Arpu b ON a.msisdn = b.msisdn "
			+ " WHERE b.phoneNum = :phoneNum")
	Double findScoreByPhoneNum(@Param("phoneNum") String phoneNum);
	
	@Query("SELECT a FROM Loan a "
			+ " INNER JOIN Arpu b ON a.msisdn = b.msisdn"
			+ " WHERE b.phoneNum = :phoneNum AND a.amount IS NOT NULL")
	List<Loan> findLoanByPhoneNum(@Param("phoneNum") String phoneNum);
	
	@Query("SELECT a FROM ServiceUse a "
			+ " INNER JOIN Arpu b ON a.msisdn = b.msisdn"
			+ " WHERE b.phoneNum = :phoneNum AND a.serviceId IS NOT NULL")
	List<ServiceUse> findServiceByPhoneNum(@Param("phoneNum") String phoneNum);
	
	@Query("SELECT a FROM Recharge a "
			+ " INNER JOIN Arpu b ON a.msisdn = b.msisdn"
			+ " WHERE b.phoneNum = :phoneNum AND a.feeCharge IS NOT NULL")
	List<Recharge> findRechargeByPhoneNum(@Param("phoneNum") String phoneNum);
	
	@Query("SELECT a FROM Submission a"
			+ " LEFT JOIN Arpu b ON a.msisdn = b.msisdn "
			+ " WHERE b.phoneNum = :phoneNum")
	List<Submission> findScoreHistoryByPhoneNum(@Param("phoneNum") String phoneNum);

	//	sumLoan
	@Query("SELECT SUM(a.amount) FROM Loan a"
			+ " LEFT JOIN Arpu b ON a.msisdn = b.msisdn"
			+ " WHERE b.phoneNum = :phoneNum AND a.loanType = 1 "
			+ " GROUP BY b.msisdn")	
	Long findSumLoan(@Param("phoneNum")String phoneNum);
	//	debit
	@Query("SELECT SUM(a.amount) FROM Loan a"
			+ " LEFT JOIN Arpu b ON a.msisdn = b.msisdn"
			+ " WHERE b.phoneNum = :phoneNum"
			+ " GROUP BY b.msisdn")	
	Long findDebitLoan(@Param("phoneNum")String phoneNum);
	
	//	maxLoan
	@Query("SELECT MAX(a.amount) FROM Loan a"
			+ " LEFT JOIN Arpu b ON a.msisdn = b.msisdn"
			+ " WHERE b.phoneNum = :phoneNum"
			+ " GROUP BY b.msisdn")	
	Long findMaxLoan(@Param("phoneNum")String phoneNum);
	
	//	minLoan
	@Query("SELECT MIN(a.amount) FROM Loan a"
			+ " LEFT JOIN Arpu b ON a.msisdn = b.msisdn"
			+ " WHERE b.phoneNum = :phoneNum"
			+ " GROUP BY b.msisdn")	
	Long findMinLoan(@Param("phoneNum")String phoneNum);
	//	numLoan
	@Query("SELECT COUNT(a.amount) FROM Loan a"
			+ " LEFT JOIN Arpu b ON a.msisdn = b.msisdn"
			+ " WHERE b.phoneNum = :phoneNum"
			+ " GROUP BY b.msisdn")	
	Long findNumLoan(@Param("phoneNum")String phoneNum);
	
	//	numLoanLate
	@Query("SELECT COUNT(a.amount) FROM Loan a"
			+ " LEFT JOIN Arpu b ON a.msisdn = b.msisdn"
			+ " WHERE b.phoneNum = :phoneNum AND a.modifiedDate > a.createdDate"
			+ " GROUP BY b.msisdn")	
	Long findNumLoanLate(@Param("phoneNum")String phoneNum);
	//	sumRecharge
	@Query("SELECT SUM(a.feeCharge) FROM Recharge a"
			+ " LEFT JOIN Arpu b ON a.msisdn = b.msisdn"
			+ " WHERE b.phoneNum = :phoneNum"
			+ " GROUP BY b.msisdn")	
	Long findSumRecharge(@Param("phoneNum")String phoneNum);
	
	//	maxRecharge
	@Query("SELECT MAX(a.feeCharge) FROM Recharge a"
			+ " LEFT JOIN Arpu b ON a.msisdn = b.msisdn"
			+ " WHERE b.phoneNum = :phoneNum"
			+ " GROUP BY b.msisdn")	
	Long findMaxRecharge(@Param("phoneNum")String phoneNum);
	
	//	minRecharge
	@Query("SELECT MIN(a.feeCharge) FROM Recharge a"
			+ " LEFT JOIN Arpu b ON a.msisdn = b.msisdn"
			+ " WHERE b.phoneNum = :phoneNum"
			+ " GROUP BY b.msisdn")	
	Long findMinRecharge(@Param("phoneNum")String phoneNum);
	//	numRecharge
	@Query("SELECT COUNT(a.feeCharge) FROM Recharge a"
			+ " LEFT JOIN Arpu b ON a.msisdn = b.msisdn"
			+ " WHERE b.phoneNum = :phoneNum"
			+ " GROUP BY b.msisdn")	
	Long findNumRecharge(@Param("phoneNum")String phoneNum);
	//	numVRecharge
	@Query("SELECT COUNT(a.feeCharge) FROM Recharge a"
			+ " LEFT JOIN Arpu b ON a.msisdn = b.msisdn"
			+ " WHERE b.phoneNum = :phoneNum AND a.cOrV = 'V'"
			+ " GROUP BY b.msisdn")	
	Long findNumVRecharge(@Param("phoneNum")String phoneNum);
	//	numCRecharge
	@Query("SELECT COUNT(a.feeCharge) FROM Recharge a"
			+ " LEFT JOIN Arpu b ON a.msisdn = b.msisdn"
			+ " WHERE b.phoneNum = :phoneNum AND a.cOrV = 'C'"
			+ " GROUP BY b.msisdn")	
	Long findNumCRecharge(@Param("phoneNum")String phoneNum);
}
