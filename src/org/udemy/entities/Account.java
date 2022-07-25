package org.udemy.entities;

import org.udemy.exceptions.BusinessException;

public class Account {

    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Account(int number, String holder, double balance, double withdrawLimit) throws BusinessException {
        setNumber(number);
        setHolder(holder);
        deposit(balance);
        setWithdrawLimit(withdrawLimit);
    }

    public int getNumber() {
        return number;
    }

    private void setNumber(int number){
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) throws BusinessException {
        if(withdrawLimit < 0)
            throw new BusinessException("Withdraw limit can not be negative");

        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount) throws BusinessException {
        if(amount < 0)
            throw new BusinessException("Deposit amount can not be negative");

        this.balance += amount;
    }

    public void withdraw(double amount) throws BusinessException {
        if(getBalance() < amount)
            throw new BusinessException("Not enough balance");

        if(amount > getWithdrawLimit())
            throw new BusinessException("The amount exceeds withdraw limit");

        this.balance -= amount;
    }
}
