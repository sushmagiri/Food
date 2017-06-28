package com.example.root.spaceappproject.Model;

import com.example.root.spaceappproject.Model.Food;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 4/29/17.
 */

public class Hotel implements Serializable {
    private String name;
    private String location;
   /* private List<String> food;
    private String quantity;*/
   private List<Food> food;
    private String postedDate;

    public Hotel() {
    }

    public Hotel(String name, String location, List<Food> food,  String postedDate) {

        this.name = name;
        this.location = location;
        this.food = food;
        this.postedDate = postedDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

       public String getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(String postedDate) {
        this.postedDate = postedDate;
    }

    public Hotel(List<Food> food) {
        this.food = food;
    }

    public List<Food> getFood() {
        return food;
    }
    public void setFood(List<Food> foodList){
        this.food=foodList;


    }
}
