import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s = new Scanner(System.in).next();

        int n = 0; //계산 결과값 저장
        int index = 0;
        int part = 0; //+으로 이어진 수들을 더해서 저장
        int part2 = 0; //기호로 분리된 수들을 저장
        boolean first = true;

        while(index != s.length()) {
            //part 구하기
            while (index != s.length() && s.charAt(index) != '-') {
                if (s.charAt(index) == '+') { //+라면 지금까지 만들어진 part2를 part에 더함
                    part += part2;
                    part2 = 0;
                } else { //숫자라면 part2에 맨 뒷자리수로 추가
                    part2 *= 10;
                    part2 += s.charAt(index) - 48;
                }
                index++;
            }
            part += part2; //마지막으로 구해진 part2를 part에 더함

            if(first) { //가장 처음에 구한 part는 n에 더함
                n += part;
                first = false;
            }
            else n -= part; //n에서 part를 뺌

            if(index != s.length()) {
                //'-'여서 내부 while문이 종료된 경우, 이후에 다시 실행할 내부 while문을 위해 index+1, part와 part2 초기화
                index++;
                part = 0;
                part2 = 0;
            }
        }

        System.out.println(n);
    }


}