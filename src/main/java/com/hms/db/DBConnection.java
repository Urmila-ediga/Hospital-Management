// package com.hms.db;

// import java.sql.Connection;
// import java.sql.DriverManager;

// public class DBConnection {

// 	private static Connection conn;
	
// 	public static Connection getConn() {
		
// 		try {
			
// 			//step:1 for connection - load the driver class 
// 			Class.forName("com.mysql.cj.jdbc.Driver");
			
// 			//step:2- create a connection
// 			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitals","root","tiger");
			
// 		} catch (Exception e) {
// 			e.printStackTrace();
// 			// TODO: handle exception
// 		}
		
// 		return conn;
// 	}
// }
package com.hms.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static Connection conn;

    public static Connection getConn() {

        try {

            // Load MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Get database details from environment variables
            String host = System.getenv("DB_HOST");
            String port = System.getenv("DB_PORT");
            String db = System.getenv("DB_NAME");
            String user = System.getenv("DB_USER");
            String password = System.getenv("DB_PASSWORD");

            // Aiven MySQL connection
            String url = "jdbc:mysql://" + host + ":" + port + "/" + db
                    + "?sslmode=REQUIRED&serverTimezone=UTC";

        //     conn = DriverManager.getConnection(url, user, password);

        // } catch (Exception e) {
        //     e.printStackTrace();
        // }
        conn = DriverManager.getConnection(url, user, password);

System.out.println("DATABASE CONNECTED SUCCESSFULLY");

} catch (Exception e) {
    System.err.println("DATABASE CONNECTION FAILED");
    e.printStackTrace();
}

        return conn;
    }
}
