package h_w_5;

import java.util.ArrayList;
import java.util.HashMap;


public class NumbersName {
    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();


        ArrayList<String> names = new ArrayList<>();
        HashMap<Integer, String> total = new HashMap<>();

//


            for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        names.add("pasha");
        names.add("masha");
        names.add("dasha");
        names.add("lisa");
        names.add("sasha");
        names.add("gus");
        names.add("bus");
        names.add("kot");
        names.add("sonya");
        names.add("tima");

        for (int i = 0; i < 10; i++) {
            total.put(numbers.get(i) ,names.get(i));
        }
        total.forEach((num, name) -> System.out.println(num + "-" + name));


        }





        }





