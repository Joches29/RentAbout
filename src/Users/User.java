/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;


public class User {
    
    private String name;
    private int id;
    private String phone;
    private String email;
    
    public static final String phoneRegex = "^[245678]\\d{7}$";
    public static final String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setPhone(String phone) {
        if (validatePhone(phone)){
            this.phone = phone;
        }
    }

    public void setEmail(String email) {
        if (validateEmail(email)){
            this.email = email;
        }
    }
    
    private boolean validatePhone(String phone){
        return phone.matches(phoneRegex);
    }
    
    private boolean validateEmail(String email){
        return email.matches(emailRegex);
    }
    
    public User (int id, String name, String phone, String email){
        this.id = id;
        this.name = name;
        if (validatePhone(phone)){
            this.phone = phone;
        }
        if (validateEmail(email)){
            this.email = email;
        }
    }
    
    @Override
    public String toString(){
        return "User id: " + id + " User name: " + name + " User phone: " + phone + " User email: " + email;
    }
    
    
    
    
    
}

