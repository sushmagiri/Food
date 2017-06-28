package com.example.root.spaceappproject;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FrontPage extends AppCompatActivity {
    ImageView help,about,eat,recycle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_page);

        help=(ImageView) findViewById(R.id.help1);
        about=(ImageView) findViewById(R.id.about1);
        eat=(ImageView) findViewById(R.id.eat1);
        recycle=(ImageView)findViewById(R.id.recycle1);

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(FrontPage.this);
                builder.setTitle("What do you want to donate?")
                        .setItems(R.array.choose, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                // The 'which' argument contains the index position
                                // of the selected item
                                switch (which){
                                    case 0:
                                        Intent intent=new Intent(FrontPage.this,HelpDetail.class);
                                        startActivity(intent);
                                        break;

                                    case 1:
                                        Intent intent2=new Intent(FrontPage.this,CompostDetail.class);
                                        startActivity(intent2);
                                        break;

                                }
                            }
                        });;

                AlertDialog dialog = builder.create();
                dialog.show();

            }
        });
        eat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FrontPage.this,MainActivity.class);
                startActivity(intent);
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FrontPage.this,AboutActivity.class);
                startActivity(intent);
            }
        });
        recycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FrontPage.this,CompostActivity.class);
                startActivity(intent);
            }
        });

    }
}
