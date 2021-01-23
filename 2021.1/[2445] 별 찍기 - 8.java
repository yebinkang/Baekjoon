import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        int o = 1;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < o;j++)
                System.out.print("*");
            for(int j = 0; j < 2 * (n - o); j++)
                System.out.print(" ");
            for(int j = 0; j < o;j++)
                System.out.print("*");
            System.out.println();
            o++;
        }

        o = n;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < o;j++)
                System.out.print("*");
            for(int j = 0; j < 2 * (n - o); j++)
                System.out.print(" ");
            for(int j = 0; j < o;j++)
                System.out.print("*");
            System.out.println();
            o--;
        }
    }
}