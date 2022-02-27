package com.homework.ch12;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class CreateOrder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_order);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void onClickedFAB(View view) {
        Snackbar snackbar = Snackbar.make(findViewById(R.id.coordinate_layout),"This is a snackbar",Snackbar.LENGTH_LONG);
        snackbar.setAction("undo", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CreateOrder.this,"Undone",Toast.LENGTH_SHORT).show();
            }
        });
        snackbar.show();
    }
}