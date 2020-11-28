public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10000];
        int i = 1;
        while(i <= 10000){
            if(d(i) > 10000) {
                i++;
                continue;
            }
            arr[d(i++) - 1]--;
        }
        for(int j = 0; j < arr.length; j++)
            if(arr[j] == 0) System.out.println(j + 1);
    }

    static int d(int n){
        return n / 10000 + n % 10000 / 1000 +
                n % 1000 / 100 +  n % 100 / 10 + n % 10 + n;
    }
}