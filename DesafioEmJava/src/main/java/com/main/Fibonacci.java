package com.main;

public class Fibonacci {
    public static boolean pertenceFibonacci(int numero) {
        if (numero < 0) return false;
        
        int fib0 = 0;
        int fib1 = 1;
        
        if (numero == fib0 || numero == fib1) return true;

        int proximoValor = fib0 + fib1;

        while (proximoValor <= numero) {
            if (proximoValor == numero) return true;
            fib0 = fib1;
            fib1 = proximoValor;
            proximoValor = fib0 + fib1;
        }
        return false;
    }
}