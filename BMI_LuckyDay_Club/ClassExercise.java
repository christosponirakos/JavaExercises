/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classexercise;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class ClassExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        printMessage("What's your name?");
        String name = input.next();

        printMessage("What is your gender?");
        String gender = input.next(); //ask for char

        printMessage("What is your age?");
        int age = input.nextInt();

        ageControl(age);

        ageResponse(age);

        yearBorn(age);

        printMessage("Which is your favourite season? Choose from the below list.");
        ArrayList<String> season = new ArrayList();
        season.add("Winter");
        season.add("Spring");
        season.add("Summer");
        season.add("Summer");
        printArrayList(season);
        int numberSeason = input.nextInt();
        messageSeason(numberSeason);

        printMessage("Enter your height and you bodyweight and I will calculate your BMI.");
        printMessage("Height in m: ");
        double height = input.nextDouble();
        printMessage("Weight in kg: ");
        double weight = input.nextDouble();
        getBMI(height, weight);
        
        getLuckyDay(age);
        
        entranceControl(int luckyDay, int age );

    }

    static void ageControl(int age) {
        if (age <= 5) {
            System.out.println("You are too young for this app.");
        } else if (age > 5 && age <= 18) {
            System.out.println("Oh you are a student");
        } else if (age > 18 && age <= 40) {
            System.out.println("Well, you must be employed.");
        }

    }

    static void printMessage(String message) {
        System.out.println(message);
    }

    static void ageResponse(int age) {
        if (age <= 5) {
            int ageDif = 5 - age;
            System.out.println("Come back in" + ageDif + " years when you will be a student.");
        } else if (age > 5 && age <= 18) {
            int ageDif = 18 - age;
            System.out.println("Keep up... " + ageDif + " more years left and afterwards you will make money.");
        } else if (age > 18 && age <= 40) {
            int ageDif = 40 - age;
            System.out.println("You finished school " + ageDif + " years ago.");
        }
    }

    static void yearBorn(int age) {
        if (1980 + age < 2020) {
            System.out.println("You haven't born in 1980");
        } else {
            int age1980 = 2020 - age;
            System.out.println("In 1980 you were " + age1980);
        }
        int ageFuture = 2040 - 2020 + age;
        System.out.println("In 2040 you will be " + ageFuture);
    }

    static void printArrayList(ArrayList<String> inputList) {
        int size = inputList.size();
        for (int i = 0; i < size; i++) {
            String season = inputList.get(i);
            System.out.println(i + ". " + season);

        }
    }

    static void messageSeason(int numberSeason) {
        switch (numberSeason) {
            case 1:
                System.out.println("It must be cold outside");
                break;
            case 2:
                System.out.println("Ohh, flowers are very beautiful these days");
                break;
            case 3:
                System.out.println("Let's go for swimming");
                break;
            default:
                System.out.println("The trees are full of brown leaves");
                break;
        }
    }

    static void getBMI(double height, double weight) {
        double BMI = weight / height * height;
        System.out.println("Your BMI is " + BMI);

        if (BMI == 18.5) {
            System.out.println("You are underweight");
        } else if (BMI > 18.5 && BMI >= 24.9) {
            System.out.println("Your weight is normal");
        } else if (BMI > 24.9 && BMI >= 29.9) {
            System.out.println("You are overweight");
        } else if (BMI > 29.9) {
            System.out.println("You are at obesity level!");
        }
    }

    public static void getLuckyDay(int age) {
        int ageInDays = age * 365;
        int sum = 0;
        while (ageInDays > 0) {
            sum = sum + ageInDays % 10;
            ageInDays = ageInDays / 10;
        }
        int luckyDay = sum%7;
        System.out.print("Your lucky day is "+ luckyDay);
    }
    
    static void entranceControl(int luckyDay, int age){
        if(luckyDay == 2 && (age>= 20 && age<=40))
            System.out.println("Welcome to the club");
        else if (luckyDay != 2)
            System.out.println("I am sorry, you cannot enter the club because your Luckyday is not Wednesday");
        else if ( age< 20 || age > 40)
            System.out.println("I am sorry, you cannot enter the club because you are not in the allowed age range");
        
            
        }
    }

}
