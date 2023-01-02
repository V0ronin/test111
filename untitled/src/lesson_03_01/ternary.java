package lesson_03_01;

public class ternary {
    public static void main(String[] args) {

        int  a = 5;
        int  b = 5;
        int  c = 6;
        String result;

//        if (a == b) {
//            result = "a and b are equal";
//        }
//        else {
//            result = "a and b not equal";
//        }
        result = (a == b) ? "a and b are equal" : "a and b not equal";

        System.out.println("result = " + result);
    }
}
