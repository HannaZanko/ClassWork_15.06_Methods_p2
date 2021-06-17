import java.util.Random;

public class Task_2 {
    public static void main(String[] args) {
        maxArray(10, 12, 3);
    }

    static void maxArray(int... arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        System.out.println(max);
    }
}