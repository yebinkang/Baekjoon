import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[in.nextInt()];
        for(int i = 0; i < numbers.length; i++)
            numbers[i] = in.nextInt();

        for(int i = 1; i < numbers.length; i++){
            for(int j = 0; j < numbers.length - i; j++){
                if(numbers[j] > numbers[j+1]){
                    int tmp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = tmp;
                }
            }
        }
        for(int i = 0; i < numbers.length; i++)
            System.out.println(numbers[i]);
    }
}
