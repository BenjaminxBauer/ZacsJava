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

public static double getInterestRate() {
    /*
    Get the itereserts rate
    */
    System.out.print("\nPlease enter your interest rate as a whole number:");
    
    Scanner keyboard = new Scanner(System.in);
    double interestRate = keyboard.nextInt();
    
    return interestRate;
}

public static double getYearlyInterest(double interestRate, double balance) {
    /*
    Get the amount of yearly interest over 10 years
    */
    double yearlyBalance = 0;
    double yearlyInterest = 0;

    yearlyBalance =  balance;
    for (int year = 1; year <= 10; year++) {
     yearlyInterest = interestRate / 100;
     yearlyBalance =  yearlyBalance * (1 + yearlyInterest);              
    }
    return (Math.round(yearlyBalance * 100) / 100) ;
}

public static double getMonthlyInterest(double interestRate, double balance) {
    /*
    Get the amount of monthly interest over 10 years
    */
    double monthlyBalance = 0;
    double monthlyInterest = 0;
    monthlyBalance = balance;
    for (int year = 1; year <= 10; year++) {
        for (int month = 1; month <= 12; month++) {
     monthlyInterest = (interestRate / 100) / 12;
     monthlyBalance = (monthlyBalance * (1 + monthlyInterest)) ;              
    }
    }
    return (Math.round(monthlyBalance*100) / 100);
}

public static double getDailyInterest(double interestRate, double balance) {
    /*
    Get the amount of yearly interest over 10 years
    */
    double dailyBalance = 0;
    double dailyInterest = 0;
    dailyBalance = balance;
    for (int year = 1; year <= 10; year++) {
        for (int day = 1; day <= 365; day++) {
     dailyInterest = (interestRate / 100) / 365;
     dailyBalance =  (dailyBalance * (1 + dailyInterest));              
    }
    }
    return (Math.round(dailyBalance*100) / 100);
}

public static void main(String[] args){

Scanner keyboard = new Scanner(System.in);
boolean keepGoing = true;
double balance = 0;
double interestRate = 0;
double finalYearlyBalance = 0;
double finalMonthlyBalance = 0;
double finalDailyBalance = 0;

System.out.println("This program will read an account balance and an interest"
        +" rate and display the account in 10 years.");

do{
    
    /* 
    get the Balance from the user
    */
    System.out.print("Please enter your account balance: ");
    
    balance = keyboard.nextDouble();

    
    /*
    Get the itereserts rate
    */
    System.out.print("\nPlease enter your interest rate as a whole number: ");
    
    interestRate = keyboard.nextInt();
    

finalYearlyBalance = getYearlyInterest(interestRate, balance);
finalMonthlyBalance = getMonthlyInterest(interestRate, balance);
finalDailyBalance = getDailyInterest(interestRate, balance);

System.out.println("Your balance after 10 years is shown with interest compounded in different ways.");
System.out.printf("Yearly: $" + "%.2f",finalYearlyBalance );
System.out.printf("\nMonthly: $" + "%.2f",finalMonthlyBalance );
System.out.printf("\nDaily: $" + "%.2f",finalDailyBalance );



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
