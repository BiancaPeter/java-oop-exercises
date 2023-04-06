package demo.calculator;

public class Calculator {
    //    exemplu overloading 1. prin numarul de parametrii
    public int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public int sum(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }

    //    2. prin tipul parametrilor (putem modifica tipul returnat
    public double sum(double a, double b) {
        double sum = a + b;
        return sum;
    }

//    public int sum (int a, double b){
//        ///
//    }
//
//    public int sum (double a, int b){
//        ///
//    }

    public int max(int a, int b) {
        return Math.max(a, b);
    }

}

