package com.example.androidappezyfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {
    private Button menuUtama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        menuUtama = (Button) (findViewById(R.id.menuUtama));
        menuUtama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenuUtama();
            }
        });
    }

    public void openMenuUtama(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}