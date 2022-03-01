package com.homework.ch12;

public class Pizza {
    private String name;
    private int imageID;

    public static final Pizza[] pizzas = {
            new Pizza("Diavolo",R.drawable.diavolo_pizza),
            new Pizza("Funghi",R.drawable.funghi_pizza)
    };

    public String getName() {
        return name;
    }

    public int getImageID() {
        return imageID;
    }

    public Pizza(String name, int imageID) {
        this.name = name;
        this.imageID = imageID;
    }
}
