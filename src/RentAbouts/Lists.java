/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package RentAbouts;

/**
 *
 * @author rodol
 */
public interface Lists <T>{
    
    public boolean add(T t);
    public boolean delete(T t);
    public void sort();
    public T search(Object id);
    
    
}
