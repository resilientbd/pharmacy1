package com.javatpoint;

public interface DBIntializer {
//String DRIVER="oracle.jdbc.driver.OracleDriver";
//String CON_STRING="jdbc:oracle:thin:@localhost:1521:xe";
//String USERNAME="system";
//String PASSWORD="oracle";
String DRIVER="com.mysql.jdbc.Driver";
String CON_STRING="jdbc:mysql://localhost:3306/pharmacydb";
String USERNAME="root";
String PASSWORD=null;
}
