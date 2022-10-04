import java.util.Scanner;

class GradeSubject {
    private int math;
    private int science;
    private int english;
    GradeSubject(int math, int science, int english) {
        this.math = math;
        this.science = science;
        this.english = english;
    }

    public int average() {
        return (math + science + english) / 3;
    }
}

public class Lab04Ex02 {
    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);

        System.out.print("수학, 과학, 영어 순으로 점수 입력 : ");
        int math = inScanner.nextInt();
        int science = inScanner.nextInt();
        int english = inScanner.nextInt();

        GradeSubject mine = new GradeSubject(math, science, english);
        System.out.println("평균 : " + mine.average());

        inScanner.close();
    }
}
