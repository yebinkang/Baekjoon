import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input = new Scanner(System.in).next();

        int [] count = new int[26]; //문자 개수 저장

        for(int i = 0; i < input.length(); i++) {
            for (int j = 0; j < 26; j++) {
                //알파벳 대문자, 소문자 같을 경우 그 알파벳에 해당하는 count 배열값++
                if (((char)(65 + j) == input.charAt(i)) || ((char) (97 + j) == input.charAt(i))) {
                    count[j]++;
                }
            }
        }

        int max = 0;
        char a='?';

        for(int i = 0; i < count.length; i++){
            if(max < count[i]){
                max = count[i];
                a = (char)(65 + i);
            } else if((max != 0) && (max==count[i])){
                //최댓값이 같은 알파벳이 있을 경우 출력할 a 변수에 '?' 대입
                a = '?';
            }
        }

        System.out.println(a);
    }
}
