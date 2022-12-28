package h_w;

public class HomeWork2 {
    public static void main(String[] args) {
/*        task1
          part1
*/
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        double result = 0;
        long l = 20L;

        result = (i2 / d1 + d2 % i1 - l);
        System.out.println("result = " + result);

//        part2
        int a = 5;
        int b = 8;
        System.out.println(a-- - --a + ++a + a++ + a);
        System.out.println(++b - b++ + ++b - --b);

//        task2
        int x = 10;
        int y = 12;
        int z = 3;

        System.out.println(x += y - x++ * z);
        System.out.println(z = --x - y * 5);
        System.out.println(y /= x + 5 % z);
        System.out.println(z = x++ + y * 5);
        System.out.println(x = y - x++ * z);

    }

}
