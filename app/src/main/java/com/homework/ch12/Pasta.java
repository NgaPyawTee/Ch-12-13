package com.homework.ch12;

public class Pasta {
    private String name;
    private int imageID;

    public Pasta(String name, int imageID) {
        this.name = name;
        this.imageID = imageID;
    }

    public static final Pasta[] pastas = {
            new Pasta("Spaghtetti Bolognese",R.drawable.spaghtetti_bolognese_pasta),
            new Pasta("Lasagne",R.drawable.lasagne_pasta)
    };

    public String getName() {
        return name;
    }

    public int getImageID() {
        return imageID;
    }
}
