package io.dev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class GenericData {

    public static final List<String> clubsList = new ArrayList<>();
    public static final Map<String, String> clubsMap = new HashMap<>();

    static Consumer<List<String>> listConsumer = list -> {
        list.add("Arsenal");
        list.add("Manchester United");
        list.add("Liverpool");
        list.add("Chelsea");
        list.add("Everton");
        list.add("Swansea");
        list.add("Newcastle United");
    };

    static Consumer<Map<String, String>> mapConsumer = map -> {
        map.put("Arsenal", "Pierre-Emerick Aubameyang");
        map.put("Manchester City", "Fernandinho");
        map.put("Liverpool", "Jordan Henderson");
        map.put("Aston Villa", "Jack Grealish");
        map.put("Manchester United", "Harry Maguire");
    };

    static {
        mapConsumer.accept(clubsMap);
        listConsumer.accept(clubsList);
    }
}