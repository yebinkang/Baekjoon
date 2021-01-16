import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int cases = in.nextInt();
        int[] answers = new int[cases];

        for(int i = 0; i < cases; i++) {
            int h = in.nextInt();
            in.nextInt();
            int n = in.nextInt();

            int f = 1;
            int y = 0;
            int x = 1;

            while (f < n) {
                f++;
                x += (y + 1) / h;
                y = (y + 1) % h;
            }

            answers[i] = (y + 1) * 100 + x;
        }

        for(int a : answers)
            System.out.println(a);

    }
}