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
INSERT INTO tblCountries(CountryId, CountryName, Position) VALUES('CN', 'China', "Eastern side of Asia");
INSERT INTO tblCountries(CountryId, CountryName, Position) VALUES('', '', "");