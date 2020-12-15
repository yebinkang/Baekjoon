import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] time = new int[n];
        int total = 0;

        for(int i = 0; i < time.length; i++)
            time[i] = in.nextInt();

        Arrays.sort(time);

        for(int i = 0; i < time.length; i++){
            for(int j = 0; j <= i; j++)
                total += time[j];
        }

        System.out.println(total);
    }

}
