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
public class Laptop extends Computer {

    //price exists because it is inherited
    private boolean hasWifi;
    

    public Laptop(int price){
        super(price);
    }

    public Laptop(int price, String brand,  boolean hasWifi) {
        super(brand, price);
        this.hasWifi = hasWifi;
        setPrice(price);
    }

    public void setPrice(int price) {
        if(hasWifi == true){
        this.price = price + 20; //this is ok and it is pointing thr price in thte computer superclass. it could be super.price
    }
           
        }

}
