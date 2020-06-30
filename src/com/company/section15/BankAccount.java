package com.company.section15;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private double balance;
    private String accountNumber;
    private ReentrantLock lock;

    public BankAccount(String accountNumber, double balance) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.lock = new ReentrantLock();
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        if(lock.tryLock()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ignored) {

            } finally {
                lock.unlock();
            }
            balance += amount;
            System.out.format("%s: deposit %f\n", Thread.currentThread().getName(), amount);
            return true;
        }
        return false;
    }

    public boolean withDraw(double amount) {
        if(lock.tryLock()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ignored) {

            } finally {
                lock.unlock();
            }
            balance -= amount;
            System.out.format("%s: withdrew %f\n", Thread.currentThread().getName(), amount);
            return true;
        }
        return false;
    }

    public boolean transfer(BankAccount destination, double amount) {
        if(withDraw(amount)) {
            if(destination.deposit(amount)) {
                return true;
            } else {
                System.out.println("Destination account busy. Refunding money\n");
                deposit(amount);
            }
        }
        return false;
    }

    public static void main() {
        BankAccount account1 = new BankAccount("sdsa", 500.00);
        BankAccount account2 = new BankAccount("123", 1000.00);

        new Thread(new Transfer(account1, account2, 10.00), "Transfer 1").start();
        new Thread(new Transfer(account2, account1, 55.88), "Transfer 2").start();
    }
}

class Transfer implements Runnable {
    private BankAccount sourceAccount, destinationAccount;
    private double amount;

    public Transfer(BankAccount sourceAccount, BankAccount destinationAccount, double amount) {
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
        this.amount = amount;
    }

    @Override
    public void run() {
        while(!sourceAccount.transfer(destinationAccount, amount)) {
        }
        System.out.format("%s completed\n", Thread.currentThread().getName());
    }
}