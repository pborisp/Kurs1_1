package kurs_1_8;

public class k1_8 {

    public static int minOfTwo(int x, int y) {
        int c;
        if (x == y) {
            c = 0;
        } else if (x < y) {
            c = x;
        } else {
            c = y;
        }
        return c;
    }

    public static void main(String[] args) {
        // Задача №1
        System.out.println("Задача №1");
        int X = 7;
        int Y = 7;
        if (minOfTwo(X, Y) == 0) {
            System.out.println("Числа равны");
        } else {
            System.out.println(minOfTwo(X, Y));
        }
    }
}
