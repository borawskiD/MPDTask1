package com.company;

import java.util.Random;

public class Task1 {
    public void run(){
        long max =generateNum();
        long min = generateNum();
        long indexMax = max;
        long indexMin = min;
        max = function(max);
        min = function(min);
        if (max < min){
            long a = min;
            min = max;
            max = a;
            long b = indexMax;
            indexMax = indexMin;
            indexMin = b;
        }
        for(int i = 0; i<1000; i++){
            long num = generateNum();
            long value = function(num);
            if (value > max){
                max = value;
                indexMax = num;
            }
            else if (value < min){
                min = value;
                indexMin = num;
            }
        }
        System.out.println("Maksymalna wartosc: " + max + " dla x: " + indexMax);
        System.out.println("Minimalna wartosc: " + min + " dla x: " + indexMin);
    }
    int generateNum(){
        Random rand = new Random();
        return rand.ints(-100, 100)
                .findFirst()
                .getAsInt();
    }
    long function(long x){
        return x*x*x - 4*x*x + 3*x - 7;
    }
}
