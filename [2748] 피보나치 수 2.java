import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = (new Scanner(System.in)).nextInt();

        long f0;
        long f1 = 1;
        long f2 = 1;

        for(int i = 3; i <= n; i++){
            f0 = f1;
            f1 = f2;
            f2 = f0 + f1;
        }

        System.out.println(f2);
    }

}