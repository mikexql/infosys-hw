package problemSet2B.Q1;

import java.util.Arrays;

public class TestFibonacci {

    public static void main(String[] args) {

        Fibonacci fibonacci = new Fibonacci(10);
        System.out.println(fibonacci.getFibonacciNumber(6)); //8
        System.out.println(fibonacci.getCalls()); //11
        System.out.println(Arrays.toString(fibonacci.getData()));
        // [0, 1, 1, 2, 3, 5, 8, 0, 0, 0]
    }
}