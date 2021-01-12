package io.dev.hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Vasu",
                "Vaasudev",
                "Nikkuuul",
                "Nikooolllaa",
                "Reena",
                "Reenuurrraa",
                "RooaaRllya"
        );

        System.out.println("Enter any character/s below\n");
        names.stream().filter(Filter.nameStartingWithPrefix(scanner.nextLine()))
                .map(Mapper.getDistinctCharactersCount()).forEachOrdered(System.out::println);

    }

    static class Mapper {
        public static Function<String, CharactersCount> getDistinctCharactersCount() {
            return f -> new CharactersCount(f.toLowerCase(), Math.toIntExact(f.toLowerCase().chars().distinct().count()));
        }
    }

    static class Filter {
        public static Predicate<String> nameStartingWithPrefix(String nextLine) {
            return p -> p.toLowerCase().startsWith(nextLine.toLowerCase());
        }
    }
}
