import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if(b >= c) System.out.println(-1);
        else{
            int n = a / (c-b);
            System.out.println(n+1);
        }
    }

}