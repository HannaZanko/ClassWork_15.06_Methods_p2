import java.util.Arrays;

public class Task_5 {
    public static void main(String[] args) {
        Array(1,2,3,4,5,6);
    }
    static void Array (int ...arr){
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
