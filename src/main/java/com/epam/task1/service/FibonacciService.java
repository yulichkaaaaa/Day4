package com.epam.task1.service;

public class FibonacciService {

    private int fibonacciNumber(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
        }
    }

}
