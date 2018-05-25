package com.example.growme.growme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        //setting up all the required buttons
        Button moistureBtn= (Button) findViewById(R.id.moistureLevel);
        Button tempratureBtn= (Button) findViewById(R.id.temperatureStatus);
        Button waterPlantBtn= (Button) findViewById(R.id.waterStatus);
        Button lightBtn= (Button) findViewById(R.id.lightStatus);
        Button waterTimerBtn= (Button) findViewById(R.id.waterTimer);
        Button lightTimerBtn= (Button) findViewById(R.id.lightTimer);



        moistureBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //rights to request sensor data
                Sensor sensorData = new Sensor();

                //output window to show status of recorded moisture level
                TextView moistureViewWindow = (TextView) findViewById(R.id.moistureView);


                moistureViewWindow.setText(String.valueOf(sensorData.sensor(4)));
            }
        });

        tempratureBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //rights to request sensor data
                Sensor sensorData = new Sensor();

                TextView temperatureViewWindow = (TextView) findViewById(R.id.temperatureView);


                temperatureViewWindow.setText(String.valueOf(sensorData.sensor(1)));
            }
        });

        waterPlantBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //rights to request sensor data
                Sensor sensorData = new Sensor();

                TextView waterStatusViewWindow = (TextView) findViewById(R.id.waterStatusView);

                waterStatusViewWindow.setText(String.valueOf(sensorData.sensor(2)));

            }
        });

        lightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //rights to request sensor data
                Sensor sensorData = new Sensor();

                TextView lightStatusViewWindow = (TextView) findViewById(R.id.lightStatusView);

                lightStatusViewWindow.setText(String.valueOf(sensorData.sensor(3)));

            }
        });

        waterTimerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //sends the user to water timerclass in order to set light time
                Intent waterTimerIntent = new Intent(getApplicationContext(), WaterTimer.class);
                startActivity(waterTimerIntent);

            }
        });

        lightTimerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //sends the user to light timerclass in order to set light time

                Intent lightTimerIntent = new Intent(getApplicationContext(), lightTimer.class);
                startActivity(lightTimerIntent);

            }
        });

















    }
}
