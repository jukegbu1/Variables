package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //declare variables here before we use them
        int x, y, answer;
        //all three variables will be declared as integers
        double temperature;
        float Temperature;
        //a float uses less memory than a double
        String firstName, lastName;
        String question = "unknown";     //question is initialized</p>
        //assign values to the variables here
        x = 26;
        y = 2147483647; //you could also use the constant Integer.MAX_VALUE
        answer = 42;
        firstName = "Jennifer";
        lastName = "Ukegbu";
        // String question = "unknown"; //question is initialized
        temperature = 98.6;
        Temperature = 32.0f;

        //string for last movie i saw
        String movie = "WTSU";

        double GPA = 3.98;

        //Use the variables here
        System.out.println( "The variable x contains a value of " + x );
        System.out.print( "The value " + y + " is the largest value ");
        System.out.println( "you can store in an integer." );
        System.out.println("The anwser to the question is: " + answer );
        System.out.println("And the question has long since been " + question);
        System.out.println("If you're not sick your temperature is "
                + temperature);
        System.out.println("If you're an ice cube your temperature is "
                + Temperature);
        System.out.println("The variable Temperature is not "
                + "the same as  temperature");
        System.out.println("The founder of WigNation, AgentPluged, and Trade $ecrets is " + firstName + " " + lastName );
        System.out.println("The last movie I saw was" + movie);
        System.out.println("My GPA is " + GPA);



    }
}



