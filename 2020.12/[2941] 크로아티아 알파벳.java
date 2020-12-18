import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s = new Scanner(System.in).next();

        int count = 0;

        for(int i = 0; i < s.length(); i++, count++){
            if(i != s.length() - 1) {
                switch (s.charAt(i)) {
                    case 'c':
                        if(s.charAt(i+1) == '=' || s.charAt(i+1) == '-') i++;
                        break;
                    case 'd':
                        if(s.charAt(i+1) == '-') i++;
                        else if(i+1 != s.length() - 1 && s.charAt(i+1) == 'z' && s.charAt(i+2) == '=')
                            i += 2;
                        break;
                    case 'l':
                    case 'n':
                        if(s.charAt(i+1) == 'j') i++;
                        break;
                    case 's':
                    case 'z':
                        if(s.charAt(i+1) == '=') i++;
                        break;

                }
            }
        }

        System.out.println(count);
    }
}