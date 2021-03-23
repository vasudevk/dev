package io.dev.hackerrank;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] strings = {"dog", "doge", "todo"};
        String[] strings1 = {"flower", "flow", "flight"};
        String s = longestCommonPrefix(strings1);
        System.out.println(s);

    }

    public static String longestCommonPrefix(String[] strings) {
        if (strings.length == 0)
            return "";
        String prefix = strings[0];
        for (int i = 1; i < strings.length; i++)
            while (strings[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }
}
