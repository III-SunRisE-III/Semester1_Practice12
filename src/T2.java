/*
Пользователь вводит описание ёлки.
В этом описании он вводит слово для поиска. Его нужно найти.
Если слово есть, то выводим индекс, с которого оно начинается,
иначе сказать, что его нет.
*/

import java.util.Scanner;

public class T2 {
    public static String solution(String word, String sentence) {
        int index = sentence.indexOf(word);
        if (index == -1) return "Слово не найдено";
        else return "Слово можно найти по индексу " + index;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String sentence = s.nextLine();
        String word = s.next();
        System.out.println(solution(word, sentence));
    }
}
