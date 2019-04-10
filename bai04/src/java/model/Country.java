
package model;

public class Country {
    private String countryId;
    private String countryName;
    private String position;    
    public Country(String countryId,String countryName,String position) {
        this.countryId = countryId;
        this.countryName = countryName;
        this.position = position;        
    }
    public String getCountryId() {        
       return countryId; 
    }
    public String getCountryName() {        
       return countryName; 
    }
    public String getPosition() {        
       return position; 
    }
    

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }
    public void setLastName(String CountryName) {
        this.countryName = countryName;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    
    public String toString() {
        return "countryId: "+getCountryId()+" CountryName: "+getCountryName()+
                " Position: "+getPosition()+" Age: "+getAge()+
                " Gender: "+getGender()+" Country: "+getCountry();
    }
}
