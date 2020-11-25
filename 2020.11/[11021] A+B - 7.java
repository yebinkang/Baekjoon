import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            int a = in.nextInt();
            int b = in.nextInt();

            arr[i] = a + b;
        }

        for(int i = 0; i < arr.length; i++)
            System.out.println("Case #" + (i + 1) + ": " + arr[i]);
    }
}