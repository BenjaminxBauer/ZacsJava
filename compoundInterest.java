/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compoundinterest;

import java.util.Scanner;


public class compoundInterest {


public static double getBalance() {
    /* 
    get the Balance from the user
    */
    System.out.print("Please enter your account balance:");
    
    Scanner keyboard = new Scanner(System.in);
    double balance = keyboard.nextDouble();
    
    return balance;
}

public static int getInterestRate() {
    /*
    Get the itereserts rate
    */
    System.out.print("\nPlease enter your interest rate as a whole number:");
    
    Scanner keyboard = new Scanner(System.in);
    int interestRate = keyboard.nextInt();
    
    return interestRate;
}

public static double getYearlyInterest(int interestRate, double balance) {
    /*
    Get the amount of yearly interest over 10 years
    */
    double yearlyBalance =  balance;
    for (int year = 1; year <= 10; year++) {
     int yearlyInterest = interestRate / 100;
     yearlyBalance =  yearlyBalance * yearlyInterest;              
    }
    return yearlyBalance;
}

public static double getMonthlyInterest(int interestRate, double balance) {
    /*
    Get the amount of monthly interest over 10 years
    */
    double monthlyBalance =  balance;
    for (int year = 1; year <= 10; year++) {
     int monthlyInterest = (interestRate / 100) / 12;
     monthlyBalance =  (monthlyBalance * monthlyInterest) * 12;              
    }
    return monthlyBalance;
}

public static double getDailyInterest(int interestRate, double balance) {
    /*
    Get the amount of yearly interest over 10 years
    */
    double dailyBalance =  balance;
    for (int year = 1; year <= 10; year++) {
     int dailyInterest = (interestRate / 100) / 365;
     dailyBalance =  (dailyBalance * dailyInterest) * 365;              
    }
    return dailyBalance;
}

public static void main(String[] args){

Scanner keyboard = new Scanner(System.in);
boolean keepGoing = true;

System.out.println("This program will read an account balance and an interest rate and display the account in 10 years.");

do{
    
    /* 
    get the Balance from the user
    */
    System.out.print("Please enter your account balance: ");
    
    double balance = keyboard.nextDouble();

    
    
    /*
    Get the itereserts rate
    */
    System.out.print("\nPlease enter your interest rate as a whole number: ");
    
    int interestRate = keyboard.nextInt();
    
  

double finalYearlyBalance = getYearlyInterest(interestRate, balance);
double finalMonthlyBalance = getMonthlyInterest(interestRate, balance);
double finalDailyBalance = getDailyInterest(interestRate, balance);

System.out.println("Your balance after 10 years is shown with interest compounded in different ways.");
System.out.println("Yearly: " + finalYearlyBalance );
System.out.println("Monthly:" + finalMonthlyBalance );
System.out.println("Daily: " + finalDailyBalance );



/* 
Outer nested loop to keep running
*/


System.out.println("\nDo you want to input again?"
+ "\n(yes / no)");
String answer = keyboard.next();
char letter = answer.charAt(0);


if(letter == 'y' || letter == 'Y'){
    
}else if(letter == 'n' || letter == 'N'){
keepGoing = false;
}else{
System.out.println("An error has occured");
}
System.out.println("");
}while(keepGoing);
}
}
