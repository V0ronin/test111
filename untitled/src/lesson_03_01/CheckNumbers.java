package lesson_03_01;

import java.util.Scanner;

public class CheckNumbers {
    public static void main(String[] args) {
        int number;
        Scanner  input = new Scanner(System.in);

        System.out.println("enter your number:");
        number = input.nextInt();
        if (number % 2 ==0 ){
            System.out.println("num " + number + " even");
        }
        else {
            System.out.println("num " + number + " od");
        }
    }
}
