package com.example.root.spaceappproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.root.spaceappproject.Model.Food;
import com.example.root.spaceappproject.Model.Hotel;

import java.util.ArrayList;

public class CompostActivity extends AppCompatActivity {
    ArrayList<Hotel> hotels=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compost);

        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recycler_view);
        HotelAdapter adapter=new HotelAdapter(this,hotels);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        prepareHotelData();

    }
    private void prepareHotelData(){
        ArrayList<Food> foods=new ArrayList<>();

        Food food=new Food("Vegetable Waste",5,"kg");
        foods.add(food);
        food=new Food("Fruit waste",1,"piece");
        foods.add(food);

        Hotel hotel=new Hotel("Lumbini Hotel","Balkumari, Lalitpur",foods,"2017/8/5");
        hotels.add(hotel);

        ArrayList<Food> foods2=new ArrayList<>();
        food=new Food("Rice",10,"serving");
        foods2.add(food);
        food=new Food("Pickle",20,"serving");
        foods2.add(food);

        hotel=new Hotel("Five Grain Bakery Cafe","Baneshwor, Kathmandu",foods,"2017/8/5");
        hotels.add(hotel);

        ArrayList<Food> foods3=new ArrayList<>();
        food=new Food("Carrot",1,"kg");
        foods3.add(food);

        hotel=new Hotel("Dwarika Hotel","Gaushala, Kathmandu",foods,"2017/8/5");
        hotels.add(hotel);

        ArrayList<Food> foods4=new ArrayList<>();
        food=new Food("Milk",3,"packet");
        foods4.add(food);
        hotel=new Hotel("Annapurna Cafe","Durbar Marg, Kathmandu",foods,"2017/8/5");
        hotels.add(hotel);

        ArrayList<Food> foods5=new ArrayList<>();
        food=new Food("Potato curry",10,"kg");
        foods5.add(food);
        food=new Food("Milk",3,"packet");
        foods5.add(food);
        hotel=new Hotel("Kathmandu Bakery","Gaushala, Kathmandu",foods,"2017/8/5");
        hotels.add(hotel);

        ArrayList<Food> foods6=new ArrayList<>();
        food=new Food("Pastry",1,"piece");
        foods6.add(food);
        hotel=new Hotel("Alina's Bakery Cafe","Baneshwor, Kathmandu",foods,"2017/8/5");
        hotels.add(hotel);

        ArrayList<Food> foods7=new ArrayList<>();
        foods7.add(food);
        food=new Food("Pizza Dough",3,"piece");
        foods7.add(food);
        food=new Food("Tomato Sauce",1,"serving");
        foods7.add(food);
        hotel=new Hotel("Hyatt Hotel","Bouda, Kathmandu",foods,"2017/8/5");
        hotels.add(hotel);
    }
}
