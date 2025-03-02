public class Main {

    public static StringBuilder doubleSymbol(String str) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            s.append(str.charAt(i));
            s.append(str.charAt(i));
        }
        return s;
    }

    public static void main(String[] args) {
        // Задача №1;
        System.out.println("Задача №1");
        StringBuilder str = doubleSymbol("Дублирующий текст!!");
        System.out.println(str);
    }
}