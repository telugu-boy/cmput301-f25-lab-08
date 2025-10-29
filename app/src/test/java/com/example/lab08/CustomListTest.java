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
        assertEquals(0, cityList.countCities());

        City edmonton = new City("Edmonton", "Alberta");
        City calgary = new City("Calgary", "Alberta");

        cityList.addCity(edmonton);
        assertEquals(1, cityList.countCities());

        cityList.addCity(calgary);
        assertEquals(2, cityList.countCities());

        cityList.deleteCity(edmonton);
        assertEquals(1, cityList.countCities());

        cityList.deleteCity(calgary);
        assertEquals(0, cityList.countCities());
    }
}
