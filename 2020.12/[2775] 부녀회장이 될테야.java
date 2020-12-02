import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int cases = in.nextInt();
        int[] answer = new int[cases];
        for(int i = 0; i < cases; i++){
            int k = in.nextInt();
            int n = in.nextInt();

            //k는 0~k이므로 k+1개, n은 1~n이므로 n개
            int[][] arr = new int[k+1][n];

            for(int j = 0; j < n; j++)
                arr[0][j] = j+1;

            for(int a = 1; a < k+1; a++){
                int sum = 0;
                for(int b = 0; b < n; b++){
                    sum += arr[a-1][b];
                    arr[a][b] = sum;
                }
            }
            answer[i] = arr[k][n-1];
        }
        for(int a : answer)
            System.out.println(a);
    }


}