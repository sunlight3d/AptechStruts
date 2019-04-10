
package model;

public class Country {
    private String countryId;
    private String countryName;
    private String  position;  
    private Float population;  
    private String imageUrl;  
    private Float area;  
    public Country(String countryId,String countryName,String position, Float area, Float population, String imageUrl) {
        this.countryId = countryId;
        this.countryName = countryName;
        this.position = position;        
        this.population = population;        
        this.area = area;        
        this.imageUrl = imageUrl;        
        
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
    public Float getPopulation() {        
       return population; 
    }
    public Float getArea() {        
       return area; 
    }
    
    public String getImageUrl() {        
       return imageUrl; 
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
    
    public void setPopulation(String position) {
        this.position = position;
    }
    public void setArea(Float area) {
        this.area = area;
    }    
    
    public String toString() {
        return "countryId: "+getCountryId()+" CountryName: "+getCountryName()+
                " Position: "+getPosition();
    }
}
