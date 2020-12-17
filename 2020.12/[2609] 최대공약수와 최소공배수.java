import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        //최대공약수
        int a = 1;
        for (int i = 1; i <= Math.min(n, m); i++)
            if (n % i == 0 && m % i == 0) a = i;

        //최소공배수
        int b = n * m / a;
        System.out.println(a + " " + b);
    }
}