package com.company;
import java.util.Scanner;
public class BankingApplication {
    public static void main(String args[]){
        BankAccount obj1= new BankAccount("Aman PXXXX", "1345PNB080808B34");
        obj1.showMenu();
    }
}
class BankAccount{
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    void deposit(int amount){
        if(amount!=0){
            balance =balance+amount;
            previousTransaction = amount;
        }
    }

    public BankAccount(String customerName, String customerId) {
        this.customerName = customerName;
        this.customerId = customerId;
    }

    void withdraw(int amount){
        if(amount!=0){
            balance=balance-amount;
            previousTransaction= -amount;
        }
    }
    void getPreviousTransaction(){
       if(previousTransaction>0){
           System.out.println("Deposited: ₹"+previousTransaction);
       }
       else if(previousTransaction<0){
           System.out.println("Withdrawn: ₹"+Math.abs(previousTransaction));
       }
       else{
           System.out.println("No transaction occured");
       }
    }
    void showMenu(){
        char option='\0';
        Scanner scan= new Scanner(System.in);

        System.out.println("Welcome "+customerName);
        System.out.println("Your ID is "+customerId);
        System.out.println("\n");
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous transaction");
        System.out.println("E. Exit");
        System.out.println("F. Withdraw 100 Ruppes");

        do{
            System.out.println("***********************************************************************************");
            System.out.println("Enter any option from above list");
            System.out.println("***********************************************************************************");
            option = scan.next().charAt(0);
            System.out.println("\n");

            switch (option){
                case 'A':
                    System.out.println("---------------------------------");
                    System.out.println("Your current Balance is ₹"+balance);
                    System.out.println("----------------------------------");
                    System.out.println("\n");
                    //showMenu();
                    break;

                case 'B':
                    System.out.println("--------------------------------------");
                    System.out.println("Enter an amount to deposit: ");
                    System.out.println("---------------------------------------");
                    int amount= scan.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    //showMenu();
                    break;

                case 'C':
                    System.out.println("---------------------------------------");
                    System.out.println("Enter an amount to withdraw: ");
                    System.out.println("-----------------------------------------");
                    int amount2= scan.nextInt();
                    withdraw(amount2);
                    System.out.println("\n");
                    //showMenu();
                    break;

                case 'D':
                    System.out.println("-----------------------------------------");
                    getPreviousTransaction();
                    System.out.println("---------------------------------------------------");
                    //showMenu();
                    break;

                case 'E':
                    System.out.println("**************************************************************************************");
                    break;
                    
                case 'F':
                    System.out.println("**************************************************************************************");
                    System.out.println("Rs 100 has been withdrawn from your account");
                    System.out.println("**************************************************************************************");
                    withdraw(100);
                    System.out.println("\n");
                    break;   

                default:
                    System.out.println("Invalid Option !! Please enter again");
                    break;
            }
        }while(option!='E');
        System.out.println("Thank You for using our Banking Applicaiton ");

    }
}






