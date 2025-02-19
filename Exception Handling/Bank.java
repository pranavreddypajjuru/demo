package com.blogic;

import com.exceptions.*;

public interface Bank {
    public void deposite(double amt) throws InvalidAmountException;
    public double withdraw(double amt) throws InSufficientFundsException;
    public void balanceEnquiry();
}
