/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.part_1;
import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class PART_1 {

    private String role;

    public PART_1() {
        this.role = "Admin";

    }

    public static void main(String[] args) {
        RegisterUser registerUser = new RegisterUser("Braedon", "Losper", "Raccoon", "67364#^&^", "+27761834299");

        //Collects User Information
        Scanner input = new Scanner(System.in);
        System.out.println("First Name");
        String firstName = input.nextLine();
        System.out.println("Last Name");
        String lastName = input.nextLine();
        System.out.println("Enter Your Cell Phone Number");
        String cellNumber = input.nextLine();
        System.out.println("Enter Your Username");
        String userName = input.nextLine();
        System.out.println("Enter Your Password");
        String userPassword = input.nextLine();

        //Validates Username
        if (registerUser.checkUsernameComplexity(userName)) {
            System.out.println("Username is valid");
        } else {
            System.out.println("Username is not valid");
        }

        //Validates Password
        if (registerUser.checkPasswordComplexity(userPassword)) {
            System.out.println("Password is correct");
        } else {
            System.out.println("Password is incorrect, Please Try Again");
        }

        //Validates Cell Phone Number
        if (registerUser.checkCellPhoneNumberFormat(cellNumber)) {
            System.out.println("Cellphone Number is correct");
        } else {
            System.out.println("Cellphone Number is incorrect, Please try again");
        }
    }

    public static boolean checkUsernameComplexity(String userName) {
        return userName.length() >= 5
                && userName.matches(".*[!@#$%^&*()].*");
    }
    //regex is a tool thats inspired by ChatGPT(OpenAI.2024)
    public static boolean checkPasswordComplexity(String userPassword) {
        return userPassword.length() >= 8
                && userPassword.matches(".*[A-Z].*")
                && userPassword.matches(".*[a-z].*")
                && userPassword.matches(".*[0-9].*")
                && userPassword.matches(".*[!@#$%^&*()].*");
    }

    public static boolean checkCellPhoneNumberFormat(String cellNumber) {
        return cellNumber.length() >= 7
                && cellNumber.matches("[0-9]+");
    }

    //Displays User Role
    public void displayRole() {
        System.out.println("User role: " + role);
    }
}

class RegisterUser {

    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String cellNumber;

    //COnstructor to initialize RegisterUser
    public RegisterUser(String firstName, String lastName, String userName, String password, String cellNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.cellNumber = cellNumber;
    }

    public String getUsername() {
        return userName;
    }

    public void setUsername(String username) {
        this.userName = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCellPhoneNumber() {
        return cellNumber;
    }
    //Checks Usernames Complexity
    public boolean checkUsernameComplexity(String username) {
        return userName.length() >= 5
                && userName.matches(".*[!@#$%^&*()].*");
    }

    //Checks Password Complexity
    public boolean checkPasswordComplexity(String password) {
        return password.length() >= 8
                && password.matches(".*[A-Z].*")
                && password.matches(".*[a-z].*")
                && password.matches(".*[0-9].*")
                && password.matches(".*[!@#$%^&*()].*");
    }

    //Checks CellPhone Number Format
    public boolean checkCellPhoneNumberFormat(String cellNumber) {
        return cellNumber.matches(0 + "[0-9]+");
    }

    //Method to display the User role
    public void displayFullName() {
        System.out.println("Your Username is" + userName);
    }
}



