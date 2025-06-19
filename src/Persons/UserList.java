/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persons;

import RentAbouts.Lists;

/**
 *
 * @author rodol
 */
public class UserList implements Lists<User>{
    private User list[];
    
    public UserList(){
        this.list = new User[100];
    }

    @Override
    public boolean add(User t) {
        int max = list.length;
        for (int i = 0; i < max ; i++) {
            if(list[i]==null){
                list[i]=t;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(User t) {
        int max = list.length;
        for (int i = 0; i < max; i++) {
            if(list[i]==t){
                list[i]=null;
                return true;
            }
        }
        return false;
    }

    @Override
    public void sort() {
        int max = list.length;
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < max-1; j++) {
                if(list[j]!=null && list[j+1]!=null && list[j].getId() > list[j+1].getId()){
                    User temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
    }

    @Override
    public User search(Object id) {
        int idt = Integer.parseInt(id.toString());
        int max = list.length;
        for (int i = 0; i < max; i++) {
            if(list[i]!=null && list[i].getId()==idt){
                return list[i];
            }
        }
        return null;
    }
    
}
