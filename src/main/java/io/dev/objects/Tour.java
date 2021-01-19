package io.dev.objects;

import java.util.HashSet;
import java.util.Set;

public class Tour {

    private String city;
    private Set<String> restaurants;
    private Set<String> sightseeing;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Set<String> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(Set<String> restaurants) {
        this.restaurants = restaurants;
    }
}
