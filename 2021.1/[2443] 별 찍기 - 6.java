import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        int m = 0;
        int o = 2 * n - 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++)
                System.out.print(" ");
            for(int j = 0; j < o; j++)
                System.out.print("*");
            System.out.println();
            m++;
            o -= 2;
        }
    }
}