import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        System.out.println(factorial(n));
    }

    static int factorial(int n){
        if(n == 0) return 1;
        else return n * factorial(n-1);
    }
}