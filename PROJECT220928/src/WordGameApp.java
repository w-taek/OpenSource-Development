import java.util.Scanner;

class Player {
    Scanner in = new Scanner(System.in);
    public String name;
    public String wordInput;

    public String Word() {
        wordInput = in.next();
        return wordInput;
    }

    public boolean check(char lastChar) {
        if (lastChar == wordInput.charAt(0)) {
            return true;
        } else {
            return false;
        }
    }
}

public class WordGameApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = "아버지";

        System.out.print("게임 참가 인원은? >> ");
        int playerCount = in.nextInt();

        Player[] play = new Player[playerCount];

        for (int i = 0; i < playerCount; ++i) {
            System.out.print("참가자의 이름 : ");
            play[i] = new Player();
            play[i].name = in.next();
        }

        System.out.println("시작 단어 : \"아버지\"");

        int i = 0;
        int j = 0;

        while (true) {
            j = i % playerCount;
            int lastIndex = word.length() - 1;
            char lastChar = word.charAt(lastIndex);

            System.out.print(play[j].name + " >> ");
            play[j].Word();
            boolean isRight = play[j].check(lastChar);
            if (!isRight) {
                System.out.println(play[j].name + "이 졌습니다.");
                break;
            }
            word = play[j].wordInput;
            ++i;
        }
    }
}