package lesson6;


import java.util.Arrays;
import java.util.Random;

public class MaxMinArray {
    public static void main(String[] args) {
        Random random = new Random();

        double[] newArray = new double[10];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = random.nextDouble() * 100;
        }
        System.out.println(getMinValue(newArray));
        System.out.println(getMaxValue(newArray));
        System.out.println(getAvaRageValue(newArray));
    }


    public static double getMinValue(double[] myArray) {
        double min = Double.MAX_VALUE;

        for (double element : myArray)
            if (min > element) {
                min = element;
            }


        return min;
    }

    public static double getMaxValue(double[] myArray){
        Arrays.sort(myArray);
        return myArray[myArray.length -1];
    }
    public static double getAvaRageValue(double[]  myArray){
        double sum = 0;
        for (double number : myArray){
            sum += number;
        }
        return sum / myArray.length;
    }
}