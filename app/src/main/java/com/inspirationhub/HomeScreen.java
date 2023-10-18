package com.inspirationhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HomeScreen extends AppCompatActivity {

    TextView hindi,english;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        hindi=findViewById(R.id.txtHindi);
        english=findViewById(R.id.txtEnglish);

        hindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHin = new Intent(HomeScreen.this,PeopleTypeHin.class);
                startActivity(intentHin);
            }
        });

        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentEng = new Intent(HomeScreen.this,PeopleTypeEng.class);
                startActivity(intentEng);
            }
        });


    }
}