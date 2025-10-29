package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }

    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    public boolean deleteCity(City city) {
        if (cities.contains(city)) {
            cities.remove(city);
            return true;
        }
        return false;
    }

    public int countCities() {
        return cities.size();
    }

    // Will be implemented later using TDD (leave blank for now)
    // public boolean hasCity(City city) { ... }
}
