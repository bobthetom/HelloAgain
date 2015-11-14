package com.robert_soulchin.helloagain;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    // onCreate is executed when the activity is created
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Sets the file activity_main.xml as the user interface
        setContentView(R.layout.activity_main);

        // To be able to edit the TextView with our code we have to create it and
        // bind it to a TextView object. I need to use final because it will be
        // used in the inner class below
        final TextView firstTextView = (TextView) findViewById(R.id.textView);

        // I set up the Button just like I did the TextView
        Button firstButton = (Button) findViewById(R.id.firstButton);

        // This is how you make the Button change the text in the TextView when it is clicked
        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                firstTextView.setText(R.string.NewButtonMsg);

            }
        });

        Button BobAndrewButton = (Button) findViewById(R.id.myOwnButton);
        BobAndrewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstTextView.setText(R.string.BobAndrewMsg);
            }
        });
    }

/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
   */
}
