package com.example.intentdemo.intentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity { //extends means we are gathering info from something kown as "AppCompactActivity"

    // Creating our empty activity. Its like main method in Java
    @Override // Allows us to manipulate the onCreate function the way we want it.
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // super call is calling the constructor from the parent class.this is the first line always

        //calls the layout file and places it on the screen(design)
        setContentView(R.layout.activity_first); // taking the content from layout file & putting it on the view(screen)
    }

    public void initalizeButtonActivity(){
        //declare the button
        final Button btnListener = (Button) findViewById(R.id.btnlistener); // created the button object.

        // bridge between view and code. So, button on screen when clicked will work.
        btnListener.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){// passing the parameter of view to onClick
                Intent i = new Intent(FirstActivity.this, SecondActivity.class); //click this to open second screen. intend located here to go there.
                startActivity(i);
          }

        } );// close the parenthesis from the listener above, end the statement with a semicolon.
    }
    //easy way
    public void loadXMLClick(View view){
        Intent i = new Intent(FirstActivity.this, SecondActivity.class);
        startActivity (i);
    }

}












