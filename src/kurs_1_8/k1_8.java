package kurs_1_8;

public class k1_8 {

    public static int minOfTwo(int x, int y) {
        int c;
        c = Math.min(x, y);
        return c;
    }

    public static void main(String[] args) {
        // Задача №1
        System.out.println("Задача №1");
        int X = 7;
        int Y = 1;
        System.out.println("Минимальное число: " + minOfTwo(X, Y));
        System.out.println();
    }
}
