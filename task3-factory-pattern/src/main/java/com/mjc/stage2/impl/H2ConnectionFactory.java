package com.mjc.stage2.impl;

import com.mjc.stage2.ConnectionFactory;
import org.h2.jdbc.JdbcConnection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class H2ConnectionFactory implements ConnectionFactory {

    @Override
    public Connection createConnection() {
        Properties prop = new Properties();
        Connection conn = null;
        try {
            prop.load(this.getClass().getClassLoader().getResourceAsStream("h2database.properties"));
            conn = DriverManager.getConnection(
                    prop.getProperty("db_url"),
                    prop.getProperty("user"),
                    prop.getProperty(""));
        } catch (IOException | SQLException io) {
            io.printStackTrace();
        }
        return conn;
    }
    // Write your code here!
}

