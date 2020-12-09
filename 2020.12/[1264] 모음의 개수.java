import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();
        ArrayList<Integer> arr = new ArrayList<>();
        while(!(sentence.equals("#"))){
            int total = 0;
            for(int i = 0; i < sentence.length(); i++)
                switch (sentence.charAt(i)){
//                    case 'a', 'A', 'i', 'I', 'u', 'U', 'e', 'E', 'o', 'O' -> total++;
                    case 'a': case 'A':
                    case 'i': case 'I':
                    case 'u': case 'U':
                    case 'e': case 'E':
                    case 'o': case 'O':
                        total++;
                }
            arr.add(total);
            sentence = in.nextLine();
        }

        for(int x : arr)
            System.out.println(x);
    }

}