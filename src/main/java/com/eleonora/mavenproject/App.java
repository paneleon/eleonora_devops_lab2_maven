package com.eleonora.mavenproject;

import java.util.Calendar;

public class App 
{
    public static void main( String[] args )
    {
        String name = "Eleonora";
        int timeOfDay = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);

        if(timeOfDay >= 0 && timeOfDay < 12){
        	System.out.printf("Good morning, %s! Welcome to COMP367.%n", name);
        } else if(timeOfDay >= 12 && timeOfDay < 17){
        	System.out.printf("Good afternoon, %s! Welcome to COMP367.%n", name);
        } else {
        	System.out.printf("Hello, %s! Welcome to COMP367.%n", name);
        }
    }
}
