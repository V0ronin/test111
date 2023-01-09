package h_w_5;

import java.util.ArrayList;
import java.util.Random;

public class DuplicateNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            numbers.add(random.nextInt(50), +1);
            System.out.println("numbers = " + numbers);

        }


    }
}
