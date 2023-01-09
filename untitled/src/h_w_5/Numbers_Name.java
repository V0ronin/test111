package h_w_5;

import java.util.ArrayList;


public class Numbers_Name {
    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();


        ArrayList<String> name = new ArrayList<>();

        ArrayList<String> itog = new ArrayList<>();

        
            for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        name.add("pasha");
        name.add("masha");
        name.add("dasha");
        name.add("lisa");
        name.add("sasha");
        name.add("gus");
        name.add("bus");
        name.add("kot");
        name.add("sonya");
        name.add("tima");


        for (int i = 0; i < 10; i++) {
            itog.add(numbers.get(i) + "-" + name.get(i));}
        for (String s : itog) {
            System.out.println(s);
        }





        }

        }



