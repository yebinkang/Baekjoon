import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); //case 개수 입력

        int[] count = new int[n]; //반복 횟수 R 저장
        String[] input = new String[n]; //문자열 S 저장
        String[] output = new String[n]; //결과값 저장

        for(int i = 0; i < n; i++) {
            count[i] = in.nextInt();
            input[i] = in.next();
        }

        Arrays.fill(output, "");

        for(int i = 0; i < n; i++){
            for(int j = 0; j < input[i].length(); j++) // input 문자열 속의 문자 하나씩
                for(int k = 0; k < count[i]; k++) // 문자를 반복횟수만큼 문자열 끝에 추가
                    output[i] += input[i].charAt(j);
        }

        for(String o: output) //결과 출력
            System.out.println(o);
    }
}
