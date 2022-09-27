import java.util.Scanner;

public class Lab3Ex04 {
    public static void main(String[] args) {
        System.out.print("소문자 알파벳 하나를 입력하세요.");
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char c = s.charAt(0);

        for (char i = c; i >= 'a'; --i) {
            for (char j = 'a'; j <= i; ++j) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
