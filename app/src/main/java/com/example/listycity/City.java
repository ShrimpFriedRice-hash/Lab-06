package com.example.listycity;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City> {
    private String city;
    private String province;

    /**
     * This creates a new City with a specified name and province
     * @param city
     * the name of the city
     * @param province
     * name of the province
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }
    /**
     * This returns the city name
     * @return
     * returns city name
     */
    String getCityName(){
        return this.city;
    }
    /**
     * This returns the province name
     * @return
     * returns province name
     */
    String getProvinceName(){
        return this.province;
    }

    //https://www.w3schools.com/java/ref_string_compareto.asp to figure out what compareTo returns
    /**
     * This compares this city to another city by name
     * @param o
     * the City to compare
     * @return
     * returns 0 if the names are equal, negative if the provided cities name is shorter
     * or a positive number if longer
     */
    @Override
    //had to change Object o to City o
    public int compareTo(City o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }
    /**
     * This checks if the cities are equal
     * @param o
     * the Object to compare
     * @return
     * returns true if both city and province names equal or false if not
     */
    @Override
    public boolean equals(Object o){

        if(!(o instanceof City)){
            return false;
        }
        City cities = (City) o;
        return city.equals(cities.city) && province.equals(cities.province);
    }
}

