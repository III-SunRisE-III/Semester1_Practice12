/*
Пользователь вводит с клавиатуры рост снеговика
в сантиметрах. Вывести строку:
"Нос снеговика - х сантиметров"
х = рост / 5
*/

import java.util.Scanner;

public class T1 {
    public static String snowmanHeight(double length) {
        return "Нос снеговика - " + length / 5 + " см";
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(snowmanHeight(s.nextDouble()));
    }
}
