import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String n = new Scanner(System.in).next();

        int[] arr = new int[n.length()];

        for(int i = 0; i < arr.length; i++)
            arr[i] = n.charAt(i) - 48;

        Arrays.sort(arr);

        for(int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i]);
    }
}