/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computerstoreabstractexercise;

/**
 *
 * @author Chris
 */
public class Desktop extends Computer {

    //price exists because it is inherited
    private boolean hasExtraLight;   

    public Desktop(int price){
        super(price);
    }

    public Desktop(int price, String brand,  boolean hasExtraLight) {
        super(brand, price);
        this.hasExtraLight = hasExtraLight;
        setPrice(price);
    }

    public void setPrice(int price) {
        if(hasExtraLight == true){
        this.price = price + 10; //this is ok and it is pointing thr price in thte computer superclass. it could be super.price
    }
           
        }

}
