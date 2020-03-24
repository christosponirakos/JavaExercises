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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<BootCamp> listOfBootcamps = new ArrayList();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter details for three bootcamps\n");

        for (int i = 1; i < 4; i++) {
            System.out.println("Please enter details for bootcamp number " + i);
            System.out.println("Please enter a name");
            String name = input.next();
            try {
                System.out.println("Please enter a starting date");
                String startingDateString = input.next();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate startingDate = LocalDate.parse(startingDateString, formatter);
                System.out.println("Pleease enter a ending date");
                String endingDateString = input.next();
                LocalDate endingDate = LocalDate.parse(endingDateString, formatter);

                BootCamp boot1 = new BootCamp(name, startingDate, endingDate);
                listOfBootcamps.add(new BootCamp(name, startingDate, endingDate));
                
                            } catch (Exception e)
                {
                    System.out.println("The date you entered is in the wrong format or invalid");
                }

            }
            System.out.println("Please enter a date so as to check if a bootcamp is available in that date");
            String checkDateString = input.next();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate checkDate = LocalDate.parse(checkDateString, formatter);

            for (BootCamp bootcamp : listOfBootcamps) {
                LocalDate startDate = bootcamp.getStartingDate();
                LocalDate endDate = bootcamp.getEndingDate();
                if (checkDate.isBefore(startDate)) {
                    System.out.println("Bootcamp " + bootcamp.getName() + " will be available in " + checkDate + ". It starts " + startDate + "and ends " + endDate);
                    break;
                } else {
                    System.out.println("Sorry no bootcamp available in " + checkDate);
                }
            }

        }

    }
