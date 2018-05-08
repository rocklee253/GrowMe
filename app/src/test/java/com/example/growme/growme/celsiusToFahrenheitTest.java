package com.example.growme.growme;

import org.junit.Test;

import static org.junit.Assert.*;

public class celsiusToFahrenheitTest {

    @Test
    public void convertCtoF() throws Exception
    {
        float input = 30;
        float output;
        float expected = 86;
        float leeway = 1;


        celsiusToFahrenheit celsiusToFTest = new celsiusToFahrenheit();
        output = celsiusToFTest.convertCtoF(input);

        assertEquals(expected, output,leeway);



    }
}