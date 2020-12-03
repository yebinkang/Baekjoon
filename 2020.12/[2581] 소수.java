import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        int n = in.nextInt();
        int[] arr = new int[n-m + 1];
        int arrIndex = 0;
        int sum = 0;

        for(int i = m; i <= n; i++){

            int j = 2;
            for(;j < i; j++){
                //소수가 아닐 경우 반복문 탈출
                if(i % j == 0){
                    break;
                }
            }

            //소수인 경우(위 반복문이 i==j라서 탈출한 경우) 배열에 값 추가
            if(j == i){
                arr[arrIndex++] = i;
            }
        }

        for(int x : arr){
            if(x == 0)
                break;
            sum += x;
        }

        if(arr[0] == 0) System.out.println("-1");
        else{
            System.out.println(sum);
            System.out.println(arr[0]);
        }


    }

}