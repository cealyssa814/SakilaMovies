package com.pluralsight;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {



    public static void main(String[] args) throws SQLException {

        if(args.length < 3){
            System.out.println("You need to provide a username, password, and URL when running this command.");
            System.out.println("For example:");
            System.out.println("Main.exe myUsername myPassword myURL");
            return;
        }

        String username = args[0];
        String password = args[1];
        String URL = args[2];

        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setUrl(URL);
        basicDataSource.setUsername(username);
        basicDataSource.setPassword(password);

        try(Connection connection = basicDataSource.getConnection()){

        }



    }
}