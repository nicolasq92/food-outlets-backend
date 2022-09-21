package com.project.springbootrestfoodoutlets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CityController {

    @Autowired
    private ICityService cityService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(value = "/city/{cityName}")
    public ArrayList<City> getCities(@PathVariable("cityName") String cityName) {
        ArrayList<City> cities = new ArrayList<City>();
        int numPage = 1;
        boolean getValues = true;
        while(getValues) {
            ResponseEntity response = cityService.findAll(cityName, numPage);
            cities.addAll(response.getData());
            if(numPage <= response.getTotal_pages()) {
                numPage++;
            } else {
                getValues = false;
                break;
            }
        }

        cities.sort((a,b) -> b.getUser_rating().getAverage_rating().compareTo(a.getUser_rating().getAverage_rating()));

        return cities;
    }

}
