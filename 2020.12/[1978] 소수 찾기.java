import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int cases = in.nextInt();
        int count = 0;

        //소수가 아닌 경우 개수 세기
        for(int i = 0; i < cases; i++){
            int n = in.nextInt();
            if(n < 2) count++;

            for(int j = 2; j < n; j++){
                if(n % j == 0){
                    count++;
                    break;
                }
            }
        }

        System.out.println(cases - count);


    }

}