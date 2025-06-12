/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persons;

/**
 *
 * @author rodol
 */
public abstract class Person {
    protected String name;
    protected int id;
    protected String email;
    public static final String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    
     public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        if (validateEmail(email)){
            this.email = email;
        }
    }
    
     private boolean validateEmail(String email){
        return email.matches(emailRegex);
    }
     
     public Person(int id, String name, String email) {
          this.id = id;
         this.name = name;
         if (validateEmail(email)){
            this.email = email;
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + " Id: "+ id + " Email: " + email;
    }
     

}
