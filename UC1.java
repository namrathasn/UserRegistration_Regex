/***********************************************************************************************
 *@purpose Implementing User Registration Program Using REGEX. Validating User First Name
 *@author namratha
 *@version 1.0
 *@since 18-06-2021
 ************************************************************************************************/

package com;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * UserRegistration is a class of public type
 *
 * @author namratha
 *
 */

public class UserRegistration {

    /**
     * isFirstName is a method of static boolean type isFirstName method used to
     * validate user first name using boolean because its returns true or false so
     * its easy for validation
     *
     * @param firstname
     * @return if pattern matches method returns true otherwise it returns false.
     */

    public static boolean isFirstName(String firstname) {
        String regex = "^[A-Z]{1}[a-z]{2,}";
        Pattern patt = Pattern.compile(regex);
        if (firstname == null) {
            return false;
        }
        Matcher match = patt.matcher(firstname);
        return match.matches();
    }

    /**
     * Main method Will ask user to enter first name to Validates it and prints
     * weather its correct or not correct
     *
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter firstname:");
        String firstname = input.nextLine();
        if (isFirstName(firstname) == true) {
            System.out.println("Firstname is Correct");
        } else {
            System.out.println("Firstname is Incorrect " + "\n"
                    + "First name starts with Capital letter and has minimum 3 characters");
        }
    }