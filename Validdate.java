/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. Testing if this shows up it updated.
 */
package validdate; //package statement
import java.util.Scanner; //import Scanner class
/**
 *
 * author: Ben Bauer
 * purpose: Write a program that reads a string from the keyboard and tests
 * whether it contains a valid date. Display the date and a message that 
 * indicates whether it is valid. If it is not valid, also display a message
 * explaining why it is not valid
 * 
 */
public class Validdate { //class declaration
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //main method declaration
        Scanner sc = new Scanner(System.in); //used to get input

        //ask the user to enter the date and specify the format
        System.out.println("Enter the date, use the following format: mm/dd/yyyy");
        
        //using scanner object obtain input for the date
        String date = sc.nextLine(); //date variable is equal to the user input
        
       //breakup string date
        char month1 = date.charAt(0); //breaks the string into parts, this being the first character
        char month2 = date.charAt(1); //breaks the string into parts, this being the second character
        String month = "" + month1 + month2; //makes a string for the month, by combining the two characters related to month
        int monthnum = Integer.parseInt(month); //turns month into an int
        
        char day1 = date.charAt(3); //breaks the string into parts, this being the first day character
        char day2 = date.charAt(4); //breaks the string into parts, this being the second day character
        String day = "" + day1 + day2; //makes a string for the day
        int daynum = Integer.parseInt(day); //turns day into an int
        
        char year1 = date.charAt(6); //breaks the string into parts, this being the first year character
        char year2 = date.charAt(7); //breaks the string into parts, this being the second year character
        char year3 = date.charAt(8); //breaks the string into parts, this being the third year character
        char year4 = date.charAt(9); //breaks the string into parts, this being the fourth year character
        String year = "" + year1 + year2 + year3 + year4; //makes a string for the year
        int yearnum = Integer.parseInt(year); //turns year into an int
        
        //test if user inputted date is valid 
        int validity = 0; //keeps track of correctly entered values, should be 2 if the entire date is entered correctly because there are no year restrictions
        if(monthnum > 0 && monthnum <= 12){ //if the int for month is between 0 and 12
            //date is valid
            validity++; //month is valid, increment the counter
        }
        else{
            System.out.println("The month entered was incorrect"); //output error message
        }
        
        if(monthnum == 4 || monthnum == 6 || monthnum == 9 || monthnum == 11){ //check to see if the month has 30 days
            if(daynum > 0 && daynum <= 30){ //check if day is a value greater than 0 but less than or equal to 30
                validity++; //day is valid, increment the counter
            }
            else{
                System.out.println("The day entered was incorrect"); //output error message
            }
        }
        else if(monthnum == 1 || monthnum == 3 || monthnum == 5 || monthnum == 7 || monthnum == 8 || monthnum == 10 || monthnum == 12){ //check to see if the month has 31 days
            if(daynum > 0 && daynum <= 31){ //check if the day is a value greater than 0 but less than or equal to 31
                validity++; //day is valid, increment counter
            }
            else{
                System.out.println("The day entered was incorrect"); //output error message
            }
        }
        else if(monthnum == 2){ //check if month is february
            if(daynum > 0 && daynum <= 29){ //check if the day is a value greater than 0 but less than or equal to 29
                validity++; //day is valid, increment the counter
            }
            else{
                System.out.println("The day entered was incorrect"); //output error message
            }
        }
        
        if(validity == 2){
            System.out.println("You have entered a valid date");
            System.out.println(date);
                    
        }
    } //end of main method
    
} //end of class
