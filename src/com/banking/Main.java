package com.banking;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        OperationsImpl operations = new OperationsImpl();
        Scanner input = new Scanner(System.in);
        int bankAC = 12345;
        int pin = 123;

        System.out.print("Enter Account number: ");
        int AtmNo = input.nextInt();

        System.out.print("Enter PIN: ");
        int PIN = input.nextInt();

        if((bankAC==AtmNo)&&(pin==PIN)){
            while (true){
                System.out.println("Select option\n\t1.Check balance\n\t2.Deposit cash\n\t3.Withdraw cash\n\t4.View mini statement\n\t5.Exit");
                int choice = input.nextInt();

                switch (choice){
                    case 1:
                        //check balance
                        operations.checkBalance();
                        break;
                    case 2:
                        //deposit
                        System.out.println("Enter amount to deposit: ");
                        double myDeposit = input.nextDouble();
                        operations.depositCash(myDeposit);
                        break;
                    case 3:
                        //withdraw
                        System.out.println("Enter withdraw amount: ");
                        double myWithdraw = input.nextDouble();
                        operations.withdrawCash(myWithdraw);
                        break;
                    case 4:
                        operations.viewMiniStatement();
                    case 5:
                        //Exit
                        System.exit(0);
                        break;
                }

            }
        }else{
            System.out.println("Wrong password");
        }

    }
}
