import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[] cards = new int[n];

        for(int i = 0; i < n; i++)
            cards[i] = in.nextInt();

        int max = -1;

        for(int i = 0; i < n-2 ; i++)
            for(int j = i+1; j < n-1; j++)
                for(int k = j+1; k < n; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    if(sum <= m && sum > max) max = sum;
                };

        System.out.println(max);
    }
}