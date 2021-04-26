package io.dev.hackerrank;

public class FibonacciSeries {

    public static void main(String[] args) {

        // Using for-loop
        int count = 20;
        int start = 0;
        int next = 1;
        for (int i = 0; i < count; i++) {
            System.out.println(i + " -> " + start);
            int sum = start + next;
            start = next;
            next = sum;
        }
    }
}