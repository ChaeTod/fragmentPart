package sk.itsovy.Artem.Test.Field_1;

import java.util.Scanner;

public class Rectangle {
    private int a;
    private int b;
    private char character;
    private boolean fill;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
        fill = false;
        this.character = 0;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public int getB() {
        return b;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    public int calcArea() {
        return a * b;
    }

    public int calcPerimeter() {
        return (a + b) * 2;
    }

    public double calcDiagonal() {
        return (Math.sqrt((a * a) + (b * b)));
    }

    public  void showRec(){
       if (fill){
            for (int i = 1; i <= a; i++){
                for (int j = 1; j <= b; j++){
                    System.out.print(character+ " ");
                }
                System.out.println(" ");
            }
        } else {
            for (int i = 1; i <= a; i++){
                for (int j = 1; j <= b; j++){
                    if (i == 1 || i == a || j == 1 || j == b){
                        System.out.print(character+ " ");
                    }else {
                        System.out.print("  ");
                    }
                }
                System.out.println(" ");
            }
        }
    }

    public void printRec(){
        System.out.println(toString());
    }

    public String toString(){
        return "Rectangle: a = " +a+ ", b = " +b;
    }
}
