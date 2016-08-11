package com.example.uidemo.uidemo;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.DialogInterface;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void createToastMsg(String msg) {
    //in the parameters is the String that was passed in the method displayToastMsg()
        Toast t = Toast.makeText(MainActivity.this ,msg, Toast.LENGTH_LONG);
        //.makeText(where it will display, String to display, length of String)
        //like an Intent, we have a Toast
        //a Toast is NOT an Intent
        t.show();
        //this will actually show the toast
        //show appears for a brief period of time while a view is there indefinitely
    }

    //this method is called from the XML for the Button btnToast
    public void displayToastMsg(View view) {
    //we always have to pass the view in the parameters
        createToastMsg("Toasted!");
        //we are calling a method that we are going to create
    }
    //this method is being called from XML
    public void exitAlertDialog (View view){
        //Alert dialogs have a lot of objects nested inside of it.
        AlertDialog.Builder b = new AlertDialog.Builder(MainActivity.this);

        //this method is called from the builder class which is attached to the Alert Dialog class.
        b.setTitle("Exit");

        b.setMessage("Are you sure you want to exit?");

        //Dialog Interface is a component of builder which also has a listener
        AlertDialog.Builder yes = b.setPositiveButton("yes", new DialogInterface.onClickListener() {
            //Anonymous class/method
            public void onClick(DialogInterface dialog, int which) {
                finish();// closes the application, finish is a reserved word for builder class

            }
        });
        b.setNegativeButton("No", null);
        AlertDialog alertDialog = b.create(); // this allows all builder elements to be placed together in a package
        alertDialog.show(); // this takes all the smaller builder components and show it as a whole package.
    }
        public void statusNotification(View view){
            NotificationCompat.Builder nBuilder = new NotificationCompat(this);
            nBuilder.setContentTitle ("New Notification!");
            nBuilder.setContentTitle ("You've got one!");
            nBuilder.setSmallIcon(android.R.drawable.star_on);

            //takes all lego blocks (nBuilder elements) and package them into a notification screen
            Notification notifications = nBuilder.build();

            //Calling a Service because notification run in the background until closed.
            NotificationManager nManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
            // Notifies
            nManager.notify(1, notification);

        }
}
