/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RentRegisters;

import RentAbouts.Lists;

/**
 *
 * @author rodol
 */
public class RentRegisterList implements Lists<RentRegister> {
    private RentRegister list[];

    public RentRegisterList() {
        this.list = new RentRegister[100];
    }

    @Override
    public boolean add(RentRegister t) {
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
    public boolean delete(RentRegister t) {
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
                    RentRegister temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
    }

    @Override
    public RentRegister search(Object id) {
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
