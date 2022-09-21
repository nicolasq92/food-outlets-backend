package com.project.springbootrestfoodoutlets;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityService implements ICityService {

    private final RestTemplate restTemplate;

    public CityService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @Override
    public ResponseEntity findAll(String cityName, int numPage) {

        String url = "https://jsonmock.hackerrank.com/api/food_outlets?city="+ cityName +"&page="+numPage;
        ResponseEntity response = this.restTemplate.getForObject(url, ResponseEntity.class);
        return response;
    }
}
