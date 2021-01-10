package com.example.androidappezyfood;

import android.widget.ImageButton;

public class OrderList {
    String orderName;
    ImageButton image;
    int quantity;
    int price;


    public OrderList(String name, ImageButton image, int quantity, int price){
        this.orderName = name;
        this.quantity = quantity;
        this.image = image;
        this.price = price;
    }

    public String getOrderName() {
        return orderName;
    }

    public ImageButton getImage() {
        return image;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public void setImage(ImageButton image) {
        this.image = image;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}


