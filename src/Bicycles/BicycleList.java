/* private
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bicycles;
import RentAbouts.Lists;

/**
 *
 * @author rodol
 */
public class BicycleList implements Lists<Bicycle>{
    private Bicycle list[];

    public BicycleList() {
        this.list = new Bicycle[100];
    }
    

    @Override
    public boolean add(Bicycle t) {
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
    public boolean delete(Bicycle t) {
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
                    Bicycle temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
    }

    @Override
    public Bicycle search(Object id) {
        //convierte el objeto a int, pero convirtiendo el objeto primero a string
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
