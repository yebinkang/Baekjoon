import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String sentence = new Scanner(System.in).nextLine();

        if(sentence.length() == 1 && sentence.charAt(0) == ' ') {
            // 문장이 공백 하나로만 이뤄진 경우, 단어 개수를 0으로 출력.
            System.out.println(0);
        }
        else {

            int count = 1;

            for (int i = 0; i < sentence.length(); i++) {
                //공백이 있을 때마다 단어 개수 하나씩 증가
                if (sentence.charAt(i) == ' ') {
                    //문자열의 맨 앞이나 맨 뒤가 공백일 경우, 단어 수를 증가시키지 않음.
                    if (i != 0 && i != sentence.length() - 1)
                        count++;
                }
            }

            System.out.println(count);
        }

    }
}