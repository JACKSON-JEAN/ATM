package com.banking;

import java.util.HashMap;
import java.util.Map;

public class OperationsImpl implements Operations{
    ATM atm = new ATM();
    HashMap<Double, String> miniSt = new HashMap<>();
    @Override
    public void checkBalance() {
        System.out.println("Your current balance is: "+atm.getBalance());

    }

    @Override
    public void withdrawCash(double withdraw) {
        if(withdraw< atm.getBalance()){
            miniSt.put(withdraw," withdrawn");
            atm.setBalance(atm.getBalance()-withdraw);
            System.out.println(withdraw+" cash withdrawn");
            checkBalance();
        }else{
            System.out.println("Insufficient balance");
        }


    }

    @Override
    public void depositCash(double deposit) {
        atm.setBalance(atm.getBalance()+deposit);
        miniSt.put(deposit," deposited");
        System.out.println(deposit+" cash deposited");
        checkBalance();

    }

    @Override
    public void viewMiniStatement() {
        for(Map.Entry<Double, String> m:miniSt.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }

    }
}
