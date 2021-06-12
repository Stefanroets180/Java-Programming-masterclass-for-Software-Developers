package com.company;

public class Main {

    public static void main(String[] args) {
        // Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number.
        //
        // Create getters and setters for each field
        // Create two additional methods
        // 1. To allow the customer to deposit funds (this should increment the balance field).
        // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
        // but not allow the withdrawal to complete if their are insufficient funds.
        // You will want to create various code in the Main class (the one created by IntelliJ) to
        // confirm your code is working.
        // Add some System.out.println's in the two methods above as well.

//        BankAccount account = new BankAccount(); //("12345", 0.00, "Anton Smith", "smith@anton.com", "1234-1234");
//
//        System.out.println(account.getNumber());
//        account.withdrawal(100.0);
//
//        account.deposit(50.0);
//        account.withdrawal(100.0);
//
//        account.deposit(51.0);
//        account.withdrawal(100.0);
//
        BankAccount timAccount = new BankAccount("Stefan", "stefan@email.com", "54 245234");
        System.out.println(timAccount.getNumber() + " name " + timAccount.getCustomerName());
        System.out.println("Current balance is " + timAccount.getBalance());
        timAccount.withdrawal(100.55);

        // Create a new class VipCustomer
        // it should have 3 fields name, credit limit, and email address.
        // create 3 constructors
        // 1st constructor empty should call the constructor with 3 parameters with default values
        // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        // 3rd constructor should save all fields.
        // create getters only for this using code generation of intellij as setters wont be needed
        // test and confirm it works.

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Anton", 2500.00);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Stefan", 100.00, "stefan@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());
    }
}
