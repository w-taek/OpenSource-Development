public class Lab3Ex02 {
    public static void main(String[] args) {
        int[][] n = new int[][] {
                { 1 },
                { 1, 2, 3 },
                { 1 },
                { 1, 2, 3, 4 },
                { 1, 2 }
        };

        for (int i = 0; i < n.length; ++i) {
            for (int j : n[i]) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
