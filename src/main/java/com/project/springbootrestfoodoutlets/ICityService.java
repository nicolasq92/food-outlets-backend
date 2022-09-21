package com.project.springbootrestfoodoutlets;

import java.util.List;

public interface ICityService {
    ResponseEntity findAll(String cityName, int numPage);
}
