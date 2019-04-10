/*
CREATE DATABASE strutsExample;
USE strutsExample;
CREATE TABLE IF NOT EXISTS tblUsers (
firstName VARCHAR(500),
lastName VARCHAR(500),
email VARCHAR(500),
age int,
password VARCHAR(500),
gender VARCHAR(500),
country VARCHAR(500)
);

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
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, newUser.getFirstName());
            preparedStatement.setString(2, newUser.getLastName());
            preparedStatement.setString(3, newUser.getEmail());
            preparedStatement.setInt(4,newUser.getAge());
            preparedStatement.setString(5, newUser.getPassword());
            preparedStatement.setString(6, newUser.getGender());
            preparedStatement.setString(7, newUser.getCountry());
            preparedStatement.executeUpdate();
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            return status;
        }
    }
    public Boolean login(String email, String password) {
        Boolean result = false;
        try {
            String sql = "SELECT * FROM tblUsers WHERE email=? and password=?";            
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            result = resultSet.next();
        } catch(Exception e) {
            e.printStackTrace();
            result = false;
        } finally {
            return result;
        }
    }
}
