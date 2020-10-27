import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] remainder = new int[42];
        int[] numbers = new int[10];
        int total = 0;

        Arrays.fill(remainder, 0);
        for(int i = 0; i < numbers.length; i++)
            numbers[i] = in.nextInt();

        for (int n : numbers) {
            int r = n % 42;
            remainder[r]++;
        }

        for (int r : remainder) {
            if (r > 0) total++;
        }

        System.out.println(total);
    }


}