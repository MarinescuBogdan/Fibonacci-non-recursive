package Curs18.SumaNrDeLa1LaN.Fibonacci;

public class FibonacciNonRecursive {

    public static void main(String[] args) {

        System.out.println(fibo(6));
    }

    static int fibo(int n) {
        int termen1 = 0;
        int termen2 = 1;
        int termen3 = -1;

        if (n == termen1 || n == termen2) {
            return n;
        }
        while (n >= 2) {
            termen3 = termen1 + termen2;
            termen1 = termen2;
            termen2 = termen3;
            n--;
        }

        return termen3;

    }

    }


