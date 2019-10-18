package sk.itsovy.Artem.Test.Field_1;

public class Circle {
    private int radius;

    public Circle(int r){
        this.radius = r;
    }

    public double circleLength(){
        return 2*Math.PI*radius;
    }

    public double circleDiameter(){
        return ((circleLength())/(Math.PI));
    }

    public double circleArea(){
        return Math.PI * (radius * radius);
    }
}
