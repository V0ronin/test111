package h_w_5;

import java.util.HashMap;

public class Countries {
    public static void main(String[] args) {
        HashMap <String , String> countriesList = new HashMap<>();
        countriesList.put("Bahamas" ,"Nassau");
        countriesList.put("Bahrain" ,"Manama");
        countriesList.put("Bangladesh" ,"Dhaka");
        countriesList.put("Barbados" ,"Bridgetown");
        countriesList.put("Belarus" ,"Minsk");
        countriesList.put("Belgium" ,"Brussel");
        countriesList.put("Belize" ,"lmopan");
        countriesList.put("Benin" ,"Porto-Novo");
        countriesList.put("Bhutan" ,"Thimphu");
        countriesList.put("Bolivia" ,"Sucre");


        countriesList.forEach((countries, capitals) -> System.out.println(countries) );
        System.out.println();
        countriesList.forEach((countries, capitals) -> System.out.println(countries + " - " + capitals) );

        System.out.println();

        System.out.println(countriesList.containsKey("Belarus"));
        System.out.println(countriesList.containsKey("litva"));
        System.out.println(countriesList.containsValue("Dhaka"));
        System.out.println(countriesList.containsValue("Moscow"));
    }

}
