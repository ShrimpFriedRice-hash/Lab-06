package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     * @throws IllegalArgumentException
     * Throws IllegalArgumentException if the city already exists within the list
     *
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }
    /**
     * This returns a boolean of if the city list contains a city
     * @param city
     * This is city we are checking if the list has
     * @return
     * Return true if city exists in the list, false if not
     */
    public boolean hasCity(City city){
        return cities.contains(city);
    }

    /**
     * This removes a city from the list if the city does exist
     * @param city
     * This is a candidate city to remove
     * @throws IllegalArgumentException
     * throws if the city does not exist in the list
     */
    public void delete(City city){
        if(!(hasCity(city))){
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }
    /**
     * This returns the number of cities
     * @return
     * Return number of cities in the list
     */
    public int getCount(){
        return cities.size();
    }



}
