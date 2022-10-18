import java.util.*;
import java.util.Scanner;

class Word {
    private String eng;
    private String kor;
    public Word(String eng, String kor) {
        this.eng = eng;
        this.kor = kor;
    }
    public String getEng() {
        return eng;
    }
    public String getKor() {
        return kor;
    }
}

class Ex {
    int ex[] = {-1, -1, -1, -1};

    public Ex(int num, int size) {
        int answerNum = (int)(Math.random()*4);
        ex[answerNum] = num;
        for(int i=0; i<4; i++) {
            int n = (int)(Math.random()*size);
            if(ex[i]==-1) {
                ex[i] = n;
            }
            else continue;

            for(int j=0; j<4; j++) {
                if(i!=j && ex[j]==ex[i]) {
                    ex[i] = -1;
                    i--;
                }
                else continue;
            }
        }
    }
}

public class OpenChallenge {
    Scanner sc = new Scanner(System.in);
    Vector<Word> v = new Vector<Word>();
    private String name;

    public OpenChallenge(String name) {
        this.name = name;
        v.add(new Word("love", "사랑"));
        v.add(new Word("animal", "동물"));
        v.add(new Word("picture", "그림"));
        v.add(new Word("emotion", "감정"));
        v.add(new Word("baby", "아기"));
        v.add(new Word("error", "오류"));
        v.add(new Word("society", "사회"));
        v.add(new Word("doll", "인형"));
        v.add(new Word("bear", "곰"));
        v.add(new Word("example", "보기"));
        v.add(new Word("deal", "거래"));
        v.add(new Word("photo", "사진"));
        v.add(new Word("human", "인간"));
        v.add(new Word("statue", "조각상"));
        v.add(new Word("eye", "눈"));
        v.add(new Word("hand", "손"));
        v.add(new Word("ant", "개미"));
    }

    public void Run() {
        System.out.println("\"" + name + "\"" + "의 단어 태스트를 시작합니다. -1을 입력하면 종료합니다.");
        System.out.println("현재 " + v.size() + "의 단어가 들어있습니다.");
        Quiz();
    }

    public void Quiz() {
        while(true) {
            int num = (int)(Math.random()*v.size());
            String e = v.get(num).getEng();
            System.out.println(e + "?");

            Ex example = new Ex(num, v.size());
            for(int i=0; i<4; i++) {
                System.out.print("(" + (i+1) + ")" + v.get(example.ex[i]).getKor() + " :");
            }
            int sel = sc.nextInt();
            if(sel == -1) {
                System.out.println("\"" + name + "\"" + "을 종료합니다");
                return;
            }
            else if(example.ex[(sel-1)] == num)
                System.out.println("Excellent !!");
            else
                System.out.println("No. !!");
        }
    }

    public static void main(String[] args) {
        OpenChallenge wq = new OpenChallenge("영어퀴즈");
        wq.Run();
    }
}
