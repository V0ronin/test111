package lesson6;

import java.util.Scanner;

public class IsNumberExists {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArray = {1, 2, 3, 4, 5};
        System.out.println("psl add");
        int number = input.nextInt();
        System.out.println(getCheck(number , myArray));
        System.out.println(getCheck2(number, myArray));

    }

    public static boolean getCheck(int myValue, int[] array) {
        for (int number : array) {
            if (myValue == number) {
                return true;
            }
        }
        return false;
    } public static boolean getCheck2(int myValue, int[] array) {
        for (int number : array) {
            if (myValue / 2 == number) {
                return true;
            }
        }
        return false;
    }


    }

