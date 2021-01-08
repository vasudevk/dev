package io.dev.core;

public class StringDemo {

    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2.intern());

        String s3 = "abc";
        StringBuffer s4 = new StringBuffer(s3);
        System.out.println(s3.equals(s4));

        String str = new String("abc");
        char[] a = {'a', 'b', 'c'};
        String str2 = new String(a);

        System.out.println(str2);
        System.out.println(str == str2);
    }
}
