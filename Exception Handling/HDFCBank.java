package com.blogic;

import com.exceptions.*;

public class HDFCBank implements Bank {
    private double balance;

    public void deposite(double amt) throws InvalidAmountException {
        if (amt <= 0) {
            throw new InvalidAmountException(amt + " is an invalid amount");
        }
        balance = balance + amt;
    }

    public double withdraw(double amt) throws InSufficientFundsException {
        if (balance < amt) {
            throw new InSufficientFundsException("Insufficient Funds");
        }
        balance = balance - amt;
        return amt;
    }

    public void balanceEnquiry() {
        System.out.println("Current Balance: " + balance);
    }
}
