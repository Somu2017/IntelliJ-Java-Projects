package com.javaUdemyTuts;

/**
 * Created by Somu on 12-01-2017.
 */
public class BankAccount {
    private int accountNo;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    /*  Getter Methods */
    public int getAccountNo() {
        return this.accountNo;
    }
    public double getBalance() {
        return balance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /*  Setter Methods */
    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /*  Functionality Methods */
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹"+amount+" to account. New Balance : ₹"+getBalance());
    }
    public void withdraw(double amount) {
        if(amount<=balance) {
            balance -= amount;
            System.out.println("Withdrawn ₹"+amount+" from account. New Balance : ₹"+getBalance());
        } else {
            System.out.println("Insufficient funds to make a withdrawal of ₹"+amount+"!!");
        }
    }
}
