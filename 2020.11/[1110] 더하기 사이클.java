import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        int a = n/10;
        int b = n%10;
        int m;
        int cycle = 0;

        do{
            m = a + b;
            m = b * 10 + m % 10;
            a = m / 10;
            b = m % 10;
            cycle++;
        }while(n != m);

        System.out.println(cycle);
    }
}
