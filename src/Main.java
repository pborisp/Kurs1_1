public class Main {

    public static StringBuilder doubleSymbol(String str) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            s.append(str.charAt(i));
            s.append(str.charAt(i));
        }
        return s;
    }

    public static String strCenter(String s1, String s2) {
        String str = new String();
        str = s1.substring(0, s1.length() / 2) + s2 + s1.substring(s1.length() / 2);
        return str;
    }

    public static String wrightFirstEnd(String a, String b) {
        String c = "";
        if (a.length() == 0) {
            c += "@";
        } else {
            c += a.charAt(0);
        }
        if (b.length() == 0) {
            c += "@";
        } else {
            c += b.charAt(b.length() - 1);
        }

        return c;
    }

    public static void main(String[] args) {
        // Задача №1;
        System.out.println("Задача №1");
        StringBuilder str = doubleSymbol("Дублирующий текст!!");
        System.out.println(str);
        System.out.println();

        //Задача №2
        System.out.println("Задача №2");
        String str2;
        str2 = strCenter("<<<>>>", "Привет мир!");
        System.out.println(str2);
        System.out.println();

        //Задача №3
        System.out.println("Задача №3");
        String aa, bb;
        aa = "1";
        bb = "Привет";
        System.out.println(wrightFirstEnd(aa, bb));
    }
}