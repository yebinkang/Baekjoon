import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int num2 = 0;
        int num5 = 0;

        for(int j = 2; j <= n; j++) {
            int k = j;
            int i = 2;
            while (k >= 2) {
                if (k % i == 0) {
                    k /= i;
                    if (i == 2) num2++;
                    else if (i == 5) num5++;
                } else i++;
            }
        }

        int count = 0;
        while(num2 > 0 && num5 > 0){
            count++;
            num2--;
            num5--;
        }
        System.out.println(count);

    }


}