package com.example.test_przyciski_radio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PodopowiedzActivity extends AppCompatActivity {
    Button powrotButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podopowiedz);

        powrotButton=findViewById(R.id.button3);
        powrotButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intencja = new Intent(PodopowiedzActivity.this,
                        MainActivity.class);
                //intencja jawna
                //wiadomo skad -> dokad
                startActivity(intencja);
            }
        });
    }



}