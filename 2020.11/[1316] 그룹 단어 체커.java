import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int count = 0;

        for(int i = 0; i < n; i++) {
            boolean[] alphabet = new boolean[26];
            String word = in.next();
            alphabet[word.charAt(0)-97] = true; //a:97

            int j = 1;
            for(; j < word.length(); j++){
                //처음 나온 알파벳 종류일때 false를 true로 바꿈
                if(word.charAt(j-1) != word.charAt(j) && !alphabet[word.charAt(j)-97])
                    alphabet[word.charAt(j)-97] = true;

                //연속되지 않은 알파벳인데 이미 나온 종류일 때 break
                else if(word.charAt(j-1) != word.charAt(j) && alphabet[word.charAt(j)-97]) {
                    break;
                }
            }

            //끝까지 검사한 단어일 경우 그룹 단어 개수 증가
            if(j == word.length()) count++;
        }

        System.out.println(count);
    }
}