package com.example.growme.growme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class lightTimer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_light_timer);


        Button lightTimerSetButton = (Button) findViewById(R.id.lightSetBtn);

        lightTimerSetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sensor sensorData = new Sensor();
                timeConverter timeConverter = new timeConverter();
                EditText lightHours = (EditText) findViewById(R.id.lightHourTextField);
                EditText lightMinutes = (EditText) findViewById(R.id.lightMinTextField);
                EditText lightSeconds = (EditText) findViewById(R.id.lightSecTextField);
                TextView lightOutputWindow = (TextView) findViewById(R.id.lightTextOutput);


                // converting input from textboxes windows into ints
                int tempHours = Integer.parseInt(lightHours.getText().toString());
                int tempMins = Integer.parseInt(lightMinutes.getText().toString());
                int tempSecs= Integer.parseInt(lightSeconds.getText().toString());

                //validates input from user to insure not all values are zero
                if( tempHours == 0)
                {
                    if(tempMins == 0)
                    {
                        if(tempSecs == 0)
                        {
                            lightOutputWindow.setText(String.valueOf("Please enter a time"));
                        }
                    }
                }



                //validating that at least one variable is greater than zero
                if( tempHours > 0 || tempMins > 0 || tempSecs > 0)
                {

                    //time converter converts the time into seconds then sends it to the sensor class
                    sensorData.lightTime(timeConverter.convertToSeconds(tempHours,tempMins,tempSecs));






                    lightOutputWindow.setText(String.valueOf("Light time has been set"));
                }








            }
        });

        Button menu = (Button) findViewById(R.id.menuBtn2);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menuIntent = new Intent(getApplicationContext(), MainMenu.class);
                startActivity(menuIntent);
            }
        });

    }

}
