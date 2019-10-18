package sk.itsovy.Artem.Test.Field_1;

import javax.xml.stream.FactoryConfigurationError;

public class FragmentClass {
    private int numerator;
    private int denominator;

    public FragmentClass(int numerator, int denominator) {
        if (denominator == 0)
            denominator = 1;
        this.denominator = denominator;
        this.numerator = numerator;
    }

    public FragmentClass(FragmentClass otherFragment) {
        numerator = otherFragment.getNumerator();
        denominator = otherFragment.getDenominator();
    }

    public int getNumerator() {
        return numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void changeToBasicShape() {
        int commonDividisor = getTheLargestCommonDivisor();
        numerator = numerator / commonDividisor;
        denominator = denominator / commonDividisor;
    }

    public void extendFragment(int value) {
        if (value != 0) {
            numerator *= value;
            denominator *= value;
        }
    }

    public double getRealValue() {
        return (double) numerator / denominator;
    }

    public void reverse() {
        int tmp = numerator;
        numerator = denominator;
        denominator = tmp;
    }

    public void opposite() {
        numerator *= -1;
    }

    public FragmentClass copy() {
        FragmentClass newFragment = new FragmentClass(numerator, denominator);
        return newFragment;
    }

    private int getTheLargestCommonDivisor() {
        int absNumerator = Math.abs(numerator);
        int absDenominator = Math.abs(denominator);

        int commonDivisor = absNumerator < absDenominator ? absNumerator : absDenominator;
        while (absNumerator % commonDivisor != 0 || absDenominator % commonDivisor != 0) {
            commonDivisor--;
        }
        return commonDivisor;
    }

    public boolean isFragmentInBasicShape() {
        if (getTheLargestCommonDivisor() == 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return numerator + " / " + denominator;
    }

    public MixedNumber getMixedNumber() {
        int value = numerator / denominator;
        FragmentClass f = new FragmentClass(numerator % denominator, denominator);
        return new MixedNumber(value, f);
    }
}



