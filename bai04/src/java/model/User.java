
package model;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private int age;

    private String password;
    private String gender;
    private String country;

    public String getFirstName() {        
       return firstName; 
    }
    public String getLastName() {        
       return lastName; 
    }
    public String getEmail() {        
       return email; 
    }

    public int getAge() {        
       return age; 
    }
    public String getPassword() {        
       return password; 
    }
    public String getGender() {        
       return gender; 
    }
    public String getCountry() {        
       return country; 
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public String toString() {
        return "Firstname: "+getFirstName()+" Lastname: "+getLastName()+
                " Email: "+getEmail()+" Age: "+getAge()+
                " Gender: "+getGender()+" Country: "+getCountry();
    }
}
