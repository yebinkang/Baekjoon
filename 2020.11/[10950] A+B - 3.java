import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] output = new int[n];

        for(int i = 0; i < n; i++){
            int a = in.nextInt();
            int b = in.nextInt();

            output[i] = a + b;
        }

        for(int o : output)
            System.out.println(o);
    }
}