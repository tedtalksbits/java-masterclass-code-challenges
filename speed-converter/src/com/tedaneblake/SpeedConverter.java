package com.tedaneblake;

public class SpeedConverter {

    public static long toMilesPerHour(double km){

        if(km < 0) {
            return -1;
        }
        return (long)Math.ceil(0.62137119 * km);
    }

    public static void printConversion(double km){
        if(km < 0){
            System.out.println("Invalid Value");
        }
        System.out.println(km + " km/h = " + toMilesPerHour(km) + " mi/h");
    }
}
