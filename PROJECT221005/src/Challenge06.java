//6장 Open Challenge

import java.util.Scanner;

public class Challenge06 {
    static int[] alphabetCount;

    static String readString() {
        StringBuffer sb = new StringBuffer();
        Scanner sc = new Scanner(System.in);

        while (true) {
            String line = sc.nextLine();
            if (line.equals(";"))
                break;
            sb.append(line);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        alphabetCount = new int[26];
        for (int i = 0; i < 26; i++)
            alphabetCount[i] = 0;

        System.out.println("영문 텍스트를 입력하고 세미콜론을 입력하세요.");

        String input = readString();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isAlphabetic(input.charAt(i))) {
                alphabetCount[Character.toLowerCase(input.charAt(i)) - 'a']++;
            }
        }

        System.out.println("히스토그램을 그립니다.");
        for (int i = 0; i < 26; i++) {
            System.out.print((char)('A' + i));
            for (int j = 0; j < alphabetCount[i]; j++)
                System.out.print('-');
            System.out.println();
        }
    }
}
