package com.otasher;

public class Main
 {
    private static part1 part = new part1();
    private static part2 port = new part2();
    private static part3 purt = new part3();
    public static void main(String[] args)
     {

        // Проверка на количество цифр
        if(part.e1 != 3) {
            System.out.println("Вы ввели неправильное количество цифр.");
            System.out.print("Программа завершена!");}

        else {
            // Проверка на Арабский
             if (!port.isNumeric(part.ddd[0]) || !port.isNumeric(part.ddd[2]))
                { part.proverkaNaSifr = true;

                // Проверка на Римский
                int aRim = port.getRome(part.ddd[0]);
                int bRim = port.getRome(part.ddd[2]);
                if (!(aRim == 0) && !(bRim == 0))
                    {
                        String natija = port.amal(part.ddd[1],aRim, bRim);
                     try{   if(natija == "101")
                            System.out.print("Ошибка при вводе знака!");
                        else{ String natija2 = purt.convert(Integer.parseInt(natija));
                            System.out.print(natija2);} }
                     catch (NumberFormatException e) {
                         System.out.print("В римских Цифрах нет дробных чисел");
                     }
                    }
                else
                    {
                        System.out.print("Ошибка при вводе чисел");
                    }
                 }
            try{
             if(part.proverkaNaSifr == false)
                {
                    int aNum = Integer.parseInt(part.ddd[0]);
                    int bNum = Integer.parseInt(part.ddd[2]);
                    if(aNum < 1 || aNum > 10 || bNum < 1 || bNum > 10)
                        {System.out.print("Ошибка при вводе чисел");}
                    else
                        {String natija = port.amal(part.ddd[1],aNum, bNum);
                        if(natija == "101")
                            System.out.print("Ошибка при вводе знака!");
                        else
                            System.out.print(natija);}
                } }
            catch (NumberFormatException e) {
                System.out.print("Ошибка при вводе чисел");
            }
             }

     }
 }
