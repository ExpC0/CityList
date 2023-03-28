package com.example.citylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if that city does not exist
     * @param city
     *      This is the city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     *
     * @param city
     * It deletes the given city
     * if that city doesn't contain in the list then, it will throw exception
     */

    public void delete( City city){
        if(!cities.contains(city)){
            throw new IllegalArgumentException();
        }
        else {
            cities.remove(city);
        }
    }

    /**
     *
     * @return it returns the total number of city in the list
     */
    public int count(){
        return  cities.size();
    }

    /**
     *
     * @param flag
     * @return sorted city list according to the name of city or province
     * if flag = 1 then according to city name
     * else according to province name
     */
    public List<City> getCities(int flag) {
        List<City> cityList = cities;
        if(flag == 1){
            Collections.sort(cityList);
        }
        else{
            Collections.sort(cityList, new Comparator<City>() {
                @Override
                public int compare(City city, City t1) {
                    return city.getProvinceName().compareTo(t1.getProvinceName());
                }
            });
        }

        return cityList;
    }
}