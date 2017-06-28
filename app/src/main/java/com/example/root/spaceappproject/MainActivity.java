package com.example.root.spaceappproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.root.spaceappproject.Model.Food;
import com.example.root.spaceappproject.Model.Hotel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Hotel> hotels=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recycler_view);
        HotelAdapter adapter=new HotelAdapter(this,hotels);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        prepareHotelData();

    }
    private void prepareHotelData(){
        ArrayList<Food> foods=new ArrayList<>();

        Food food=new Food("Bread",5,"piece");
        foods.add(food);
        food=new Food("Bagel",2,"piece");
        foods.add(food);
        food=new Food("Donut",3,"piece");
        foods.add(food);
        food=new Food("Pastry",1,"piece");
        foods.add(food);

        Hotel hotel=new Hotel("Soaltee Crown Plaza","Soaltee mod, Kathmandu",foods,"2017/8/5");
        hotels.add(hotel);

        ArrayList<Food> foods2=new ArrayList<>();
        food=new Food("Rice",10,"serving");
        foods2.add(food);
        food=new Food("Potato curry",5,"serving");
        foods2.add(food);
        food=new Food("Chicken curry",1,"serving");
        foods2.add(food);
        food=new Food("Pickle",20,"serving");
        foods2.add(food);

        hotel=new Hotel("Everest Hotel","Baneshwor, Kathmandu",foods,"2017/8/5");
        hotels.add(hotel);

        ArrayList<Food> foods3=new ArrayList<>();
        food=new Food("Carrot",1,"kg");
        foods3.add(food);
        food=new Food("Radish",2,"kg");
        foods3.add(food);
        food=new Food("Cucumber",1,"kg");
        foods3.add(food);
        food=new Food("Potato",3,"kg");
        foods3.add(food);

        hotel=new Hotel("Dwarika Hotel","Gaushala, Kathmandu",foods,"2017/8/5");
        hotels.add(hotel);

        ArrayList<Food> foods4=new ArrayList<>();
        food=new Food("Bread",5,"serving");
        foods4.add(food);
        food=new Food("Omelet",2,"serving");
        foods4.add(food);
        food=new Food("Potato curry",10,"kg");
        foods4.add(food);
        food=new Food("Milk",3,"packet");
        foods4.add(food);
        hotel=new Hotel("Yak and Yeti Hotel","Durbar Marg, Kathmandu",foods,"2017/8/5");
        hotels.add(hotel);

        ArrayList<Food> foods5=new ArrayList<>();
        food=new Food("Bread",5,"serving");
        foods5.add(food);
        food=new Food("Omelet",2,"serving");
        foods5.add(food);
        food=new Food("Potato curry",10,"kg");
        foods5.add(food);
        food=new Food("Milk",3,"packet");
        foods5.add(food);
        hotel=new Hotel("Kathmandu Bakery","Gaushala, Kathmandu",foods,"2017/8/5");
        hotels.add(hotel);

        ArrayList<Food> foods6=new ArrayList<>();
        food=new Food("Bagel",2,"piece");
        foods6.add(food);
        food=new Food("Donut",3,"piece");
        foods6.add(food);
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
