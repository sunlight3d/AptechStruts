/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.sql.*;
import model.User;
public class Database {
    //Database constants
    public static final String databaseServer = "localhost";
    public static final String databaseName="strutsExample";
    public static final String databasePort="3306";
    public static final String databaseUser="root";
    public static final String databasePassword="";
    public static final String databaseURL = "jdbc:mysql://"+
            databaseServer+"?"+
            "user="+databaseUser+
            "password="+databasePassword;
    
    private Connection connection;
    private PreparedStatement preparedStatement;
    private Statement statement;
    private static Database database;
    //constructor 
    public Database() {
    	try {
            Class.forName("com.jdbc.mysql.Driver");            
            this.connection = DriverManager.getConnection(this.databaseURL);
        } catch(Exception e) {
            this.connection = null;
        }
    }
    public static Database getInstance() {
        if(Database.database == null) {
            Database.database = new Database();            
        }
        return database;
    }
    public int insertUser(User newUser) {
        int status = 0;
        try {
			String sql = "INSERT INTO tblUsers VALUES(?,?,?,?,?,?,?)";
            preparedStatement = connection.preparedStatement(sql);
            preparedStatement.setString(1, getFirstName());
            preparedStatement.setString(2, getLastName());
            preparedStatement.setString(3, getEmail());
            preparedStatement.setInteger(4, getAge());
            preparedStatement.setString(5, getPassword());
            preparedStatement.setString(6, getGender());
            preparedStatement.setString(7, getCountry());
            preparedStatement.executeUpdate();
        } catch(Exception e) {
            return status;
        }
    }
}
