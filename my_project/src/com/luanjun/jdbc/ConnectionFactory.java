package com.luanjun.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionFactory {
	public static ThreadLocal<Connection> threadConnection = new ThreadLocal(){
		protected Connection initialValue() {
			return null;
		};
	};

	public static Connection getconnection(){
		return threadConnection.get();
	}
	
	public static void clear(){
		try {
			threadConnection.get().close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		threadConnection.remove();
	}
}
