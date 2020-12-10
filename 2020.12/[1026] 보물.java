import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = in.nextInt();
        Arrays.sort(a);

        int[] b = new int[n];

        for(int i = 0; i< n; i++)
            b[i] = in.nextInt();

        //b에서 이미 쓰인 최댓값을 저장하는 배열, c
        int[] c = new int[n];
        Arrays.fill(c, -1);

        //s의 최솟값 저장 변수, total
        int total = 0;

        for(int i = 0; i < n; i++){
            int bMax = -1;
            int bIndex = -1;

            //b에서 최댓값 구하기
            loop:
            for(int j = 0; j < n; j++){
                for(int k = 0; k < n; k++)
                    //이미 쓰인 최댓값일 경우, 계산 후보로 고려하지 않음
                    if(c[k] == j) continue loop;
                if(bMax < b[j]) {
                    bMax = b[j];
                    bIndex = j;
                }
            }
            total += a[i] * bMax;
            c[i] = bIndex;
        }

        System.out.println(total);

    }

}