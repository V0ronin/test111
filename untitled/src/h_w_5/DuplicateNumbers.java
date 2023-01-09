package h_w_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class DuplicateNumbers {
    public static void main(String[] args) {
        Random rand = new Random();
        HashMap<Integer, Integer> counter = new HashMap<>();


        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            numbers.add(rand.nextInt(50));
        }


        for (int nomer : numbers) {
            if (counter.containsKey(nomer)) {
                counter.put(nomer, (counter.get(nomer) + 1));
            } else {
                counter.put(nomer, 1);
//                для красоты я бы поставил тут ноль, но задание было сосчитать именно повторяющиеся цифры
            }
        }
        counter.forEach((num, gum) -> System.out.println("we have num " + num + ", " + gum + " times"));


    }
}