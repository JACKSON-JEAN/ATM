package com.banking;

interface Operations {
    public void checkBalance();
    public void withdrawCash(double withdraw);
    public void depositCash(double deposit);
    void viewMiniStatement();
}
