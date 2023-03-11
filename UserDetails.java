package com.UserRegistrationUsinglamda;

public class UserDetails {
    String firstName;
    String LastName;
    String Email;
    String MobileNumber;

    public UserDetails(String firstName,String LastName,String Email,String MobileNumber){
        this.firstName=firstName;
        this.LastName = LastName;
        this.Email = Email;
        this.MobileNumber=MobileNumber;
    }
    public UserDetails(){}

    public UserDetails(String nextLine) {
    }
}
