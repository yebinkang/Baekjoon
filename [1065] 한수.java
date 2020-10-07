//문제출처: https://www.acmicpc.net/problem/1065

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count = 0;

        for(int i = 1; i <= num; i++){
            //1자리 수, 2자리 수 모두 한수로 취급한다.
            if(i < 100) count++;
            else if(i < 1000) {
                int a = i / 100;
                int b = (i % 100) / 10;
                int c = i % 10;
                if (a - b == b - c) count++;
            }
            //1000의 경우, 한수가 아니므로 count 수 증가 안 함.
        }
        System.out.println(count);
    }
}