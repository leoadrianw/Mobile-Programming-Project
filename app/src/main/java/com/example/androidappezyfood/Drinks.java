package com.example.androidappezyfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;

public class Drinks extends AppCompatActivity {
    Button button;
    ImageButton waterButton;
    ImageButton coffeeButton;
    ImageButton orangeJuiceButton;
    ImageButton appleJuiceButton;
    ImageButton milkButton;
    ImageButton tomatoJuiceButton;
    ImageButton rootBeerButton;
    ImageButton colaButton;
    ArrayList<OrderList> listOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);

        waterButton = (ImageButton) findViewById(R.id.waterButton);
        coffeeButton = (ImageButton) findViewById(R.id.coffeeButton);
        orangeJuiceButton = (ImageButton) findViewById(R.id.orangeJuiceButton);
        appleJuiceButton = (ImageButton) findViewById(R.id.appleJuiceButton);
        milkButton = (ImageButton) findViewById(R.id.milkButton);
        tomatoJuiceButton = (ImageButton) findViewById(R.id.tomatoJuiceButton);
        rootBeerButton = (ImageButton) findViewById(R.id.rootBeerButton);
        colaButton = (ImageButton) findViewById(R.id.colaButton);

        listOrder = new ArrayList<>();

        final OrderList water = new OrderList("Water", waterButton, 0, 3000);
        listOrder.add(water);

        final OrderList coffee = new OrderList("Coffee", coffeeButton, 0, 6000);
        listOrder.add(coffee);

        final OrderList orangeJuice = new OrderList("Orange Juice", orangeJuiceButton, 0, 10000);
        listOrder.add(orangeJuice);

        final OrderList appleJuice = new OrderList("Apple Juice", appleJuiceButton, 0, 10000);
        listOrder.add(appleJuice);

        final OrderList milk = new OrderList("Milk", appleJuiceButton, 0, 7000);
        listOrder.add(milk);

        final OrderList tomatoJuice = new OrderList("Tomato Juice", tomatoJuiceButton, 0, 10000);
        listOrder.add(tomatoJuice);

        final OrderList rootBeer = new OrderList("Root Beer", rootBeerButton, 0, 10000);
        listOrder.add(rootBeer);

        final OrderList cola = new OrderList("Cola", colaButton, 0, 6000);
        listOrder.add(cola);

        button = (Button) (findViewById(R.id.button));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openActivity2();
            }
        });

        waterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listOrder.get(water.quantity).setQuantity(water.quantity+1);
                openOrder();
            }
        });
        coffeeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listOrder.get(coffee.quantity).setQuantity(coffee.quantity+1);
                openOrder();
            }
        });
        orangeJuiceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listOrder.get(orangeJuice.quantity).setQuantity(orangeJuice.quantity+1);
                openOrder();
            }
        });
        appleJuiceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listOrder.get(appleJuice.quantity).setQuantity(appleJuice.quantity+1);
                openOrder();
            }
        });
        milkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listOrder.get(milk.quantity).setQuantity(milk.quantity+1);
                openOrder();
            }
        });
        tomatoJuiceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listOrder.get(tomatoJuice.quantity).setQuantity(tomatoJuice.quantity+1);
                openOrder();
            }
        });
        rootBeerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listOrder.get(rootBeer.quantity).setQuantity(rootBeer.quantity+1);
                openOrder();
            }
        });
        colaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listOrder.get(cola.quantity).setQuantity(cola.quantity+1);
                openOrder();
            }
        });
    }

    public void openActivity2(){
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }

    public void openOrder(){
        Intent intent = new Intent(this, Order.class);
        startActivity(intent);
    }


}