package com.company;

public class Main {

    public static void main(String[] args) {
        Account StefansAccount = new Account("Stefans");
        StefansAccount.deposit(1000);
        StefansAccount.withdraw(500);
        StefansAccount.withdraw(-200);
        StefansAccount.deposit(-20);
        StefansAccount.calculateBalance();
        StefansAccount.balance = 5000;

        System.out.println("Balance on account is " + StefansAccount.getBalance());
        StefansAccount.transactions.add(4500);
        StefansAccount.calculateBalance();
    }
}