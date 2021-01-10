package com.example.androidappezyfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class Order extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<OrderList> listOrder;
    ItemArrayAdapter adapter;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        button = (Button) (findViewById(R.id.button));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

        listOrder = new ArrayList<OrderList>();

        adapter = new ItemArrayAdapter(this, listOrder);
        recyclerView = findViewById(R.id.list_item);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        for (int i = 0; i<100; i++) {
            listOrder.add(new OrderList(listOrder.get(i).getOrderName(), listOrder.get(i).getImage(), listOrder.get(i).quantity, listOrder.get(i).price));
        }
    }

    public void openActivity2(){
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
}