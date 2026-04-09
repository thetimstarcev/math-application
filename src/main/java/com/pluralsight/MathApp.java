package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // Create two variables to represent the salary for Bob and Gary, name them
        //bobSalary and garySalary. Create a new variable named
        //highestSalary. Determine whose salary is greater using Math.max() and
        //store the answer in highestSalary. Set the initial salary variables to any value
        //you want. Print the answer (i.e "The highest salary is ...")

        int bobSalary = 120000;
        int garySalary = 300000;
        int highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is " + highestSalary);

        // Find and display the smallest of two variables named carPrice and truckPrice. Set the variables to any value you want.
        int carPrice = 30000;
        int truckPrice = 45000;
        int smallestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The smallest price is " + smallestPrice);

        // Find and display the area of a circle whose radius is 7.25
        double radius = 7.25;
        double circleArea = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of a circle is " + circleArea);




    }
}
