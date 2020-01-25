package com.otasher;

public class part3 {
//Основные числа:
//I - 1
//V - 5
//X - 10
//L - 50
//C - 100
//Ноль отсутствует вообще,поэтому будем использовать пустое значение

    // Основной метод преобразования из арабских в римские
    public static String convert(int in) {
        StringBuffer a = new StringBuffer("");

        // Выделяем сотни
        int c1 = in / 100;
        a.append(C(c1));
        // остаток из сотен
        int c2 = in % 100;

        // Выделяем полсотни
        int l1 = c2 / 50;
        a.append(L(l1));
        // остаток
        int l2 = c2 % 50;

        // Выделяем десятки
        int x1 = l2 / 10;
        a.append(X(x1));
        // остаток
        int x2 = l2 % 10;

        // Выделяем то что осталось
        a.append(basic(x2));
        return a.toString();
    }


    // преобразовываем целые сотни
    private static String C(int in) {
         if (in != 0) {
            StringBuffer a = new StringBuffer("");
            int i = 0;
            while (i < in) {
                a.append("C");
                i++;
            }
            return a.toString();
        }
        else return "";
    }

// целые десятки

    private static String X(int in) {
        if (in == 4) return "XL"; // если 40, то 50-10
        else if ((in != 0) && (in < 4)) {
            StringBuffer a = new StringBuffer("");
            int i = 0;
            while (i < in) {
                a.append("X");
                i++;
            }
            return a.toString();
        }
        else return "";
    }



    private static String L(int in) {
        if (in == 4) return "XC"; // если90 то100 - 10
       else if (in == 0) return "";
       else return "L";

    }
    // От 1 до 9, то что осталось
    private static String basic(int in) {
        String[] a = {
                "",
                "I",
                "II",
                "III",
                "IV",
                "V",
                "VI",
                "VII",
                "VIII",
                "IX"
        };
        return a[in];
    }

}
