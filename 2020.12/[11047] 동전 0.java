import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] price = new int[n];
        for(int i = 0; i < price.length; i++)
            price[i] = in.nextInt();
        int m = 0;
        int count = 0;

        while(m < k){
            for(int i = price.length - 1; i >= 0; i--)
                if(m + price[i] <= k) {
                    m += price[i];
                    count++;
                    break;
                }
        }

        System.out.println(count);
    }
}