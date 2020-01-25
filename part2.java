package com.otasher;

public class part2 {
    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    public static int getRome(String a){
        switch (a){
            case  "I" : return 1;
            case  "II" : return 2;
            case  "III" : return 3;
            case  "IV" : return 4;
            case  "V" : return 5;
            case  "VI" : return 6;
            case  "VII" : return 7;
            case  "VIII": return 8;
            case  "IX" : return 9;
            case  "X" : return 10;
            default: return 0;
        }
    }

    public static String amal(String a,int aNum, int bNum){
        switch (a) {
            case "+" : return Integer.toString(aNum+bNum);
            case "-" : return Integer.toString(aNum-bNum);
            case "*" : return Integer.toString(aNum*bNum);
            case "/" : return Double.toString((double)(aNum)/bNum);
            default: return Integer.toString(101);
        }

    }


}
