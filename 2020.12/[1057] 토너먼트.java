import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Player a = new Player(in.nextInt());
        Player b = new Player(in.nextInt());
        int nowRound = 1;
        int maxRound = 1;

        for (int i = 1; n > Math.pow(2, i); i++) {
            maxRound++;
        }

        while (nowRound <= maxRound && !a.fight(b.number)) {
            a.number = (a.number + 1) / 2;
            b.number = (b.number + 1) / 2;
            nowRound++;
        }

        System.out.println(nowRound);
    }

}

class Player {
    int number;

    public Player(int number) {
        this.number = number;
    }

    boolean fight(int number) {
        return (this.number + 1) / 2 == (number + 1) / 2;
    }
}