package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    static Scanner scanner = new Scanner(System.in);
    public void firstName() {

        System.out.print("Enter First Name : ");
        String firstName = scanner.nextLine();
        boolean answer = Pattern.matches("([A-Z]*[a-z]*){2,}", firstName);
        if (answer) {
            System.out.println(firstName);
        } else {
            System.out.println("please enter valid first name ");
            firstName();
        }
    }
    public void lastName() {

        scanner = new Scanner(System.in);
        System.out.print("Enter Last Name : ");
        String lastName = scanner.next();
        boolean answer = Pattern.matches("([A-Z]*[a-z]*){2,}", lastName);
        if (answer) {
            System.out.println(lastName);
        } else {
            System.out.println("please enter valid last name ");
            lastName();
        }
    }
    public void email() {

        scanner = new Scanner(System.in);
        System.out.print("Enter Email ID : ");
        String emailId = scanner.next();
        boolean answer = Pattern.matches("[a-zA-Z\\d.]+[^_!#$%&’*+/=?`{|}~^-]+@[a-zA-Z.-]+", emailId);
        if (answer) {
            System.out.println(emailId);

        } else {
            System.out.println("please enter valid email ID ");
            email();
        }
    }
    public void contactNumber() {

        scanner = new Scanner(System.in);
        System.out.print("Enter Contact Number With Country Code : ");
        String ContactNumber = scanner.nextLine();
        boolean answer = Pattern.matches(".91?[6-9]\\d{9}", ContactNumber);
        if (answer) {
            System.out.println(ContactNumber);

        } else {
            System.out.println("enter valid contact number");
            contactNumber();
        }
    }
    public void password() {

        scanner = new Scanner(System.in);
        System.out.print("Enter Password  : ");
        String password = scanner.nextLine();
        boolean answer = Pattern.matches("[a-zA-Z]{8,}", password);
        if (answer) {
            System.out.println(password);

        } else {
            System.out.println("enter valid password\nminimum 8 characters");
            password();
        }
    }
}

