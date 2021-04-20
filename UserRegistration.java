package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {
    private static String First_Name = "[A-Z]{1}[a-z]{2,}";
    private static String Last_Name = "[A-Z]{1}[a-z]{2,}";
    private static String Email_Id = "[a-zA-z0-9]+[a-zA-Z0-9-_[+]?]*[.]?[a-zA-Z0-9-_[+]?]+@[a-zA-Z0-9]+([.][a-zA-Z]{2,}){1,2}";
    private static String Mobile = "([0-9]{2}[ ]|0)?[6-9][0-9]{9}";
    private static String Password= "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=[^$@!#%*?&]*[$#@!%*?&][^$@!#%*?&]*$).{8,}";


    public IUserRegistration checkFirstName = (userInput) -> Pattern.matches(First_Name, userInput);
    public IUserRegistration checkLastName = (userInput) -> Pattern.matches(Last_Name, userInput);
    public IUserRegistration checkEmail = (userInput) -> Pattern.matches(Email_Id, userInput);
    public IUserRegistration checkMobileNum = (userInput) -> Pattern.matches(Mobile, userInput);
    public IUserRegistration checkPassword = (userInput) -> Pattern.matches(Password, userInput);

    public void checkException(boolean result){

        try {
            if (result == false) throw new UserRegistrationException("Invalid Entry");
        }
        catch(UserRegistrationException e) {
            System.out.println(e);
        }

    }
}
