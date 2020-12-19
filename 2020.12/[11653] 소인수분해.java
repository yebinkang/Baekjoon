import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int i = 2;

        while(n >= 2){
            if(n % i == 0){
                System.out.println(i);
                n /= i;
            }
            else i++;
        }
    }
}