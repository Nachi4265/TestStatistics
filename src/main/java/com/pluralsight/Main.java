package com.pluralsight;

import javax.crypto.spec.PSource;

public class Main {
    public static void main(String[] args) {

        //Array of test scores
        int[]testScores = {45,50,60,70,80,95,99};

        int highest= 0;
        int lowest = 100;
        int sum = 0;


        for( int testScore : testScores ){
            sum += testScore;
            highest = Math.max(highest,testScore);
            lowest = Math.min(lowest,testScore);
        }
        float average = (float) sum / testScores.length;
        System.out.println(average);
        System.out.println(lowest);
        System.out.println(highest);
        }




    }
