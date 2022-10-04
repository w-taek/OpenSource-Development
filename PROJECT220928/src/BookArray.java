import java.util.Scanner;

public class BookArray {
    public static void main(String[] args) {
        Book [] book = new Book[2];
        Scanner scanner = new Scanner(System.in);

        for (int i=0; i < book.length; i++) {
            System.out.print("제목>>");
            String title = scanner.nextLine();
            System.out.print("저자>>");
            String author = scanner.nextLine();

            book[i] = new Book(title, author);
        }
            for(int j=0; j<book.length; j++)
                System.out.print("(" + book[j].title + ", " + book[j].author + ")");
            scanner.close();
        }
    }