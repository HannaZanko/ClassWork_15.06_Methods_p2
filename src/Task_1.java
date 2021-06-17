import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        System.out.println(sumArray(sumArray(1, 2, 3, 4, 5, 6)));
    }
    static int sumArray(int... arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
