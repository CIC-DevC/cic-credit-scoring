/**
 * @author ntmduyen
 * @datetime Sep 16, 2020 - 11:51:49 PM
 */
package com.cic.constants;

public interface Constants {
	public static final String JDBC_URL = "jdbc:mysql://localhost:3306/cic_devc";
	public static final String URL_USERNAME = "root";
	public static final String URL_PASSWORD = "123456";
	public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

	public final static String SQL_INSERT_STATEMENT = "INSERT INTO {0} ({1}) VALUES ({2})";

}
