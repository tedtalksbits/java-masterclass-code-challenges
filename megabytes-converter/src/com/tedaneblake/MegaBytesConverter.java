package com.tedaneblake;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kb){
        double mb = 1024;
        int mbInKb = (int) Math.floor(kb/mb);
        double remainder = kb % mb;


        if(kb < 0){
            System.out.println("Invalid Value");
        }
        else{

            System.out.println(kb + " KB = "+ mbInKb +" MB and "+ (int) remainder + " KB");
        }

    }
}
