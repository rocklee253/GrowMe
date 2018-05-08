package com.example.growme.growme;

public class timeConverter {
    private int totalTime = 0;
    public int convertToSeconds(int hour, int min, int sec)
    {
        int h = hour;
        int m = min;
        int s = sec;


       //converts all  input time in previous window to seconds.
            totalTime = h*3600;

            totalTime += m * 60;

            totalTime += s;

            return totalTime;



    }


}
