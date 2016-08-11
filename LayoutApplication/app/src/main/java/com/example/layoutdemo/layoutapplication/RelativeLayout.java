package com.example.layoutdemo.layoutapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RelativeLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);
    }
    public void GridLayout(View view) {
        Intent i = new Intent(this, GridLayout.class);
        startActivity(i);
    }
}
