package sk.itsovy.Artem.Test.Field_1;

import javax.xml.stream.FactoryConfigurationError;

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

    //polimorfism
    public FragmentClass nul(int value, FragmentClass a){
        FragmentClass result = null;
        result = new FragmentClass(a.getNumerator() * value, a.getDenominator() * value);
        result.changeToBasicShape();
        return result;
    }

    public FragmentClass add(int value, FragmentClass b){
        FragmentClass temp = new FragmentClass(value, 1);
        return add(temp, b);
    }

    public FragmentClass sub(int value, FragmentClass b){
        FragmentClass temp = new FragmentClass(value, 1);
        return sub(temp, b);
    }

    public FragmentClass mylty(int value, FragmentClass b){
        FragmentClass temp = new FragmentClass(value, 1);
        return sub(temp, b);
    }




}
