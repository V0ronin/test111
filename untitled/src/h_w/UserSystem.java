package h_w;

import java.util.Scanner;

public class UserSystem {
    public static void main(String[] args) {
        String username = "Admin";
        String password = "P@ssword";

        Scanner input = new Scanner(System.in);
        System.out.println("type your username");
        String name1try = input.next();
        if (username.equals(name1try)) {
            System.out.println("type your pass");
            String pass1try = input.next();
            if (pass1try.equals(password)) {
                System.out.println("hello " + name1try + ", you are in the system.");
            } else {
                System.out.println("wrong pass!!!");}
        }else System.out.println("wrong login");
    }
}
