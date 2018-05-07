package com.example.growme.growme;

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
                timeConverter waterTime = new timeConverter();
                EditText waterHours = (EditText) findViewById(R.id.waterHourTextField);
                EditText waterMinutes = (EditText) findViewById(R.id.waterMinTextField);
                EditText waterSeconds = (EditText) findViewById(R.id.waterSecTextField);
                TextView waterOutputWindow = (TextView) findViewById(R.id.waterTextOutput);
            // converting input from textboxes to an int
                int tempHours = Integer.parseInt(waterHours.getText().toString());
                int tempMins = Integer.parseInt(waterMinutes.getText().toString());
                int tempSecs= Integer.parseInt(waterSeconds.getText().toString());

//validating input to ensure that not all of the input values are not 0
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
                //sends verified time to time converter class
                waterTime.convertToSeconds(tempHours,tempMins,tempSecs);

                waterOutputWindow.setText(String.valueOf("Watering time has been set"));

                //instance of time class

                if( tempHours > 0 || tempMins > 0 || tempSecs > 0)
                {
                    //delays the water the plant command to arduino
                    android.os.SystemClock.sleep(waterTime.convertToSeconds(tempHours,tempMins,tempSecs));

                    //code for sending the water the plant command to the arduino




                    //displays the message in the text box signifying that the plant has been watered

                    waterOutputWindow.setText(String.valueOf("Watering time has been set"));
                }








            }
        });

    }
}
