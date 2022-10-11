import java.util.Scanner;

enum Direction {
    HERE, LEFT, DOWN, UP, RIGHT
};

abstract class GameObject {
    protected int distance;
    protected int x, y;
    public GameObject(int startX, int startY, int distance) {
        this.x = startX;
        this.y = startY;
        this.distance = distance;
    }
    public int getX() { return x; }
    public int getY() { return y; }
    public boolean collide(GameObject p) {
        return (this.x == p.getX() && this.y == p.getY());
    }
    protected abstract void move();
    protected abstract char getShape();
}

class Bear extends GameObject {
    private Direction d;

    public Bear(int startX, int startY, int distance) {
        super(startX, startY, distance);
    }

    protected void move() {
        switch (d) {
            case LEFT:
                if (0 < y)
                    y--;
                break;
            case DOWN:
                if (x < 9)
                    x++;
                break;
            case UP:
                if (0 < x)
                    x--;
                break;
            case RIGHT:
                if (y < 19)
                    y++;
                break;
        }
    }

    public void moveTo(Direction d) {
        this.d = d;
        move();
    }

    protected char getShape() {
        return 'B';
    }
}

class Fish extends GameObject {
    Direction[] moves;
    int moveIndex;

    public Fish(int startX, int startY, int distance) {
        super(startX, startY, distance);
        resetMoves();
    }

    private void resetMoves()
    {
        moves = new Direction[5];
        for (int i = 0; i < 5; i++) {
            moves[i] = Direction.values()[(int)(Math.random() * 4) + 1];
        }
        int stayCount = 0;
        while (stayCount < 3) {
            int index = (int)(Math.random() * 5);
            if (moves[index] != Direction.HERE) {
                moves[index] = Direction.HERE;
                stayCount++;
            }
        }
        moveIndex = 0;
    }

    protected void move() {
        switch (moves[moveIndex]) {
            case LEFT:
                if (0 < y)
                    y--;
                break;
            case DOWN:
                if (x < 9)
                    x++;
                break;
            case UP:
                if (0 < x)
                    x--;
                break;
            case RIGHT:
                if (y < 19)
                    y++;
                break;
        }
    }

    public void moveSelf() {
        move();
        moveIndex++;
        if (5 <= moveIndex)
            resetMoves();
    }

    protected char getShape() {
        return '@';
    }
}

public class Challenge05 {
    static Bear bear;
    static Fish fish;

    static void printMap() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                if (bear.getX() == i && bear.getY() == j)
                    System.out.print(bear.getShape());
                else if (fish.getX() == i && fish.getY() == j)
                    System.out.print(fish.getShape());
                else
                    System.out.print('-');
            }
            System.out.println();
        }
    }

    static void printCommand() {
        System.out.print("왼쪽(a), 아래(s), 위(d), 오른쪽(f) >> ");
    }

    static Direction charToDirection(char c) {
        if (c == 'a')
            return Direction.LEFT;
        else if (c == 's')
            return Direction.DOWN;
        else if (c == 'd')
            return Direction.UP;
        else
            return Direction.RIGHT;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        bear = new Bear(0, 0, 1);
        fish = new Fish((int)(Math.random() * 10), (int)(Math.random() * 20), 1);


        System.out.println("** Bear의 Fish 먹기 게임을 시작합니다. **");
        while (true) {
            if (bear.collide(fish))
                break;

            printMap();
            printCommand();
            char cmd = sc.next().charAt(0);
            bear.moveTo(charToDirection(cmd));
            fish.moveSelf();
        }
        printMap();
        System.out.println("Bear Wins!!");
    }
}
