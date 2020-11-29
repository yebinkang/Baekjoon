import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s = new Scanner(System.in).next();

        int n = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) - 65 > -1 && s.charAt(i) - 65 < 3)
                n += 3;
            else if(s.charAt(i) - 65 < 6)
                n += 4;
            else if(s.charAt(i) - 65 < 9)
                n += 5;
            else if(s.charAt(i) - 65 < 12)
                n += 6;
            else if(s.charAt(i) - 65 < 15)
                n += 7;
            else if(s.charAt(i) - 65 < 19)
                n += 8;
            else if(s.charAt(i) - 65 < 22)
                n += 9;
            else if(s.charAt(i) - 65 < 26)
                n += 10;
        }

        System.out.println(n);

    }

}