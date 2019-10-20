package sk.itsovy.Artem.Test.Field_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        FragmentClass f1 = new FragmentClass(9, 3);
        System.out.println(f1.toString());
        //f1.changeToBasicShape();
        System.out.println(f1.toString());
        //f1.extendFragment(-5);
        //System.out.println(f1.toString());
        System.out.println(f1.getRealValue());

        FragmentClass f2 = new FragmentClass(3, 5);
        f2.changeToBasicShape();
        System.out.println(f2.toString());
        System.out.println(f2.isFragmentInBasicShape());
        System.out.println("/////////////////");
        System.out.println(f2.getRealValue());

        MyMath stock = new MyMath();
        System.out.println(stock.add(f1, f2));
        System.out.println(stock.sub(f1, f2));
        System.out.println(stock.mylty(f1, f2));
        //System.out.println(stock.div(f1,f2));

        FragmentClass f6 = stock.add(f1, f2);
        System.out.println(stock.nul(5, f2));
        //f6 = f2.getMixedNumber();
        System.out.println(f6.toString());

        FragmentClass f3 = new FragmentClass(7, 0);
        FragmentClass f4 = f2.copy();

        FragmentClass f5 = new FragmentClass(f1);

        */

        /* //Old example of tasks
        Rectangle rec1 = new Rectangle(7, 8);
        System.out.println(rec1.calcArea() + "  " + rec1.calcPerimeter() + "  " + rec1.calcDiagonal());


        rec1.setCharacter('+');


        System.out.println("You want to see a full or empty rec? (Y/N)?");
        String n = in.nextLine();
        rec1.setFill(n.equals("Y")); //set the fill - true
        rec1.showRec();

        Circle circ1 = new Circle(4);
        System.out.println(circ1.circleLength() + "  " + circ1.circleDiameter() + "  " + circ1.circleArea());
         */

        //Home Work on weekend
        /** Part of the code to calculate the loan and the exchange numbers.
         * amount - variable which contain the value of euros to exchange.
         * value, interest, month - variables which contains the numbers of credit summ, percent per month and the months for how long the owner will pay for the credit.
         * opinion, choice - variables who collects the choices which had been made by the user in program menus.
         */
        Scanner in = new Scanner(System.in);
        System.out.println("------------------------------");
        int month;
        double value, interest, amount;
        Bank national = new Bank("National");
        System.out.println("Welcome to the National Bank of Europe Union, sir. Please, choose the option: ");
        System.out.println("1 - Make the exchange of your money");
        System.out.println("2 - Calculate the loan");
        System.out.println("0 - Exit");
        int opinion = in.nextInt();
        switch (opinion) {
            case 1: {
                System.out.println("Please, input the amount of euros you want to exchange: ");
                amount = in.nextDouble();
                if (national.checkEUR(amount) == -1) {
                    break;
                } else {
                    System.out.println("Please, choose the currency: ");
                    System.out.println("1 - EUR to TRY");
                    System.out.println("2 - EUR to HUF");
                    System.out.println("3 - EUR to CHF");
                    System.out.println("4 - EUR to HRK");
                    System.out.println("5 - EUR to GBP");
                    System.out.println("0 - Exit");
                    int choice = in.nextInt();
                    switch (choice) {
                        case 1: {
                            System.out.println("Your exchange value is: " + national.convert(amount, "TRY") + " in TRY! Thank you for using The National exchange system. Have a nice day.");
                            break;
                        }
                        case 2: {
                            System.out.println("Your exchange value is: " + national.convert(amount, "HUF") + " in HUF! Thank you for using The National exchange system. Have a nice day.");
                            break;
                        }
                        case 3: {
                            System.out.println("Your exchange value is: " + national.convert(amount, "CHF") + " in CHF! Thank you for using The National exchange system. Have a nice day.");
                            break;
                        }
                        case 4: {
                            System.out.println("Your exchange value is: " + national.convert(amount, "HRK") + " in HRK! Thank you for using The National exchange system. Have a nice day.");
                            break;
                        }
                        case 5: {
                            System.out.println("Your exchange value is: " + national.convert(amount, "GBP") + " in GBP! Thank you for using The National exchange system. Have a nice day.");
                            break;
                        }
                        case 0: {
                            System.out.println("See you soon and have a nice day.");
                            break;
                        }
                        default: {
                            System.out.println("We are sorry, sir, but choose wrong option. We waited for 0, 1, 2, 3, 4 or 5, but got: " + choice + ". Let's try out one more time!");
                            break;
                        }
                    }
                }
                break;
            }
            case 2: {
                System.out.println("Please, input the summ of loan, interest and the amount of months: ");
                value = in.nextInt();
                interest = in.nextDouble();
                month = in.nextInt();
                if (national.checkLoan(value, interest, month) == -1) {
                    break;
                } else {
                    System.out.println("You will need to pay - " + national.loan(value, interest, month) + " eur in one month.");
                }
                System.out.println("Have a nice day!");
                break;
            }
            case 0: {
                System.out.println("We will be happy to see you again. Have a nice day!");
                break;
            }
            default: {
                System.out.println("We are sorry, sir, but you have chosen the wrong option. We waited for 0, 1 or 2, but got: " + opinion + ". Let's try out one more time!");
                break;
            }
        }
    }
}
