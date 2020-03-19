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
public class Tablet extends Computer {

    //price exists because it is inherited
    private boolean hasBluetooth;   

    public Tablet(int price){
        super(price);
    }

    public Tablet(int price, String brand,  boolean hasWifi) {
        super(brand, price);
        this.hasBluetooth = hasWifi;
        setPrice(price);
    }

    public void setPrice(int price) {
        if(hasBluetooth == true){
        this.price = price + 50; //this is ok and it is pointing thr price in thte computer superclass. it could be super.price
    }
           
        }

}
