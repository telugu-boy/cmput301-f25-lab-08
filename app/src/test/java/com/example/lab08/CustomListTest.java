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

}
