package sk.itsovy.Artem.Test.Field_1;

import javax.xml.stream.FactoryConfigurationError;
import java.util.Random;

public class MyMath {
    public FragmentClass add(FragmentClass a, FragmentClass b) {
        FragmentClass result = null;
        result = new FragmentClass((a.getNumerator() * b.getDenominator()) + (b.getNumerator() * a.getDenominator()),
                a.getDenominator() * b.getDenominator());
        //result.changeToBasicShape();
        return result;
    }

    public FragmentClass sub(FragmentClass a, FragmentClass b) {
        FragmentClass result = null;
        result = new FragmentClass(a.getNumerator() * b.getDenominator() - b.getNumerator() * a.getDenominator(),
                a.getDenominator() * b.getDenominator());
        //result.changeToBasicShape();
        return result;
    }

    public FragmentClass mylty(FragmentClass a, FragmentClass b) {
        FragmentClass result = null;
        result = new FragmentClass(a.getNumerator() * b.getNumerator(),
                a.getDenominator() * b.getDenominator());
        //result.changeToBasicShape();
        return result;
    }

    /*
        public FragmentClass div(FragmentClass a, FragmentClass b) {
            FragmentClass result = null;
            //if (a.getDenominator() > 0 && b.getDenominator() > 0)
            result = new FragmentClass(a.getNumerator() / b.getNumerator(),
                    a.getDenominator() / b.getDenominator());
            //result.changeToBasicShape();
            return result;
        }
     */

    public static int random4() {
        Random rnd = new Random();
        int number = 0, i = 0, a, b, c, d;
        while (i < 100) {
            number = rnd.nextInt(9000) + 1000;
            a = (number / 1000);
            b = (number / 100) % 10;
            c = (number / 10) % 10;
            d = number % 10;
            if (d != c && b != a) {
                if (b != c && d != a) {
                    if (a != c && b != d) {
                        System.out.println("Number: " + number);
                    } else {
                        a = rnd.nextInt(10);
                    }
                    //}
                } else {
                    b = rnd.nextInt(10);
                }
            }
            i++;
        }
        return number;
    }

    public int reverseNumber(int number) {
        int tmp, num = 0;
        while (number != 0) {
            tmp = number % 10;
            number /= 10;
            num = num * 10 + tmp;
        }
        return num;
    }

/*
    public int reverseNum(int number){
        int i = 0, j = 0, k = 0;
        System.out.println("Inputted number: " +number);
        while (i != number){
            if (i == (number % 10)) {
                j = i;
            } else {
                if (i == ((number / 10) % 10)){
                    k = i;
                }
            }
            i++;
        }
        System.out.println("The reverse number is: " +j+ +k);

        /*
        for (i = number; i >= (number / 100) % 10; i--){
            j = number;
            System.out.println("Reversed number is: " +j);
        }


        //System.out.println("Reversed number is: " +j);
        return j;
    }
    */

    //polymorphism
    public FragmentClass nul(int value, FragmentClass a) {
        FragmentClass result = null;
        result = new FragmentClass(a.getNumerator() * value, a.getDenominator() * value);
        result.changeToBasicShape();
        return result;
    }

    public FragmentClass add(int value, FragmentClass b) {
        FragmentClass temp = new FragmentClass(value, 1);
        return add(temp, b);
    }

    public FragmentClass sub(int value, FragmentClass b) {
        FragmentClass temp = new FragmentClass(value, 1);
        return sub(temp, b);
    }

    public FragmentClass mylty(int value, FragmentClass b) {
        FragmentClass temp = new FragmentClass(value, 1);
        return sub(temp, b);
    }


}
