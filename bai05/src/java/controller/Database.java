/*
CREATE DATABASE strutsExample;
USE strutsExample;
CREATE TABLE IF NOT EXISTS tblCountries (
CountryId VARCHAR(500),
CountryName VARCHAR(500),
Position VARCHAR(500),
Area VARCHAR(500),
Population INTEGER,
AmageUrl VARCHAR(500)
);

 */
package controller;
import java.sql.*;
import java.util.ArrayList;
import model.Country;
public class Database {
    //Database constants
    public static final String databaseServer = "localhost";
    public static final String databaseName="strutsExam";
    public static final String databasePort="3306";
    public static final String databaseCountry="root";
    public static final String databasePassword="";
    public static final String databaseURL = "jdbc:mysql://"+
            databaseServer+"?"+
            "user="+databaseCountry+
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
    public int insertCountry(Country newCountry) {
        int status = 0;
        try {
            String sql = "INSERT INTO Countries VALUES(?,?,?,?,?)";            
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, newCountry.getCountryId());
            preparedStatement.setString(2, newCountry.getCountryName());
            preparedStatement.setString(3, newCountry.getPosition());
            preparedStatement.setFloat(4, newCountry.getArea());
            preparedStatement.setFloat(5, newCountry.getPopulation());
            preparedStatement.setString(6, newCountry.getImageUrl());
            
            preparedStatement.executeUpdate();
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            return status;
        }
    }
    public ArrayList<Country> findAllCountries() {
        ArrayList<Country> countries = new ArrayList<Country>();
        try {
            String sql = "SELECT * FROM tblCountries";            
            preparedStatement = connection.prepareStatement(sql);            
            ResultSet resultSet = preparedStatement.executeQuery();            
            while(resultSet.next()) {
                String countryId = resultSet.getString("countryId");
                String countryName = resultSet.getString("countryName");
                String position = resultSet.getString("position");
                Float area = resultSet.getFloat("area");
                Float population = resultSet.getFloat("population");
                String imageUrl = resultSet.getString("imageUrl");
                countries.add(new Country(countryId, countryName, position, area, population, imageUrl));
            }
        } catch(Exception e) {
            e.printStackTrace();         
        } finally {
            return countries;
        }
    }
    public Country getCountryById(String countryId) {
        Country country = null;
        try {
            String sql = "SELECT * FROM tblCountries WHERE CountryId = ?";            
            preparedStatement.setString(1, countryId);
            preparedStatement = connection.prepareStatement(sql);            
            ResultSet resultSet = preparedStatement.executeQuery();            
            while(resultSet.next()) {
                String id = resultSet.getString("countryId");
                String countryName = resultSet.getString("countryName");
                String position = resultSet.getString("position");
                Float area = resultSet.getFloat("area");
                Float population = resultSet.getFloat("population");
                String imageUrl = resultSet.getString("imageUrl");
                country = new Country(countryId, countryName, position, area, population, imageUrl);
            }
        } catch(Exception e) {
            e.printStackTrace();             
        }
        return country;
        
    }
}
