package com.project.springbootrestfoodoutlets;

import java.util.ArrayList;
import java.util.List;

public class ResponseEntity {

    private int page;
    private int per_page;
    private int total;
    private int total_pages;
    private ArrayList<City> data;

    public ResponseEntity(int page, int per_page, int total, int total_pages, ArrayList<City> data) {
        this.page = page;
        this.per_page = per_page;
        this.total = total;
        this.total_pages = total_pages;
        this.data = data;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPer_page() {
        return per_page;
    }

    public void setPer_page(int per_page) {
        this.per_page = per_page;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    public ArrayList<City> getData() {
        return data;
    }

    public void setData(ArrayList<City> data) {
        this.data = data;
    }
}
