package com.company;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int divide(int a, int b) {
        return a / b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public double subtract(double a, double b) {
        return a - b;
    }
    public double divide(double a, double b) {
        return a / b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int a = 34;
        int b = 2;
        double c = 6.7;
        double d = 4.4;

        int e = 1;
        double f = 3.4;
        double g = 2.3;

        int aa = 23;
        int bb = 52;
        double cc = 6.7;
        double dd = 4.4;

        int ee = 12;
        int eee = 3;
        double eeee = 7;

        double aaa = 5.5;
        double bbb = 0.5;
        double ccc = 10.8;
        double ddd = 2.2;

        System.out.println(e + " + " + e + " = " + calc.add(e, e));
        System.out.println(aa + " - " + bb + " = " + calc.subtract(aa, bb));
        System.out.println(a + " * " + b + " = " + calc.multiply(a, b));
        System.out.println(ee + " / " + eee + " = " + calc.divide(ee, eee));
        System.out.println(ee + " / " + eeee + " = " + calc.divide(ee, eeee));
        System.out.println(f + " + " + g + " = " + calc.add(f, g));
        System.out.println(c + " * " + d + " = " + calc.multiply(c, d));
        System.out.println(aaa + " - " + bbb + " = " + calc.subtract(aaa, bbb));
        System.out.println(ccc + " / " + ddd + " = " + calc.divide(ccc, ddd));
    }
}

