package com.example.growme.growme;

public class Sensor {
// return values from private variables are just to test the textfields in main menu window , they will be replaced with code that will request data from the arduino
    public String sensor(int index)
    {
        String sensor =null;

        if(index == 1)
        {
            sensor = temp();
        }

        if(index == 2)
        {
            sensor = waterPlant();
        }

        if(index == 3)
        {
            sensor = light();
        }

        if(index == 4)
        {
            sensor = moistureLevel();
        }



        return sensor;
    }

    private String temp()
    {
        String temp = "35";
        //code to request temp from arduino what will then be passed into temp variable what is returned to the main menu

        return temp;
    }

    private String waterPlant()
    {
        //code sent to arduino to water the plant

        String water="Plant has been watered";

        return water;
    }

    private String light()
    {
        //will request light status from aeduino if the arduino replies with a 1 then light is on , if the reply is a 0 = off
        int arduinoLight = 0;

        //code to request lightstatus from arduino
        String light="Plant";
        if(arduinoLight == 1)
        {
            light ="Light is on";
        }
        else{
            light ="Light is off";
        }


        return light;
    }
    private String moistureLevel()
    {
        String moistureLvl ="0%";
        //request moisture level from arduino then returns it

        return moistureLvl;

    }

    public void waterTime(int time)
    {
        //time will be sent to the arduino where it will wait till that certain time and then water that plant
    }

    public void lightTime(int time)
    {
        //time will be sent to the arduino where it will wait till that certain time and then water that plant
    }
}
