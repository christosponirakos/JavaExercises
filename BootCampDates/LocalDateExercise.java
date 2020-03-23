/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package localdateexercise;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class LocalDateExercise {

    private static ArrayList<BootCamp> listOfBootCamps = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<BootCamp> listOfBootcamps = new ArrayList();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter details for three bootcamps");
        
        for (int i = 1; i<4; i++) {
            System.out.println("Please enter details for bootcamp number "+ i);
            System.out.println("Please enter a name");
            String name = input.next();
            System.out.println("Please enter a starting date");
            String startingDateString = input.next();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate startingDate = LocalDate.parse(startingDateString, formatter);
            System.out.println("Pleease enter a ending date");
            String endingDateString = input.next();
            LocalDate endingDate = LocalDate.parse(endingDateString, formatter);
            listOfBootCamps.add(new BootCamp(name, startingDate, endingDate)); 

        }
        System.out.println("Please enter a date so as to check if a bootcamp is availablein that date");
        String checkDateString = input.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate checkDate = LocalDate.parse(checkDateString, formatter);
        
        
        for (BootCamp bootcamp:ListOfBootCamps){
           if(checkDate.isBefore(BootCamp.getstartingDate())){ 
        }
        
    }

}
