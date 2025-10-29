package com.example.lab08;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    private CustomList cityList;

    @BeforeEach
    public void beforeEach() {
        this.cityList = new CustomList();
    }

    // adds a city to cityList and checks hasCity for the same city
    @Test
    public void Test_hasCity(){
        City edmonton = new City("Edmonton", "Alberta");
        City calgary = new City("Calgary", "Alberta");

        cityList.addCity(edmonton);

        assertTrue(cityList.hasCity(edmonton));
        assertFalse(cityList.hasCity(calgary));
    }


    @Test
    public void Test_deleteCity(){
        City edmonton = new City("Edmonton", "Alberta");
        City calgary = new City("Calgary", "Alberta");

        cityList.addCity(edmonton);
        cityList.addCity(calgary);

        cityList.deleteCity(edmonton);

        assertFalse(cityList.hasCity(edmonton));
        assertTrue(cityList.hasCity(calgary));
    }

    @Test
    public void Test_countCities(){
        assertEquals(cityList.countCities(), 0);

        City edmonton = new City("Edmonton", "Alberta");
        City calgary = new City("Calgary", "Alberta");

        cityList.addCity(edmonton);
        assertEquals(cityList.countCities(), 1);

        cityList.addCity(calgary);
        assertEquals(cityList.countCities(), 2);

        cityList.deleteCity(edmonton);
        assertEquals(cityList.countCities(), 1);

        cityList.deleteCity(calgary);
        assertEquals(cityList.countCities(), 0);
    }
}
