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
        public static void main(String[] args) {
            UserRegistrationValidation user=new UserRegistrationValidation();
            user.getFirstName();
        }
    }

