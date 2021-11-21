package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int multiply(int y) {
        return x * y;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int y) {
        return sum(y) + minus(y) + multiply(y) + divide(y);
    }

    public static void main(String[] args) {
        int y = 10;
        int sum = sum(y);
        System.out.println(sum);
        int minus = minus(y);
        System.out.println(minus);
        Calculator calculator = new Calculator();
        int multiply = calculator.multiply(y);
        System.out.println(multiply);
        int divide = calculator.divide(y);
        System.out.println(divide);
        int sumAllOperation = calculator.sumAllOperation(y);
        System.out.println(sumAllOperation);
    }
}