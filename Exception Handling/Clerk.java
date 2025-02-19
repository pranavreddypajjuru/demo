package com.user;

import java.io.*;
import com.blogic.*;
import com.exceptions.*;

public class Clerk {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Bank acc1 = new HDFCBank();
            String option = "";

            do {
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Balance Enquiry");
                System.out.print("Enter option: ");
                option = br.readLine();

                switch (option) {
                    case "1": {
                        System.out.print("Enter deposit amount: ");
                        String s = br.readLine();
                        double amt = Double.parseDouble(s);
                        acc1.deposite(amt);
                        acc1.balanceEnquiry();
                        break;
                    }
                    case "2": {
                        System.out.print("Enter withdraw amount: ");
                        String s = br.readLine();
                        double amt = Double.parseDouble(s);
                        double withDrawAmt = acc1.withdraw(amt);
                        System.out.println("Withdrawn amount: " + withDrawAmt);
                        acc1.balanceEnquiry();
                        break;
                    }
                    case "3": {
                        acc1.balanceEnquiry();
                        break;
                    }
                    default:
                        System.out.println("Invalid Option");
                }

                System.out.print("Do you want to continue (Yes/No): ");
                option = br.readLine();
            } while (option.equalsIgnoreCase("Yes"));

        } catch (InvalidAmountException ie) {
            System.out.println(ie.getMessage());
        } catch (InSufficientFundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Please enter ONLY a number");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
