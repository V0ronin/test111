package h_w_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class DuplicateNumbers {
    public static void main(String[] args) {
        Random rand = new Random();
        HashMap<Integer, Integer> countries = new HashMap<>();


        ArrayList<Integer> numbers_name = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            numbers_name.add(rand.nextInt(50));
        }


        for (int number : numbers_name) {
            if (countries.containsKey(number)) {
                countries.put(number, (countries.get(number) + 1));
            } else {
                countries.put(number, 1);
//                для красоты я бы поставил тут ноль, но задание было сосчитать именно повторяющиеся цифры
            }
        }
        countries.forEach((num, gum) -> System.out.println("we have num " + num + ", " + gum + " times"));


    }
}