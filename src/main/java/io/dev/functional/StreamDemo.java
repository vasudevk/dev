package io.dev.functional;

import io.dev.objects.Tour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import static io.dev.GenericData.setChicagoRestaurants;
import static io.dev.GenericData.setDallasRestaurants;
import static io.dev.GenericData.setNycRestaurants;


public class StreamDemo {

    public static void main(String[] args) {

        // Runtime exception on Line 14 -> IllegalStateException
        // stream has already been operated upon or closed
        // Uncomment below line to test
        Stream<int[]> stream = Stream.of(new int[]{10, 20, 30, 40, 50, 60});
        stream.forEach(System.out::println); // Stream is closed here
        // stream.flatMapToInt(Arrays::stream).forEach(System.out::println);


        // FlatMap Example
        var tours = new ArrayList<Tour>();
        var nycTour = new Tour();
        nycTour.setCity("NYC");
        nycTour.setRestaurants(setNycRestaurants.get());
        tours.add(nycTour);

        var chicagoTour = new Tour();
        chicagoTour.setCity("Chicago");
        chicagoTour.setRestaurants(setChicagoRestaurants.get());
        tours.add(chicagoTour);

        var dallasTour = new Tour();
        dallasTour.setCity("Dallas");
        dallasTour.setRestaurants(setDallasRestaurants.get());
        tours.add(dallasTour);

//        tours.stream().map(Tour::getRestaurants).flatMap(Collection::stream).forEach(System.out::println);

        tours.forEach(tour -> {
            System.out.println("Top places to eat in " + tour.getCity());
            tour.getRestaurants().forEach(System.out::println);
            System.out.println("-------------------------------------");
        });

    }
}