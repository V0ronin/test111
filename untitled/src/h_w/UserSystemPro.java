package h_w;

import java.util.Scanner;

public class UserSystemPro {
    public static void main(String[] args) {
        String username = "Admin";
        String password = "Password";
        Scanner input = new Scanner(System.in);
        int i;
        for (i = 3; i > 0; i--) {

            System.out.println("print you username:");
            String nameInp = input.next();
            System.out.println("print you pass:");
            String pasInp = input.next();
            if (username.equalsIgnoreCase(nameInp) && password.equals(pasInp)) {
                System.out.println("welcome to system");
                break;
            } else System.out.println("attempts left " + (i - 1));
            
            continue;

        }
        if (i == 0) {
            System.out.println("Access denied");
        }
    }
}