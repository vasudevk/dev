package io.dev.functional;

import java.math.BigDecimal;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.UnaryOperator;

public class FunctionDemo {

    public static void main(String[] args) {

        /*
         * This is a functional interface used as the assignment target for a lambda expression or method reference.
         * Function<T,R> where T is the input type & R is the return type
         * */

        Function<String, char[]> stringToCharArrayFunc = f -> f.toCharArray();

        // In this example, for a given String input, a character array is returned
        var chars = stringToCharArrayFunc.apply("This is a function");


        System.out.println(chars.length);

        for (char c : chars) {
            System.out.println(c);
        }

        UnaryOperator<Double> doubleUnaryOpsFunc = Math::sqrt;
        System.out.println(doubleUnaryOpsFunc.apply(17d));

        BinaryOperator<Integer> intBinaryOpsFunc = (i, j) -> i * j;
        System.out.println(intBinaryOpsFunc.apply(10, 6));


        // Function chaining
        Function<String, Integer> lenFunc = String::length;
        Function<Integer, Double> dblFunc = d -> d * 5d;
        Function<Double, BigDecimal> bgDcmlFunc = b -> BigDecimal.valueOf(b).add(BigDecimal.valueOf(b));

        BigDecimal bigDecimal = lenFunc.andThen(dblFunc).andThen(bgDcmlFunc).apply("This is function chaining");
        System.out.println(bigDecimal);

        IntBinaryOperator intBinaryOp = (int a, int b) -> a * b;

        intBinaryOp.applyAsInt(10, 12);

        BiFunction<String, String, Boolean> compareFunc = String::equalsIgnoreCase;
    }
}
