package h_w_6;

import java.util.Arrays;

public class AreArraysEqual {
    public static void main(String[] args) {
        int[] list1 = {1, 2, 3, 4, 5};
        int[] list2 = {1, 2, 3, 4, 5};

        System.out.println(check(list1, list2));
        System.out.println(check2(list1, list2));

    }

    public static boolean check(int[] list1, int[] list2) {
        return Arrays.equals(list1, list2);
    }

    public static boolean check2(int[] list1, int[] list2) {
        if (list1.length == list2.length) {
            for (int i = 0; i < list1.length; i++) {
                if (list1[i] != list2[i])
                    return false;
            }
            return true;
        } else {
            return false;

        }
    }
}


