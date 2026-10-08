/*
Пользователь вводит имена 2 снеговиков.
Узнать, кто выше, если количество букв в имени равно росту
*/

import java.util.Scanner;

public class T3 {
    public static String highest(String name1, String name2) {
        if (name1.length() > name2.length()) return "Первый выше";
        else if (name1.length() < name2.length()) return "Второй выше";
        else return "Их рост равен";
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String snmn1 = s.next();
        String snmn2 = s.next();
        System.out.println(highest(snmn1, snmn2));
    }
}
