package com.upc.ds;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconexion {
	
	private static Connection conexion = null;
	
	public static Connection conexion() throws Exception{
		String driver ="com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/dbcursosvirtual";
		

		String user = "root";
		String pwd = "root";

		if (conexion == null) {
			Class.forName(driver).newInstance();
			conexion = DriverManager.getConnection(url, user, pwd);

		}

		return conexion;
	}

}
