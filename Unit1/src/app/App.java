package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Account account1 = new Account();

        Scanner accountName = new Scanner(System.in);
        Scanner accountPassword = new Scanner(System.in);
        Scanner accountBalance = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        Scanner inputComm = new Scanner(System.in);
        
        System.out.println("To create an account, please enter your name");
        account1.name = accountName.nextLine();

        System.out.println("Please enter password");
        account1.password = accountPassword.nextLine();

        System.out.println("How much money would you like to deposit?");
        account1.balance = accountBalance.nextInt();

        System.out.println("Thank you for creating an account. Please log in");
        System.out.println("Please enter your name");
        String inputName = input.nextLine();

        if (inputName.equals(account1.name)) {  

            System.out.println("Please enter your password");
            String inputPassword = input.nextLine();

            if (inputPassword.equals(account1.password)) {

                System.out.println("Welcome " + account1.name);
                System.out.println("What would you like to do?");
                System.out.println("Press 1 to check balance, 2 to deposit money, 3 to withdraw money, 4 to change password");
                int numb = inputComm.nextInt();

                if (numb == 1){

                    System.out.println("Your current balance is " + account1.balance);

                }
                if (numb == 2){

                    System.out.println("How much would you like to deposit?");
                    int deposit = input.nextInt();
                    account1.balance = account1.balance + deposit;
                    System.out.println("Your current balance is " + account1.balance);

                }
                if (numb == 3){

                    System.out.println("How much would you like to withdraw?");
                    int withdraw = input.nextInt();
                    account1.balance = account1.balance - withdraw;
                    System.out.println("Your current balance is " + account1.balance);

                }
                if (numb == 4) {

                    System.out.println("To change your password, please enter your current password");
                    String input2Password = input.nextLine();
                    if (input2Password.equals(account1.password)) {

                        System.out.println("Please enter your new password");
                        account1.password = accountPassword.nextLine();

                        System.out.println("You password has now been changed");

                    }
                    else{
                        System.out.println("Password is incorrect");
                    }

                } 
            }
                else {
                    System.out.println("Password is incorrect");
                }

            } 
            else {
                System.out.println("That is not a valad name");
            }
        }
    }

