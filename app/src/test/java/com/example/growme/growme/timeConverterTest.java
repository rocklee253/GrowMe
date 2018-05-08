package com.example.growme.growme;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class timeConverterTest {

    @Test
    public void convertToSeconds()
    {
        int h = 1;
        int m = 0;
        int s = 0;
        int output = 0;


        //expected output of conversion
        int expected = 7200;

        //converts all  input time in previous window to seconds.
        output = h*3600;

        output += m * 60;

        output += s;



        timeConverter timeConverterTest = new timeConverter();

        output = timeConverterTest.convertToSeconds(h,m,s);

        assertEquals(expected, output);






    }
}