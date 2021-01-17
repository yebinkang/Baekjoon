import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        int i = n;

        while(i > 0) {
            for(int j = n - i; j > 0; j--)
                System.out.print(' ');
            for(int j = i; j > 0; j--)
                System.out.print('*');
            System.out.println();
            i--;
        }
    }
}