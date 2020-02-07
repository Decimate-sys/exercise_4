package com.company;
// 2/7/2020, Yunis Khamis, Killoran, CSCI 1660
/*Write a program that first prompts the user to enter a list of city names, one at a time until the user
 specifies "END". Next, the program should prompt the user to enter the average daily temperature for each
 of the next five days for each city. The program should store the user's cities and temperature data in one
 data structure. Next, calculate the five-day average for each city.
Finally, display a message containing the city's name and the average for each city.
The code to prompt the user for input, to calculate the five-day average, and to display the results should
be in separate methods.
Hint: You can use String.split(" ") to split a string into an array of strings based on where
spaces occur in the original string.*/
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        Map<String, ArrayList> cityNames = new HashMap<>();
        ArrayList<Integer> temperatures = new ArrayList<>();
        int temperature;
        String city;
        while(true) {
            System.out.println("Enter a list of city names, one at a time until you\n" +
                    " type \"END\":");
             city = input.nextLine();
            if(city.equalsIgnoreCase("end")) {
                break;
            }
            for(int i = 0; i < 5; i++) {
                System.out.println("Enter a temperature " + (i+1) + ": ");
                temperature = input.nextInt();
                temperatures.add(temperature);
            }
            input.nextLine();
            cityNames.put(city, temperatures);
           /* Set< Map.Entry< String,ArrayList> > me = cityNames.entrySet();

            for (Map.Entry< String,ArrayList> hi:me)
            {
                System.out.print(hi.getKey()+":");
                System.out.println(hi.getValue());
            }*/
            System.out.println("The average temperature for " + city + " is " + average(temperatures));
        }
        System.out.println("The program has ended.");
    }
    public static double average(ArrayList<Integer> temperatures) {
      double average = (temperatures.get(0)+temperatures.get(1)+temperatures.get(2)+temperatures.get(3)+temperatures.get(4))/5;
        return average;
    }
}


