package com.homework.ch12;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class PizzaDetailActivity extends AppCompatActivity {

    public static final String EXTRA_PIZZA_ID = "pizzaID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_detail);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        int pizzaID = (int) getIntent().getExtras().get(EXTRA_PIZZA_ID);

        String pizzaName = Pizza.pizzas[pizzaID].getName();
        TextView textView = findViewById(R.id.pizza_text);
        textView.setText(pizzaName);

        int pizzaImage = Pizza.pizzas[pizzaID].getImageID();
        ImageView imageView = findViewById(R.id.pizza_image);
        imageView.setImageDrawable(ContextCompat.getDrawable(this,pizzaImage));
        imageView.setContentDescription(pizzaName);
    }
}