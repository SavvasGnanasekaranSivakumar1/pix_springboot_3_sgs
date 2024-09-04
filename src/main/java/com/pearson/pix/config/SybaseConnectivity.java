package com.pearson.pix.config;

import java.sql.*;
import com.sybase.jdbcx.*;

public class SybaseConnectivity {
    Connection con = null;
    Statement stmt = null;
    SybDriver sybDriver = null;

    public void makeConnection() throws Exception {
        // try
        {
            sybDriver = (SybDriver) Class.forName(
                    "com.sybase.jdbc4.jdbc.SybDriver").newInstance();
            System.out.println("Driver loaded");
            con = DriverManager
                    .getConnection("jdbc:sybase:Tds:10.16.102.22:5533/PIMS",
                            "pimsapp", "pimsapp");

            Statement stmt = con.createStatement();

            // Execute the query
            ResultSet rs = stmt.executeQuery("select * from PIMSUser");

            // Loop through the result set
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }

            // Close the result set, statement and the connection
            rs.close();
            stmt.close();
            con.close();

        }// catch(Exception e)
        {
            // System.out.println("Error is "+e.getMessage());
        }
    }

    public static void main(String args[]) throws Exception {
        SybaseConnectivity sc = new SybaseConnectivity();
        sc.makeConnection();
    }
}

