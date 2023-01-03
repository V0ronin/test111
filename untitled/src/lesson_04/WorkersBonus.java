package lesson_04;

import java.util.Scanner;

public class WorkersBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("add Your salary:");
        double salary = input.nextDouble();
        System.out.println("add you exp of works:");
        double exp = input.nextDouble();
        if (exp <= 4 && exp >0) {
            System.out.println("you bonus = " + (salary / 100 * 10));
            System.out.println("you new salary = " + (salary + salary / 100 * 10));
        } else if (exp >= 5 && exp < 10) {
            System.out.println("you bonus = " + (salary / 100 * 15));
            System.out.println("you new salary = " + (salary + salary / 100 * 15));
        } else if (exp >= 10 && exp < 15) {
            System.out.println("you bonus = " + (salary / 100 * 25));
            System.out.println("you new salary = " + (salary + salary / 100 * 25));
        } else if (exp >= 15 && exp < 20) {
            System.out.println("you bonus = " + (salary / 100 * 35));
            System.out.println("you new salary = " + (salary + salary / 100 * 35));
        } else if (exp >= 20 && exp < 25) {
            System.out.println("you bonus = " + (salary / 100 * 45));
            System.out.println("you new salary = " + (salary + salary / 100 * 45));
        } else if (exp >= 25) {
            System.out.println("you bonus = " + (salary / 100 * 50));
            System.out.println("you new salary = " + (salary + salary / 100 * 50));
        } else {
            System.out.println("wrong data");

        }

    }
    }

