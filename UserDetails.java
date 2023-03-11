package com.UserRegistrationUsinglamda;

public class UserDetails {
    String firstName;
    String LastName;
    String Email;
    String MobileNumber;
    String Password;

    public UserDetails(String firstName,String LastName,String Email,String MobileNumber,String Password){
        this.firstName=firstName;
        this.LastName = LastName;
        this.Email = Email;
        this.MobileNumber=MobileNumber;
        this.Password= Password;
    }
    public UserDetails(){}

    public UserDetails(String nextLine) {
    }
}
