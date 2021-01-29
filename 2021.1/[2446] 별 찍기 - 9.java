import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        int o = 2 * n - 1;
        int m = 0;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < m; j++)
                System.out.print(" ");
            for(int j = o; j > 0; j--)
                System.out.print("*");
            System.out.println();
            o -= 2;
            m++;
        }

        o = 1;
        m = n - 1;
        for(int i = 0; i < n; i++){
            for(int j = m; j > 0; j--)
                System.out.print(" ");
            for(int j = 0; j < o; j++)
                System.out.print("*");
            System.out.println();
            o += 2;
            m--;
        }
    }
}