import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String w = new Scanner(System.in).next();
        int[] arr = new int[26];
        Arrays.fill(arr, -1);

        for(int i = w.length() - 1; i >= 0; i--){
            char alphabet = 'a';
            for(int j = 0; j < arr.length; j++) {
                if (w.charAt(i) == alphabet) arr[j] = i;
                alphabet++;
            }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

}