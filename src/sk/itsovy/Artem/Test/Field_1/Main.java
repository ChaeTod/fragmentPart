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

        Rectangle rec1 = new Rectangle(7, 8);
        System.out.println(rec1.calcArea() + "  " + rec1.calcPerimeter() + "  " + rec1.calcDiagonal());


        rec1.setCharacter('+');

        Scanner in = new Scanner(System.in);
        System.out.println("You want to see a full or empty rec? (Y/N)?");
        String n = in.nextLine();
        rec1.setFill(n.equals("Y")); //set the fill - true
        rec1.showRec();

        Circle circ1 = new Circle(4);
        System.out.println(circ1.circleLength() + "  " + circ1.circleDiameter() + "  " + circ1.circleArea());
    }
}
