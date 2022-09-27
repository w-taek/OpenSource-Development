import java.util.Scanner;

public class Lab3Ex14 {
    public static void main(String[] args) {
        String course[]  = { "Java", "C++", "HTML5", "컴퓨터구조", "네트워크" };
        int score[] = {87, 88, 79, 98, 79 };
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("과목 이름>> ");
            String courseName = in.next();
            if (courseName.equals("그만")) {
                break;
            } else {
                for (int i = 0; i < course.length; ++i) {
                    if (courseName.equals(course[i])) {
                        System.out.printf("%s의 점수는 %d\n", course[i], score[i]);
                    }
                }
            }

        }
    }
}
