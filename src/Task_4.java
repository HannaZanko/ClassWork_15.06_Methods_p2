import java.util.Arrays;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        boolean b = new Scanner(System.in).nextBoolean();
        Array(b, 10, 8, -2, 9, 16, -101, 38);
    }

    static void Array(boolean b, int... arr) {
        if (b) {
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
        } else {
            Arrays.sort(arr);
            int i = 0;
            int j = arr.length - 1;
            int p;
            while (j > i) {
                p = arr[i];
                arr[i] = arr[j];
                arr[j] = p;
                i++;
                j--;
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
