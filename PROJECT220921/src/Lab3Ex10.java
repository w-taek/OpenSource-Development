public class Lab3Ex10 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 10; ++i) {
            int randNum = (int)(Math.random() * 10);
            int x = 0;
            int y = 0;
            while (arr[x][y] != 0) {
                x = (int)((Math.random() * 10) % 4);
                y = (int)((Math.random() * 10) % 4);
            }
            arr[x][y] = randNum;
        }

        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
