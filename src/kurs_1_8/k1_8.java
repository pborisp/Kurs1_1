package kurs_1_8;

public class k1_8 {

    public static int minOfTwo(int x, int y) {
        int c;
        c = Math.min(x, y);
        return c;
    }

    public static void chetNum(int x) {
        if (x % 2 == 0) {
            System.out.println("Число " + x + " является четным");
        } else {
            System.out.println("Число " + x + " является нечетным");
        }
    }

    public static int kvadrat(int X) {
        return X *= X;
    }

    public static long kub(int X) {
        return (long) Math.pow(X, 3);
    }

    public static boolean Task5(int X) {
        return X >= 10;
    }

    public static void main(String[] args) {
        // Задача №1
        System.out.println("Задача №1");
        int X = 7;
        int Y = 1;
        System.out.println("Минимальное число: " + minOfTwo(X, Y));
        System.out.println();

        // Задача №2,3,4
        System.out.println("Задача №2,3,4");
        int x1 = 3;
        chetNum(x1);
        System.out.println(kvadrat(x1));
        System.out.println(kub(x1));
        System.out.println(Task5(x1));
    }
}
