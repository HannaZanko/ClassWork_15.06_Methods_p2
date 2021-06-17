public class Task_3 {
    public static void main(String[] args) {
        Array(1, 2, 3, 4, -2, -8, 0);
    }

    static void Array(int... arr) {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) a++;
            else b++;
            if (arr[i] > 0) c++;
            if (arr[i] < 0) d++;
        }
        System.out.println("Количество четных : " + a);
        System.out.println("Количество нечетных : " + b);
        System.out.println("Количество положительных : " + c);
        System.out.println("Количество отрицательных : " + d);

    }
}
