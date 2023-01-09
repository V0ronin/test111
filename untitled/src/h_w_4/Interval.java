package h_w_4;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("print your number:");
        int a = input.nextInt();
        if (a >=0 && a<=14) {
            System.out.println("interval is [0-14]");
        } else if (a >=15 && a<=35) {System.out.println("interval is [15-35]");
        } else if (a >=36 && a<=49) {System.out.println("interval is [36-49]");
        } else if (a >=50 && a<=100) {System.out.println("interval is [50-100]");
        } else System.out.println("miss interval");
    }
}
