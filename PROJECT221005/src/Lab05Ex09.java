import java.util.Scanner;

interface Stack {
    int length();
    int capacity();
    boolean push(String val);
    String pop();
}

class StringStack implements Stack {
    private String[] stack;
    private int size;
    private int capacity;

    public StringStack(int capacity) {
        this.stack = new String[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    public int length() {
        return this.size;
    }

    public int capacity() {
        return this.capacity;
    }

    public boolean push(String val) {
        if (size == capacity)
            return true;
        this.stack[size++] = val;
        return false;
    }

    public String pop() {
        if (size == 0)
            return "";

        return this.stack[--size];
    }
}

public class Lab05Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("총 스택 저장 공간의 크기 입력 >> ");
        int s = sc.nextInt();

        StringStack ss = new StringStack(s);

        while (true) {
            System.out.print("문자열 입력 >> ");
            String input = sc.next();
            if (input.equals("그만")) break;

            if (ss.push(input))
                System.out.println("스택이 꽉 차서 푸시 불가!");
        }

        System.out.print("스택에 저장된 모든 문자열 팝 : ");
        while (ss.length() != 0) {
            System.out.print(ss.pop() + " ");
        }
    }
}
