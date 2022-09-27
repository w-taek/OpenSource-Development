import java.util.Scanner;

public class Lab3Ex06 {
    public static void main(String[] args) {
        System.out.print("금액을 입력하세요.");
        Scanner in = new Scanner(System.in);
        int price = in.nextInt();
        int[] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };
        int[] result = new int[8];

        for (int i = 0; i < unit.length; ++i) {
            result[i] = price / unit[i];
            price = price % unit[i];
            if (result[i] != 0) {
                System.out.printf("%d원 짜리 : %d개%s", unit[i], result[i], System.lineSeparator());
            }
        }
    }
}
