import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n =  in.nextInt(); //case 개수
        double[] c = new double[n]; //case 당 결과값

        for(int i = 0; i < n; i++){
            int m = in.nextInt(); //학생 수
            int[] arr = new int[m]; //학생들 점수
            int ave = 0;

            for(int j = 0; j < m; j++){
                arr[j] = in.nextInt();
                ave += arr[j];
            }
            ave /= (double)m; //점수 평균 계산

            for(int j = 0; j < m; j++){
                if (arr[j] > ave){
                    c[i]++; //평균보다 높은 학생 수 세기
                }
            }
            c[i] = (c[i] / m) * 100; //평균보다 높은 학생 비율 계산
        }

        for (double x: c) {
            System.out.printf("%.3f%%\n", x); //소수점 3자리까지 출력
        }
    }
}