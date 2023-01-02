package lesson_03_01;

import java.util.Scanner;

public class UserInput_if {
    public static void main(String[] args) {
        String name;
        int age;
        double grade;
        Scanner input = new Scanner(System.in);


        System.out.println("pleas enter your name:");
        name = input.nextLine();
        System.out.println("pleas enter your age:");
        age = input.nextInt();




        System.out.println("pleas enter your grade");
        grade = input.nextDouble();


        if (name.equals("pasha")) {
            System.out.println("привет Паша");
        }
        else {System.out.println("Привет не Паша");
        }
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("grade = " + grade);

        System.out.println("Finished");
    }
}
