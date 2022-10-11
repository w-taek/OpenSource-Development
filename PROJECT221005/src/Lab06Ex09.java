import java.util.Scanner;

public class Lab06Ex09 {
    static int computerSelection() {
        return (int)(Math.random() * 3 + 1);
    }

    static String intToRSP(int i) {
        if (i == 1)
            return "가위";
        else if (i == 2)
            return "바위";
        else
            return "보";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("철수[가위(1), 바위(2), 보(3), 끝내기(4)>>");
            int select = sc.nextInt();
            if (select != 1 && select != 2 && select != 3) break;
            int computer = computerSelection();

            System.out.println("철수(" + intToRSP(select) + ") :  컴퓨터(" + intToRSP(computer) + ")");

            if (select == 1) {
                if (computer == 1) {
                    System.out.println("비겼습니다.");
                }
                else if (computer == 2) {
                    System.out.println("컴퓨터가 이겼습니다.");
                }
                else if (computer == 3) {
                    System.out.println("철수가 이겼습니다.");
                }
            }
            else if (select == 2) {
                if (computer == 1) {
                    System.out.println("철수가 이겼습니다.");
                }
                else if (computer == 2) {
                    System.out.println("비겼습니다.");
                }
                else if (computer == 3) {
                    System.out.println("컴퓨터가 이겼습니다.");
                }
            }
            else if (select == 3) {
                if (computer == 1) {
                    System.out.println("컴퓨터가 이겼습니다.");
                }
                else if (computer == 2) {
                    System.out.println("철수가 이겼습니다.");
                }
                else if (computer == 3) {
                    System.out.println("비겼습니다.");
                }
            }
        }
    }
}

