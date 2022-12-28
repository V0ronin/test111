package lessom_03;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        String name;
        int age;
        double grade;
        Scanner input = new Scanner(System.in);


        System.out.println("pleas enter your name:");
        name = input.nextLine();
        System.out.println("pleas enter your age:");
        age = input.nextInt();


 /*       if (name.equals("")) {
            System.out.println("");}
        if (name.equals("")) {
            System.out.println("");}
  */

        System.out.println("pleas enter your grade");
        grade = input.nextDouble();

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("grade = " + grade);

        System.out.println("Finished");
    }
}
