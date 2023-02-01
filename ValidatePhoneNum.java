package com;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	 * isLastName is a method of static boolean type 
	 * isLastName method used to validate user last name
	 * @param lastname
	 * @return if pattern matches method returns true otherwise it return false
	 */

	public static boolean isLastName(String lastname) {
		String regex = "^[A-Z]{1}[a-z]{2,}";
		Pattern patt2 = Pattern.compile(regex);
		if (lastname == null) {
			return false;
		}
		Matcher match2 = patt2.matcher(lastname);
		return match2.matches();
	}

	/**
	 * isvalidateEmail is a method of static boolean type 
	 * isvalidateEmail method used to validate user Email id
	 * @param email
	 *@return if pattern matches method returns true otherwise it return false
	 */

	public static boolean isvalidateEmail(String email) {
		String regex = "^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?";
		Pattern patt2 = Pattern.compile(regex);
		if (email == null) {
			return false;
		}
		Matcher match2 = patt2.matcher(email);
		return match2.matches();
	}
	
 
	/**
	 * isMobileFormatValid is a method of static boolean type
	 * isMobileFormatValid method used to validate user mobile number
	 * @param mobile
	 * @return if pattern matches method returns true otherwise it return false
	 */
	public static boolean isMobileFormatValid(String mobile) {
		String regex = "^((\\+)?(\\d{2}[\\s]))?(\\d{10}){1}?$";
		Pattern patt = Pattern.compile(regex);
		if (mobile == null) {
			return false;
		}
		Matcher match = patt.matcher(mobile);
		return match.matches();
	}
	

	/**
	 * Main method Will ask user to enter first name, last name,
	 * email id, phone number and  password to Validate and prints
	 * weather its correct or not correct
	 *
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter firstname:");
		String firstname = input.nextLine();
		System.out.println("Enter lastname:");
		String lastname = input.nextLine();
		System.out.println("Enter Email id:");
		String email = input.nextLine();
		System.out.println("Enter mobile number");
		String phoneNumber = input.nextLine();
		if (isFirstName(firstname) == true) {
			System.out.println("Firstname is Correct");
		} else {
			System.out.println("Firstname is Incorrect " + "\n"
					+ "First name should starts with Capital letter and has minimum 3 characters");
		}
		if (isLastName(lastname) == true) {
			System.out.println("Lastname is Correct");
		} else {
			System.out.println("Lasrname is Incorrect " + "\n"
					+ "Last name should starts with Capital letter and has minimum 3 characters");
		}
		if (isvalidateEmail(email) == true) {
			System.out.println("Email id is Correct");
		} else {
			System.out.println("Email id  is Incorrect ");
		}
		if (isMobileFormatValid(phoneNumber) == true) {
			System.out.println("Phone Number is correct");
		} else {
			System.out.println("Phone Number is Incorrect");
		}
	}
	
}
