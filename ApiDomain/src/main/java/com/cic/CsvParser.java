package com.cic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.cic.util.ConvertDataType;

public class CsvParser {

	public final static String SQL_INSERT_STATEMENT = "INSERT INTO {0} ({1}) VALUES ({2})";
//	private static String url = "jdbc:mysql://localhost:3306/cic_devc";
	private static String url = "jdbc:mysql://us-cdbr-east-02.cleardb.com:3306/heroku_233976d4d8e30cc";
	private static String user = "root";
	private static String password = "123456";
	private static String driver = "com.mysql.cj.jdbc.Driver";

	//spring.datasource.url= mysql://ba97f4e0d34093:5ea3830c@us-cdbr-east-02.cleardb.com/heroku_233976d4d8e30cc?reconnect=true

	public static void main(String[]args) throws SQLException {
		Connection conn = connect(driver);
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			
			List<String[]> submission = readCSV("dataset/submission (1).csv");
			String columnSubmision = "msisdn, score";
			stmt.executeUpdate("TRUNCATE TABLE submission");
			for(String[] record: submission) {
				String sql = getInsertStatement("submission", columnSubmision, getSubmissionValue(record));
				stmt.executeUpdate(sql);
			}
			
			submission = readCSV("dataset/submission (2).csv");
//			String columnSubmision = "msisdn, score";
//			stmt.executeUpdate("TRUNCATE TABLE submission");
			for(String[] record: submission) {
				String sql = getInsertStatement("submission", columnSubmision, getSubmissionValue(record));
				stmt.executeUpdate(sql);
			}
			submission = readCSV("dataset/submission (3).csv");
//			String columnSubmision = "msisdn, score";
//			stmt.executeUpdate("TRUNCATE TABLE submission");
			for(String[] record: submission) {
				String sql = getInsertStatement("submission", columnSubmision, getSubmissionValue(record));
				stmt.executeUpdate(sql);
			}
//			List<String[]> arpu = readCSV("dataset/arpu_train.csv");
//			String columnArpuNames = "msisdn, city_id, area_id, birthyear, sex, COL_17, COL_18, COL_19, COL_20, COL_21, COL_22, COL_27a, COL_27b, COL_27c, COL_27d, label, phone_num";
//			stmt.executeUpdate("TRUNCATE TABLE arpu");
//			Long phoneNum = Long.parseLong("84971000000");
//			for(String[] record: arpu) {
//				String phoneNumm = ",\"" + phoneNum + "\"";
//				String sql = getInsertStatement("arpu", columnArpuNames, getArpuValue(record, 1, phoneNumm));
//				
//				stmt.executeUpdate(sql);
//				phoneNum++;
//			}
//			arpu = readCSV("dataset/arpu_test.csv");
//			phoneNum = Long.parseLong("84931000000");
//			for(String[] record: arpu) {
//				String phoneNumm = ",\"" + phoneNum + "\"";
//				String sql = getInsertStatement("arpu", columnArpuNames, getArpuValue(record, 0, phoneNumm));
//				stmt.executeUpdate(sql);
//				phoneNum++;
//			}
			
//			List<String[]> loan = readCSV("dataset/loan.csv");
//			String columnLoanNames = "msisdn, loan_type, amount, created_date, modified_date";
//			stmt.executeUpdate("TRUNCATE TABLE loan");
//			for(String[] record: loan) {
//				String sql = getInsertStatement("loan", columnLoanNames, getLoanValue(record));
//				stmt.executeUpdate(sql);
//			}
//			
//			List<String[]> recharge = readCSV("dataset/recharge_update.csv");
//			String columnRechargeNames = "msisdn, created_date, c_or_v, fee_charge";
//			stmt.executeUpdate("TRUNCATE TABLE recharge");
//			for(String[] record: recharge) {
//				String sql = getInsertStatement("recharge", columnRechargeNames, getRechargeValue(record));
//				stmt.executeUpdate(sql);
//			}
//			
//			String columnTempNames = "msisdn, service_id, second_per_call, used_data, partner_msisdn, created_date, upload_data, service_type";
//			
//			BufferedReader br = null;
//			String line = "";
//			String csvSplitBy = ",";
//			stmt.executeUpdate("TRUNCATE TABLE service_use");
//			try {
//				br = new BufferedReader(new FileReader("dataset/temp.csv"));
//				line = br.readLine().trim();
//				line = br.readLine();
//				while (line != null && !line.isEmpty()) {
//					String[] record = line.split(csvSplitBy); 
//					String sql = getInsertStatement("service_use", columnTempNames, getTempValue(record));
//					stmt.executeUpdate(sql);
//					line = br.readLine();
//				}
//				br.close();
//			} catch (Exception e) {
//				System.out.println(e.toString());
//			}
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			if (stmt != null) {
				stmt.close();
			}
			if (rs != null) {
				rs.close();
			}
		}
	}
	
	private static Connection connect(String driver) {
		System.out.println("Connect() start.");
		
		Connection conn = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Connected to the driver server successfully.");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Connect() end.");
		return conn;
	}

	private static String getInsertStatement(String tableName, String columnNames, String records) {
		String sql = SQL_INSERT_STATEMENT;
		sql = StringUtils.replace(sql, "{0}", tableName);
		sql = StringUtils.replace(sql, "{1}", columnNames);
		sql = StringUtils.replace(sql, "{2}", records);
		System.out.println("Get insert statements: " + sql);
		return sql;
	}

	private static String getArpuValue(String[] record, int type, String phoneNumm) {
		StringBuilder insertValue = new StringBuilder();
		insertValue.append("\"" + record[0] + "\"") ;
		if(record.length > 4 && !StringUtils.isBlank(record[4])) {
			insertValue.append(",\"" + record[4] + "\"");
		} else {
			insertValue.append(",null");
		}
		if(record.length > 2 && !StringUtils.isBlank(record[2])) {
			insertValue.append(",\"" + record[2] + "\"");
		} else {
			insertValue.append(",null");
		}
		if(record.length > 3 && !StringUtils.isBlank(record[3])) {
			insertValue.append(",\"" + ConvertDataType.convertStringToInt(record[3]) + "\"");
		} else {
			insertValue.append(",null");
		}
		if(record.length > 5  && !StringUtils.isBlank(record[5])) {
			insertValue.append(",\"" + record[5] + "\"");
		} else {
			insertValue.append(",null");
		}
		if(record.length > 6  && !StringUtils.isBlank(record[6])) {
			insertValue.append(",\"" + ConvertDataType.convertStringLongtoTimestamp(record[6]) + "\"");
		} else {
			insertValue.append(",null");
		}
		if(record.length > 7  && !StringUtils.isBlank(record[7])) {
			insertValue.append(",\"" + ConvertDataType.convertStringLongtoTimestamp(record[7]) + "\"");
		} else {
			insertValue.append(",null");
		}
		if(record.length > 8  && !StringUtils.isBlank(record[8])) {
			insertValue.append(",\"" + ConvertDataType.convertStringToDecimal(record[8]) + "\"");
		} else {
			insertValue.append(",null");
		}
		if(record.length > 9  && !StringUtils.isBlank(record[9])) {
			insertValue.append(",\"" + ConvertDataType.convertStringToDecimal(record[9]) + "\"");
		} else {
			insertValue.append(",null");
		}
		if(record.length > 10  && !StringUtils.isBlank(record[10])) {
			insertValue.append(",\"" + ConvertDataType.convertStringToDecimal(record[10]) + "\"");
		} else {
			insertValue.append(",null");
		}
		if(record.length > 11  && !StringUtils.isBlank(record[11])) {
			insertValue.append(",\"" + ConvertDataType.convertStringToDecimal(record[11]) + "\"");
		} else {
			insertValue.append(",null");
		}
		if(record.length > 12  && !StringUtils.isBlank(record[12])) {
			insertValue.append(",\"" + ConvertDataType.convertStringToDecimal(record[12]) + "\"");
		} else {
			insertValue.append(",null");
		}
		if(record.length > 13  && !StringUtils.isBlank(record[13])) {
			insertValue.append(",\"" + record[13] + "\"");
		} else {
			insertValue.append(",null");
		}
		if(record.length > 14  && !StringUtils.isBlank(record[14])) {
			insertValue.append(",\"" + record[14] + "\"");
		} else {
			insertValue.append(",null");
		}
		if(record.length > 15  && !StringUtils.isBlank(record[5])) {
			insertValue.append(",\"" + record[15] + "\"");
		} else {
			insertValue.append(",null");
		}
		// 1 is train, 2 is test
		if(type == 1) {
			insertValue.append(",\"" + record[1] + "\"");
		} else {
			insertValue.append(",null");
		}

		insertValue.append(phoneNumm);

		return insertValue.toString();
	}
	
	private static String getLoanValue(String[] record) {
		StringBuilder insertValue = new StringBuilder();
		insertValue.append("\"" + record[0] + "\"") ;
		if(record.length > 1 ) {
			insertValue.append(",\"" + ConvertDataType.convertStringToInt(record[1]) + "\"");
		} else {
			insertValue.append(",null");
		}
		if(record.length > 2 && !StringUtils.isBlank(record[2])) {
			insertValue.append(",\"" + ConvertDataType.convertStringToInt(record[2]) + "\"");
		} else {
			insertValue.append(",null");
		}
		if(record.length > 3 && !StringUtils.isBlank(record[3])) {
			insertValue.append(",\"" + ConvertDataType.convertStringToTimestamp(record[3]) + "\"");
		} else {
			insertValue.append(",null");
		}
		if(record.length > 4 && !StringUtils.isBlank(record[4])) {
			insertValue.append(",\"" + ConvertDataType.convertStringToTimestamp(record[4]) + "\"");
		} else {
			insertValue.append(",null");
		}
		
		return insertValue.toString();
	}
	
	private static String getSubmissionValue(String[] record) {
		StringBuilder insertValue = new StringBuilder();
		insertValue.append("\"" + record[0] + "\"") ;
		if(record.length > 1 && !StringUtils.isBlank(record[1])) {
			insertValue.append(",\"" + ConvertDataType.convertStringToDecimal(record[1]) + "\"");
		} else {
			insertValue.append(",null");
		}
		return insertValue.toString();
	}
	
	private static String getRechargeValue(String[] record) {
		StringBuilder insertValue = new StringBuilder();
		insertValue.append("\"" + record[0] + "\"") ;
		if(record.length > 1 && !StringUtils.isBlank(record[1])) {
			insertValue.append(",\"" + ConvertDataType.convertStringToTimestamp(record[1]) + "\"");
		} else {
			insertValue.append(",null");
		}
		if(record.length > 2 && !StringUtils.isBlank(record[2])) {
			insertValue.append(",\"" + record[2] + "\"");
		} else {
			insertValue.append(",null");
		}
		if(record.length > 3 && !StringUtils.isBlank(record[3])) {
			insertValue.append(",\"" + ConvertDataType.convertStringToInt(record[3]) + "\"");
		} else {
			insertValue.append(",null");
		}
		
		return insertValue.toString();
	}

	private static String getTempValue(String[] record) {
		StringBuilder insertValue = new StringBuilder();
		insertValue.append("\"" + record[0] + "\"") ;
		if(record.length > 1 && !StringUtils.isBlank(record[1])) {
			insertValue.append(",\"" + ConvertDataType.convertStringToInt(record[1]) + "\"");
		} else {
			insertValue.append(",null");
		}
		if(record.length > 2 && !StringUtils.isBlank(record[2])) {
			insertValue.append(",\"" + ConvertDataType.convertStringToInt(record[2]) + "\"");
		} else {
			insertValue.append(",null");
		}
		if(record.length > 3 && !StringUtils.isBlank(record[3])) {
			insertValue.append(",\"" + ConvertDataType.convertStringToLong(record[3]) + "\"");
		} else {
			insertValue.append(",null");
		}
		if(record.length > 4 && !StringUtils.isBlank(record[4])) {
			insertValue.append(",\"" + record[4] + "\"");
		} else {
			insertValue.append(",null");
		}
		if(record.length > 5 && !StringUtils.isBlank(record[5])) {
			insertValue.append(",\"" + ConvertDataType.convertStringToTimestamp(record[5])  + "\"");
		} else {
			insertValue.append(",null");
		}
		if(record.length > 6 && !StringUtils.isBlank(record[6])) {
			insertValue.append(",\"" + ConvertDataType.convertStringToLong(record[6])  + "\"");
		} else {
			insertValue.append(",null");
		}
		if(record.length > 7 && !StringUtils.isBlank(record[7])) {
			insertValue.append(",\"" + ConvertDataType.convertStringToInt(record[7])  + "\"");
		} else {
			insertValue.append(",null");
		}
		return insertValue.toString();
	}

	private static List<String[]> readCSV(String fileName) {
		BufferedReader br = null;
		String line = "";
		String csvSplitBy = ",";
		List<String[]> lstStringObject = new ArrayList<>();
		try {
			br = new BufferedReader(new FileReader(fileName));
			line = br.readLine().trim();
			line = br.readLine();
			while (line != null && !line.isEmpty()) {
				String[] record = line.split(csvSplitBy); 
				lstStringObject.add(record);				
				line = br.readLine();
			}
			br.close();
			return lstStringObject;
		} catch (Exception e) {
		}
		return null;
	}
}
