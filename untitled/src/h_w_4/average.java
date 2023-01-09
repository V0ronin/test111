package h_w_4;

public class average {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            count++;
        }
        double average = (double) sum / count;
        System.out.println("average = : " + average);

    }
}
