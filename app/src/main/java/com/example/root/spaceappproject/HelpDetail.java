package com.example.root.spaceappproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.root.spaceappproject.Model.Food;
import com.example.root.spaceappproject.Model.Hotel;

import java.util.ArrayList;
import java.util.List;

public class HelpDetail extends AppCompatActivity {
    Hotel hotel;
    ArrayList<Food> foodList;
    Food food;
    Button buttonPost;

    Spinner spinnerRice,spinnerDal,spinnerCurry,spinnerBread,spinnerDonut,spinnerPotato;
    Spinner spinnerRiceScale,spinnerDalScale,spinnerCurryScale,spinnerBreadScale,spinnerDonutScale,spinnerPotatoScale;
    CheckBox checkBoxRice,checkBoxDal,checkBoxCurry,checkBoxBread,checkBoxDonut,checkBoxPotato;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_detail);


        Intent intent = getIntent();
        String value = intent.getStringExtra("rumi");


        foodList=new ArrayList<>();

        ArrayList<Integer> num = new ArrayList<Integer>();
        for (int i=1;i<20;i++){
            num.add(i);
        }

        ArrayList<String> scale=new ArrayList<>();
        scale.add("KG");
        scale.add("Person");
        scale.add("Pieces");

        checkBoxRice=(CheckBox)findViewById(R.id.checkbox_rice);
        checkBoxDal=(CheckBox)findViewById(R.id.checkbox_dal);
        checkBoxCurry=(CheckBox)findViewById(R.id.checkbox_curry);
        checkBoxBread=(CheckBox)findViewById(R.id.checkbox_bread);
        checkBoxDonut=(CheckBox)findViewById(R.id.checkbox_donut);
        checkBoxPotato=(CheckBox)findViewById(R.id.checkbox_potato);
        buttonPost=(Button)findViewById(R.id.buttonPost);





        spinnerRice=(Spinner)findViewById(R.id.spinner_rice);
        spinnerDal=(Spinner)findViewById(R.id.spinner_dal);
        spinnerCurry=(Spinner)findViewById(R.id.spinner_curry);
        spinnerBread=(Spinner)findViewById(R.id.spinner_bread);
        spinnerDonut=(Spinner)findViewById(R.id.spinner_donut);
        spinnerPotato=(Spinner)findViewById(R.id.spinner_potato);

        spinnerRiceScale=(Spinner)findViewById(R.id.spinner_rice_scale);
        spinnerDalScale=(Spinner)findViewById(R.id.spinner_dal_scale);
        spinnerCurryScale=(Spinner)findViewById(R.id.spinner_curry_scale);
        spinnerBreadScale=(Spinner)findViewById(R.id.spinner_bread_scale);
        spinnerDonutScale=(Spinner)findViewById(R.id.spinner_donut_scale);
        spinnerPotatoScale=(Spinner)findViewById(R.id.spinner_potato_scale);

        ArrayAdapter<Integer> adapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item,num);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerRice.setAdapter(adapter);
        ArrayAdapter<Integer> adapter2 = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item,num);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerDal.setAdapter(adapter2);
        ArrayAdapter<Integer> adapter3 = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item,num);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCurry.setAdapter(adapter3);
        ArrayAdapter<Integer> adapter4 = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item,num);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerBread.setAdapter(adapter4);
        ArrayAdapter<Integer> adapter5 = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item,num);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerDonut.setAdapter(adapter5);
        ArrayAdapter<Integer> adapter6 = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item,num);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPotato.setAdapter(adapter6);



        ArrayAdapter<String> adapter7 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,scale);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerRiceScale.setAdapter(adapter7);
        ArrayAdapter<String> adapter8 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,scale);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerDalScale.setAdapter(adapter8);
        ArrayAdapter<String> adapter9 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,scale);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCurryScale.setAdapter(adapter9);
        ArrayAdapter<String> adapter10 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,scale);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerBreadScale.setAdapter(adapter10);
        ArrayAdapter<String> adapter11 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,scale);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerDonutScale.setAdapter(adapter11);
        ArrayAdapter<String> adapter12 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,scale);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPotatoScale.setAdapter(adapter12);

         final Integer rice= (Integer) spinnerRice.getSelectedItem();
        final Integer dal= (Integer) spinnerDal.getSelectedItem();
        final Integer curry= (Integer) spinnerCurry.getSelectedItem();
        final Integer bread= (Integer) spinnerBread.getSelectedItem();
        final Integer donut= (Integer) spinnerDonut.getSelectedItem();
        final Integer potato= (Integer) spinnerPotato.getSelectedItem();

        final String riceScale= (String) spinnerRiceScale.getSelectedItem();
        final String dalScale= (String) spinnerDalScale.getSelectedItem();
        final String curryScale= (String) spinnerCurryScale.getSelectedItem();
        final String breadScale= (String) spinnerBreadScale.getSelectedItem();
        final String donutScale= (String) spinnerDonutScale.getSelectedItem();
        final String potatoScale= (String) spinnerPotatoScale.getSelectedItem();

        checkBoxRice.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.e("TAG", "onCheckedChanged:1 " );
                spinnerRice.setVisibility(View.VISIBLE);
                spinnerRiceScale.setVisibility(View.VISIBLE);

                food=new Food();
                spinnerRice.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                        food.setFood("rice");
                        food.setQuantity(rice);
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                spinnerRiceScale.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        food.setScale(""+position);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                foodList.add(food);

            }
        });

        checkBoxDal.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                spinnerDal.setVisibility(View.VISIBLE);
                spinnerDalScale.setVisibility(View.VISIBLE);
                final Food food2=new Food();
                spinnerDal.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        Log.e("TAG", "onItemSelected: "+position );

                        food2.setFood("Dal");
                        food2.setQuantity(dal);
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                spinnerRiceScale.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        food2.setScale(dalScale);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                foodList.add(food2);

            }
        });

        checkBoxCurry.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                spinnerCurry.setVisibility(View.VISIBLE);
                spinnerCurryScale.setVisibility(View.VISIBLE);
                final Food food3=new Food();
                spinnerCurry.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        Log.e("TAG", "onItemSelected: "+position );

                        food3.setFood("Curry");
                        food3.setQuantity(curry);
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                spinnerRiceScale.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        food3.setScale(curryScale);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                foodList.add(food3);

            }
        });

        checkBoxBread.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                spinnerBread.setVisibility(View.VISIBLE);
                spinnerBreadScale.setVisibility(View.VISIBLE);
                final Food food4=new Food();
                spinnerBread.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        Log.e("TAG", "onItemSelected: "+position );

                        food4.setFood("bread");
                        food4.setQuantity(bread);
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                spinnerRiceScale.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        food4.setScale(breadScale);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                foodList.add(food4);

            }
        });

        checkBoxDonut.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                spinnerDonut.setVisibility(View.VISIBLE);
                spinnerDonutScale.setVisibility(View.VISIBLE);
                final Food food5=new Food();
                spinnerDonut.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        Log.e("TAG", "onItemSelected: "+position );

                        food5.setFood("donut");
                        food5.setQuantity(donut);
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                spinnerRiceScale.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        food5.setScale(donutScale);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                foodList.add(food5);

            }
        });

        checkBoxPotato.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                spinnerPotato.setVisibility(View.VISIBLE);
                spinnerPotatoScale.setVisibility(View.VISIBLE);
                final Food food6=new Food();
                spinnerPotato.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        Log.e("TAG", "onItemSelected: "+position );

                        food6.setFood("potato");
                        food6.setQuantity(potato);
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                spinnerRiceScale.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        food6.setScale(potatoScale);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                foodList.add(food6);

            }
        });

        buttonPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String foodString=new String();
                for (Food foo:foodList
                     ) {
//                    foodString=foodString+foo.getFood()+foo.getQuantity()+foo.getScale()+"\n";
                    foodString=foodString+foo.getFood()+" has been posted.";

                }
                Log.e("TAG", "onCreate:foodlist "+foodList.get(0).getQuantity() );
                Toast.makeText(HelpDetail.this, ""+foodString, Toast.LENGTH_SHORT).show();

            }
        });

    }
}
