package com.UserRegistrationUsinglamda;

public class UserDetails {
    String firstName;
    String LastName;
    String Email;

    public UserDetails(String firstName,String LastName,String Email){
        this.firstName=firstName;
        this.LastName = LastName;
        this.Email = Email;
    }
    public UserDetails(){}

    public UserDetails(String nextLine) {
    }
}
