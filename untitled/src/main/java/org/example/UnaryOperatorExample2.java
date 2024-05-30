package org.example;

public class UnaryOperatorExample2 {
    public static void main(String[] args) {
        int a=10;
        int b=10;
        System.out.println(a++ + ++a); //22
        System.out.println(b++ + b++); //21
    }
}
