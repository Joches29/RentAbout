/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persons;


public class User extends Person {
    
    private String phone;
    public static final String phoneRegex = "^[245678]\\d{7}$";

    public String getPhone() {
        return phone;
    }
    
    public void setPhone(String phone) {
        if (validatePhone(phone)){
            this.phone = phone;
        }
    }
    
    private boolean validatePhone(String phone){
        return phone.matches(phoneRegex);
    }
    
    public User (int id, String name, String email, String phone){
        //super llama a la clase base (person) para utilizar el constructor de person
        super(id, name, email);
        if (validatePhone(phone)){
            this.phone = phone;
        }
    }
    
    @Override
    public String toString(){
        return "User: " + super.toString() + " Phone: " + phone;
    }
    
    
    
    
    
}

