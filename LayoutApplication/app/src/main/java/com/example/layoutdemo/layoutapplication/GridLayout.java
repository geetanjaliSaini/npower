package com.example.layoutdemo.layoutapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GridLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);
    }
    public void LinearLayout(View view){
        Intent i = new Intent(GridLayout.this, LinearLayout.class);
        startActivity(i);
    }

    public void RelativeLayout(View view){
        Intent i = new Intent(GridLayout.this, RelativeLayout.class);
        startActivity(i);
    }

    public void TableLayout(View view){
        Intent i = new Intent(GridLayout.this, TableLayout.class);
        startActivity(i);
    }
    public void FrameLayout(View view){
        Intent i = new Intent(GridLayout.this, FrameLayout.class);
        startActivity(i);
    }
}
