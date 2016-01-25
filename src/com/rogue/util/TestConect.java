package com.rogue.util;
//
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//
//import com.mysql.jdbc.Connection;
//import com.mysql.jdbc.Statement;
//
public class TestConect {
//
//	public static void main(String args[]) {
//		try {
//			Class.forName("com.mysql.jdbc.Driver"); // 加载对应 JDBC驱动程序
//			System.out.println("Success loading Mysql Driver!");
//		} catch (Exception e) {
//			System.out.print("Error loading Mysql Driver!");
//			e.printStackTrace();
//		}
//		try {
//			Connection connect = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/javaandios", "root", "");
//			// 连接URL为 jdbc:mysql//服务器地址/数据库名
//			// 后面的2个参数分别是登陆用户名和密码
//			System.out.println("Success connect Mysql server!");
//			Statement stmt = (Statement) connect.createStatement();
//			ResultSet rs = stmt.executeQuery("select * from iosuser");
//			while (rs.next()) {
//				System.out.println(rs.getString("username") + "\t"
//						+ rs.getString("username") + "\t" + "\t"
//						+ rs.getString("username") + "\t"
//						+ rs.getString("username"));
//			}
//		} catch (Exception e) {
//			System.out.print("get data error!");
//			e.printStackTrace();
//		}
//	}
//
	
	public static void main(String[] args) {
		String dd = String.valueOf(System.currentTimeMillis());
		System.out.println(dd);
		
	}
	
}
