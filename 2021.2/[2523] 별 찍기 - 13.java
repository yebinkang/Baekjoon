import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        for(int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++)
                System.out.print("*");
            System.out.println();
        }
        for(int i = n; i > 0; i--){
            for(int j = i; j > 0; j--)
                System.out.print("*");
            System.out.println();
        }

    }
}
