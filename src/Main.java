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
        String str = "";
        str += s1.substring(0, s1.length() / 2) + s2 + s1.substring(s1.length() / 2);
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

    public static String changeEndSymbol(String str) {
        String s = "";
        s = str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);
        return s;
    }

    public static String changeEndSymbols2(String str) {
        char[] symbolString = str.toCharArray();
        char a = symbolString[str.length() - 2];
        symbolString[str.length() - 2] = symbolString[str.length() - 1];
        symbolString[str.length() - 1] = a;
        String rezult = new String(symbolString);
        return rezult;
    }

    public static int findWord(String text) {
        int count = 0;
        for (int i = 0; i < text.length() - 1; i++) {
            if (text.charAt(i) == 'h' && text.charAt(i + 1) == 'i') {
                count++;
            }
        }
        return count;
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

        //Задача №4
        System.out.println("Задача №4");
        String str4 = "Привет мир";
        System.out.println(changeEndSymbol(str4));
        System.out.println(changeEndSymbols2(str4));
        System.out.println();

        //Задча №5
        System.out.println("Задача №5");
        String sss = "sfdf hi ds dsddsd hisass jhh";
        System.out.println("слово ”hi” встречается в строке " + findWord(sss) + " раз(а)");
        System.out.println();
    }
}