import java.util.Scanner;

public class Lab3Ex12 {
    public static void main(String[] args) {
        double sum = 0.0f;
        for (int i = 0; i < args.length; ++i) {
            try {
                sum += Integer.valueOf(args[i]);
            } catch (NumberFormatException e) {
                sum += 0.0f;
            }
        }
        System.out.println("합 = " + sum);
    }
}
