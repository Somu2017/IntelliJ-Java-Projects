package com.javaUdemyTuts;

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setAccountNo(1234);
        acc.setBalance(10000.23);
        acc.setCustomerName("Somenath Sinha");
        acc.setEmail("youaintgettinmyemailbuddy@gofyourself.com");
        acc.setPhoneNumber("9876543210");

        System.out.println("Printing info for Account No "+acc.getAccountNo()+" registered to Mr."+acc.getCustomerName());
        System.out.println("Account Balance : ₹"+acc.getBalance());
        System.out.println("Email : "+acc.getEmail());
        System.out.println("Phone Number : "+acc.getPhoneNumber());

        acc.deposit(534.32);
        acc.withdraw(10000);
        acc.withdraw(1000);
    }
}
