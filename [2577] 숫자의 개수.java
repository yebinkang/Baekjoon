import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int mul = a * b * c;

        int[] arr = new int[10];
        for(int i = 0; i < 10; i++)
            arr[i] = 0;

        for(int num = mul; num != 0; num /= 10){
            int d = num % 10;
            arr[d]++;
        }

        for(int i = 0; i < 10; i++)
            System.out.println(arr[i]);
    }


}