import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = 1;
        int answer = 1;
        while(n - k > 0) {
            k += 6 * answer;
            answer++;
        }

        System.out.println(answer);


    }
}