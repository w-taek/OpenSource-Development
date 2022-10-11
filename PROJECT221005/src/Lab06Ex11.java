import java.util.Scanner;

public class Lab06Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(">>");
        String input = sc.nextLine();
        StringBuffer sb = new StringBuffer(input);

        while (true) {
            System.out.print("명령: ");
            String command = sc.nextLine();
            if (command.equals("그만")) break;

            String[] arguments = command.split("!");
            if (arguments.length != 2 || arguments[0].equals("") || arguments[0].equals(arguments[1])) {
                System.out.println("잘못된 명령입니다!");
                continue;
            }

            if (sb.indexOf(arguments[0]) == -1) {
                System.out.println("찾을 수 없습니다!");
                continue;
            }

            while (sb.indexOf(arguments[0]) != -1) {
                sb.replace(sb.indexOf(arguments[0]), sb.indexOf(arguments[0]) + arguments[0].length(),
                        arguments[1]);
            }

            System.out.println(sb.toString());
        }
    }
}
