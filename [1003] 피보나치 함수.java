import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        String[] carr = new String[c];

        for(int j = 0; j < c; j++) {
            int n = in.nextInt();
            int[][] arr = new int[n + 1][2];
            for (int i = 0; i <= n; i++) {
                if (i == 0) {
                    arr[0][0] = 1;
                    arr[0][1] = 0;
                } else if (i == 1) {
                    arr[1][0] = 0;
                    arr[1][1] = 1;
                } else {
                    arr[i][0] = arr[i - 1][0] + arr[i - 2][0];
                    arr[i][1] = arr[i - 1][1] + arr[i - 2][1];
                }
            }
            carr[j] = arr[n][0] + " " + arr[n][1];
        }
        for(int i = 0; i < c; i++){
            System.out.println(carr[i]);
        }
    }
}