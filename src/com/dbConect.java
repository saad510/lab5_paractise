package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class dbConnect {

    public static void connect(){
        Connection conn;
        Statement stmt;
        ResultSet rs;

        String sql;
        conn = null;
        String url = "jdbc:mysql://localhost:3306/db_oopproject";
        String driver = "com.mysql.jdbc.Driver";
        try{
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url,"user","12345");

            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            sql = "Select * from user_account";
            rs = stmt.executeQuery(sql);

        }
        catch (Exception e){
            System.out.print(e.getMessage());
        }
    }


}