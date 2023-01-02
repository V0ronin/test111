package h_w;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;

        Scanner input = new Scanner(System.in);

        System.out.println("enter 1 num");
        a = input.nextInt();
        System.out.println("enter 2 num");
        b = input.nextInt();
        System.out.println("enter 3 num");
        c = input.nextInt();

        if (a > b & a > c) {
            System.out.println("more big is  = " + a);
        } else if (b > a & b > c) {
            System.out.println("more big is  = " + b);
        } else if (c>a & c>b) {
            System.out.println("more big is " + c);
        } else {
            System.out.println("num is same");
        }
        System.out.println("average is " + (a + b +c)/3 );


    }


}
