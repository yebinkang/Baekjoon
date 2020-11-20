import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        int f = fib(n);

        System.out.println(f);
    }

    static int fib(int n){
        if(n == 0) return 0;
        else if(n == 1) return 1;
        else return fib(n-1) + fib(n-2);
    }
}