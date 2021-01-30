import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        int k = n - 1;
        int l = 1;
        for(int i = 0; i < n - 1; i++) {
            for (int j = 0; j < k; j++)
                System.out.print(" ");
            for (int j = 0; j < l; j++)
                System.out.print("*");
            System.out.println();

            k--;
            l++;
        }

        k = 0;
        l = n;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < k; j++)
                System.out.print(" ");
            for(int j = 0; j < l; j++)
                System.out.print("*");
            System.out.println();

            k++;
            l--;
        }
    }
}
