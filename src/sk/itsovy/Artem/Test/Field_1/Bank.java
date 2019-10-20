package sk.itsovy.Artem.Test.Field_1;

import jdk.nashorn.internal.ir.CallNode;

import javax.naming.directory.InvalidAttributeIdentifierException;

/**
 * convert - the method which make the calculations of the changing rates. Individual per one money type.
 * checker - the method which make the check if the inputted variables (value, interest, months) was correct or not. If not - the method returns -1 with the explanation where the error was.
 * loan - the method which make the calculation for user about of how much money will he need to pay per month, if he will get that kind of credit.
 */


public class Bank {
    private String name;

    public Bank(String name) {
        this.name = name;
    }

    public double convert(double amount, String code) {
        switch (code) {
            case "TRY": {
                return (double) Math.round((amount * 6.47) * 100) / 100;
            }
            case "HUF": {
                return (double) Math.round((amount * 331.21) * 100) / 100;
            }
            case "CHF": {
                return (double) Math.round((amount * 1.10) * 100) / 100;
            }
            case "HRK": {
                return (double) Math.round((amount * 7.44) * 100) / 100;
            }
            case "GBP": {
                return (double) Math.round((amount * 0.86) * 100) / 100;
            }
            default:
                return -1;
        }
    }

    public double checker(double value, double interest, int months) {
        if (value <= 0) {
            System.out.println("Error! Value can't be less or equal 0! Waited for >0, but got: " + value);
            return -1;
        } else {
            if (interest <= 0) {
                System.out.println("Error! Interest can't be less or equal 0! Waited for >0, but got: " + interest);
                return -1;
            } else {
                if (months <= 0) {
                    System.out.println("Error! Months can't be less or equal 0! Waited for >0, but got: " + months);
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }

    public /*static*/ double loan(double value, double interest, int months) {
        double state = ((interest / 100) / 12);
        return (double) Math.round((value * state) / (1 - (Math.pow((1 + state), -months))) * 100) / 100;
    }
}

