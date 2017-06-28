package com.example.root.spaceappproject;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.root.spaceappproject.Model.Food;
import com.example.root.spaceappproject.Model.Hotel;

public class FoodDetails extends AppCompatActivity {
    Hotel hotel;
    TextView name,location,food,quantity,posted_date;
    Button button;
    LinearLayout linearLayout;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_details);

        hotel=(Hotel)getIntent().getSerializableExtra("hello");
//        Log.e("TAG", "onCreate: "+hotel.getFood() );

        name=(TextView)findViewById(R.id.name);
         location=(TextView)findViewById(R.id.location);
         /*food=(TextView)findViewById(R.id.food);*/
         quantity=(TextView)findViewById(R.id.quantity);
         posted_date=(TextView)findViewById(R.id.posted_date);
        button=(Button)findViewById(R.id.request);
        linearLayout=(LinearLayout)findViewById(R.id.l1);



        name.setText(hotel.getName());
        location.setText(hotel.getLocation());

        for (Food foo:hotel.getFood()
             ) {
            CheckBox ch=new CheckBox(getApplicationContext());
            ch.setText(foo.getFood());
            ch.setButtonTintList(ColorStateList.valueOf(Color.parseColor("#000000")));
//            ch.setLinkTextColor(Color.parseColor("#CCCCCC"));
            ch.setTextColor(Color.parseColor("#000000"));
            ch.setTextSize(20);
            linearLayout.addView(ch);


        }

        Log.e("TAG", "onCreate: "+hotel.getFood().get(0).getFood() );
//        food.setText(hotel.getFood().get(0).getFood());
        Log.e("TAG", "onCreate: "+hotel.getFood().get(0).getQuantity() );
        quantity.setText(""+hotel.getFood().get(0).getQuantity());

        posted_date.setText(hotel.getPostedDate());
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),RequestFood.class);
                intent.putExtra("hello", hotel);
                startActivity(intent);


            }
        });

    }
}
