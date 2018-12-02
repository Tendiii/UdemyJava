package Udemy.Variables;

public class Variables {
    public static void main(String[] args) {
/* - zmienne nie mogą posiadać w sobie pauzy, zastępuje się ją najczęściej "_"
     lub każdy następny człon nazwy zaczynamy od wielkiej litery
*  - zmienne zaczynamy definiować z małej litery
*  - nazwy zmiennych nie mogą zaczynac się od cyfry
*  - zmienne nie mogą nazywać się jak słowa kluczowe np.: byte */

//zmienne liczbowe
        byte max = 127;
        byte min = -128;
        int x = 52+88;
        short max1 = 32767;
        short min1 = -32768;
        int i = Integer.MAX_VALUE;
        Integer integer = 2;
        int s = i + 1;
        long l = Long.MAX_VALUE;
        Long l1 = 23l;

//Zmienne zmiennoprzecinkowe
        float f = Float.MAX_VALUE;
        float f1 = 1.1f;
        double d = Double.MAX_VALUE;
        double d1 = 0.0;

// Zmienne do przechowywania tekstu
        char c = 'a';
        String str = "Some text";

// Zmienne typu bolowskiego
        boolean b1 = true;
        boolean b2 = false;





        System.out.println(max);
        System.out.println(max1);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(str);
        System.out.println(b1);
        System.out.println(b2);

    }
}
