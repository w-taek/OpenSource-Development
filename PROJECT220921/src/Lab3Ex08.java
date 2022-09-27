import java.util.Arrays;
import java.util.Scanner;

public class Lab3Ex08 {
    public static void main(String[] args) {
        System.out.print("생성할 난수의 개수 : ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] randNum = new int[100];
        for (int i = 0; i < num; ++i) {
            randNum[i] = (int)(Math.random() * 100);
            while (isOverlap(i, randNum, randNum[i])) {
                randNum[i] = (int)(Math.random() * 100);
            }
        }
        printArrayToNum(randNum, num);
    }

    public static boolean isOverlap(int index, int[] arr, int num) {
        for (int i = 0; i < index; ++i) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static void printArrayToNum(int[] randNum, int num) {
        for (int i = 0; i < num; ++i) {
            if (i % 5 == 0) {
                System.out.println();
            }
            System.out.print(randNum[i] + " ");
        }
    }
}
