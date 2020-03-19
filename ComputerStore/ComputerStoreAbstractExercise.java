/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computerstoreabstractexercise;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Chris
 */
public class ComputerStoreAbstractExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String sony = "Sony";
        String acer = "Acer";
        String asus = "Asus";
        String lenovo = "Lenovo";

        Computer desktop1 = new Desktop(900, sony, true);
        Computer laptop1 = new Laptop(700, acer, true);
        Computer tablet1 = new Tablet(50, asus, true);

        List<Computer> computers = new ArrayList();
        computers.add(desktop1);
        computers.add(laptop1);
        computers.add(tablet1);
        computers.add(new Desktop(1000, lenovo, true));
        computers.add(new Laptop(500, acer, false));
        computers.add(new Tablet(50, asus, true));
        
        int sumSony = 0;
        int sumAcer = 0;
        int sumAsus = 0;
        int sumLenovo = 0;
        int sumUnknown = 0;
        
        for(Computer c:computers){
            if(c.getBrand().equals(sony)){
                sumSony +=c.getPrice();
            }else if(c.getBrand().equals(acer)){
                sumAcer += c.getPrice();
            }else if(c.getBrand().equals(asus)){
                sumAsus += c.getPrice();
            }else if(c.getBrand().equals(lenovo)){
                sumLenovo += c.getPrice();
            }else{
                sumUnknown += c.getPrice();
            }
        }
        
        System.out.println(sumAsus);
        
        
        
        boolean isDesktop = laptop1 instanceof Desktop;
        boolean isComputer = laptop1 instanceof Computer;
        boolean isObject = laptop1 instanceof Object;
        
        System.out.println(isComputer);
        System.out.println(isObject);
       
        int sumLaptop = 0;
        int sumDesktop = 0;
        int sumTablet = 0;
        
        for(Computer c:computers){
            if(c instanceof Desktop){
                sumDesktop += c.getPrice();
            }else if(c instanceof Laptop){
                sumLaptop += c.getPrice();
            }else if(c instanceof Tablet){
                sumTablet += c.getPrice();
            }
        }
        System.out.println(sumDesktop);
    }

}
