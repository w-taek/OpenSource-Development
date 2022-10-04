import java.util.Scanner;

class Dictionary {
    private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
    private static String[] eng = {"love", "baby", "money", "future","hope"};

    public static String kor2Eng(String word) {
        for(int i=0; i<kor.length;i++) {
            if(word.equals(kor[i])) {
                if(i%2==0) {
                    System.out.print(word + "은 ");
                } else {
                    System.out.print(word + "는 ");
                }
                return eng[i];
            }
        }

        return "false";
    }
}

public class Lab04Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("한영 단어 검색 프로그램입니다.");

        while(true) {
            System.out.print("한글 단어?");
            String search = scanner.next();

            if(search.equals("그만")) {
                break;
            }
            String eng = Dictionary.kor2Eng(search);

            if(eng.equals("false")) {
                System.out.println(search + "는 저의 사전에 없습니다.");
            } else {
                System.out.println(eng);
            }
        }

        scanner.close();
    }

}