package com.example.growme.growme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WaterTimer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_timer);



        Button waterTimerSetButton = (Button) findViewById(R.id.waterSetBtn);

        waterTimerSetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sensor sensorData = new Sensor();
                timeConverter timeConverter = new timeConverter();
                EditText waterHours = (EditText) findViewById(R.id.waterHourTextField);
                EditText waterMinutes = (EditText) findViewById(R.id.lightMinTextField);
                EditText waterSeconds = (EditText) findViewById(R.id.lightSecTextField);
                TextView waterOutputWindow = (TextView) findViewById(R.id.lightTextOutput);


                 // converting input from textboxes windows into ints
                int tempHours = Integer.parseInt(waterHours.getText().toString());
                int tempMins = Integer.parseInt(waterMinutes.getText().toString());
                int tempSecs= Integer.parseInt(waterSeconds.getText().toString());

                //validates input from user to insure not all values are zero
                if( tempHours == 0)
                {
                    if(tempMins == 0)
                    {
                        if(tempSecs == 0)
                        {
                            waterOutputWindow.setText(String.valueOf("Please enter a time"));
                        }
                    }
                }



                //validating that at least one variable is greater than zero
                if( tempHours > 0 || tempMins > 0 || tempSecs > 0)
                {

                    //water timer converts the time into seconds then sends it to the sensor class
                    sensorData.waterTime(timeConverter.convertToSeconds(tempHours,tempMins,tempSecs));


                    //code for sending the water the plant command to the arduino





                    waterOutputWindow.setText(String.valueOf("Watering time has been set"));
                }








            }
        });

        Button menu = (Button) findViewById(R.id.menuBtn1);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menuIntent = new Intent(getApplicationContext(), MainMenu.class);
                startActivity(menuIntent);
            }
        });

    }
}
