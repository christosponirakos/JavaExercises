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
public abstract class Computer {

    private String brand;
    protected int price;
    private static int computersCreated;

    public Computer(int price) {
        this.price = price;
        computersCreated++;
    }

    public Computer(String brand, int price) {
        this(price);
        this.brand = brand;

    }

    public String getBrand() {
        return brand;
    }

    private void setBrand(String brand) { //private so as not to be able to change brands in the computer
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public abstract void setPrice(int price);
    
    public static int getComputersCreated(){
        return computersCreated;
    }

}
