package com.example.growme.growme;

public class celsiusToFahrenheit
{
    private float fahrenheit = 0;

    public float convertCtoF(float celsius)
    {
        float tempCelsius = celsius;

        //conerts  celsius to fahrenheit
        fahrenheit = (celsius * (float)1.8+32);

        return fahrenheit;

    }


}
