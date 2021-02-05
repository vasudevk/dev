package io.dev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Editor {


    static Map<String, Object> concurrentHashMap = new ConcurrentHashMap<>();
    static Map<String, Object> hashtable = new Hashtable<>();
    static Map<String, Object> synchronizedMap = Collections.synchronizedMap(new HashMap<>());
    static List<String> arrayList = new ArrayList<>();
    static List<Integer> linkedList = new LinkedList<>();
    static List<Object> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
    static List<Integer> synchronizedList = Collections.synchronizedList(new ArrayList<>());
    static Vector<String> vector = new Vector<>();

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        final var phone = new int[]{9, 1, 1};
        // phone = new int[]{2, 4, 6}; // cannot alter the structure of final variables
        phone[0] = 8;
        System.out.println(Arrays.toString(phone));

        Integer pay = 10000;
        Integer bonus = 10000;
        System.out.println(pay == bonus);
        System.out.println(pay.equals(bonus));
        Class<?> aClass = Class.forName("io.dev.core.StringDemo");
        System.out.println(aClass.getConstructor());

    }
}