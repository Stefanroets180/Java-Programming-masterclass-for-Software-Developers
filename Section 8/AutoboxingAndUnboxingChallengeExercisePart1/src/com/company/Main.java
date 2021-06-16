package com.company;

public class Main {

    public static void main(String[] args) {
        // You job is to create a simple banking application.
        // There should be a Bank class
        // It should have an arraylist of Branches
        // Each Branch should have an arraylist of Customers
        // The Customer class should have an arraylist of Doubles (transactions)
        // Customer:
        // Name, and the ArrayList of doubles.
        // Branch:
        // Need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch
        // Bank:
        // Add a new branch
        // Add a customer to that branch with initial transaction
        // Add a transaction for an existing customer for that branch
        // Show a list of customers for a particular branch and optionally a list
        // of their transactions
        // Demonstration autoboxing and unboxing in your code
        // Hint: Transactions
        // Add data validation.
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform certain actions

        Bank bank = new Bank("First National Bank");

        if(bank.addBranch("Cape Town")) {
            System.out.println("Cape Town branch created");
        }

        bank.addCustomer("Cape Town", "Jan", 50.05);
        bank.addCustomer("Cape Town", "Koos", 175.34);
        bank.addCustomer("Cape Town", "Frikkie", 220.12);

        bank.addBranch("Durban");
        bank.addCustomer("Durban", "Tanya", 150.54);

        bank.addCustomerTransaction("Cape Town", "Jan", 44.22);
        bank.addCustomerTransaction("Cape Town", "Jan", 12.44);
        bank.addCustomerTransaction("Cape Town", "Koos", 1.65);

        bank.listCustomers("Cape Town", true);
        bank.listCustomers("Durban", true);

        bank.addBranch("Sandton");

        if(!bank.addCustomer("Sandton", "Anton", 5.53)) {
            System.out.println("Error Sandton branch does not exist");
        }

        if(!bank.addBranch("Cape Town")) {
            System.out.println("Cape Town branch already exists");
        }

        if(!bank.addCustomerTransaction("Cape Town", "Stefan", 52.33)) {
            System.out.println("Customer does not exist at branch");
        }

        if(!bank.addCustomer("Cape Town", "Jan", 12.21)) {
            System.out.println("Customer Jan already exists");
        }


    }
}