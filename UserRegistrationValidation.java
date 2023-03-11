package com.UserRegistrationUsinglamda;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationValidation {

    public void getFirstName() {
        UserRegistrationValidation user = new UserRegistrationValidation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first name");
        UserDetails userDetails = new UserDetails(scanner.nextLine());
        Pattern pattern = Pattern.compile("([A-Z]{1,}[a-z]{3,})");
        Matcher matcher = pattern.matcher(userDetails.firstName);
        boolean m = matcher.matches();
        System.out.println(m);
    }
    public void getLastName() {
        UserRegistrationValidation user = new UserRegistrationValidation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Last name");
        UserDetails userDetails = new UserDetails(scanner.nextLine());
        Pattern pattern = Pattern.compile("([A-Z][a-z]{2,})");
        Matcher matcher = pattern.matcher(userDetails.LastName);
        boolean m = matcher.matches();
        System.out.println(m);
    }
    public void getEmail() {
        UserRegistrationValidation user = new UserRegistrationValidation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Last name");
        UserDetails userDetails = new UserDetails(scanner.nextLine());
        Pattern pattern = Pattern.compile("[abc]{3}.[a-z]{3}+@[bl]{2}.[co]{2}.[a-z]{2}+");
        Matcher matcher = pattern.matcher(userDetails.Email);
        boolean m = matcher.matches();
        System.out.println(m);
    }
    public void getMobileNumber() {
        UserRegistrationValidation user = new UserRegistrationValidation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Last name");
        UserDetails userDetails = new UserDetails(scanner.nextLine());
        Pattern pattern = Pattern.compile("([19]{2}+\\s[0-9]{10})");
        Matcher matcher = pattern.matcher(userDetails.MobileNumber);
        boolean m = matcher.matches();
        System.out.println(m);
    }
    public void getPassword() {
        UserRegistrationValidation user = new UserRegistrationValidation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Last name");
        UserDetails userDetails = new UserDetails(scanner.nextLine());
        Pattern pattern = Pattern.compile("[A-Z]{1}[A-Za-z]{4,}[0-9]{1,}+[@#$&^%~]");
        Matcher matcher = pattern.matcher(userDetails.Password);
        boolean m = matcher.matches();
        System.out.println(m);
    }



    public static void main(String[] args) {
        UserRegistrationValidation user=new UserRegistrationValidation();
        user.getFirstName();
        user.getLastName();
        user.getEmail();
        user.getMobileNumber();
        user.getPassword();
    }
}
