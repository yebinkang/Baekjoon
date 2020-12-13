import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String n = new Scanner(System.in).next();
        char[] name = new char[n.length()];
        int[] counts = new int[26];
        int c = 0;
        int d = -1;
        for (int i = 0; i < n.length(); i++)
            name[i] = n.charAt(i);
        Arrays.sort(name);

        //팰린드롬 가능 여부 체크
        for (int i = 0; i < name.length; i++) {
            int count = 1;
            while (i != name.length - 1 && name[i] == name[i + 1]) {
                i++;
                count++;
            }
            if (count % 2 != 0) {
                c++;
                if (c > 1) break;
                else d = i;
            }
            counts[name[i]-65] = count;
        }

        char[] answer = new char[name.length];

        if (c > 1) System.out.println("I'm Sorry Hansoo");
        else{
            int j = 0;
            for(int i = 0; i < counts.length; i++){
                for(int k = 0; k < counts[i] / 2; k++, j++) {
                    answer[j] = (char) (i + 65);
                }
            }
            if(c == 1) answer[j++] = name[d];
            for(int i = counts.length - 1; i > -1; i--){
                for(int k = 0; k < counts[i] / 2; k++, j++)
                    answer[j] = (char)(i + 65);
            }
            for(char a : answer)
                System.out.print(a);
        }
    }

}