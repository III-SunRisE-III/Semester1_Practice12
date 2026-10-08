/*
Пользователь вводит описание снеговика
и вводит искомую фразу (набор слов). Если она есть,
то вывести фразу и всё остальное до ближайшей точки, запятой,
восклицания или до конца строки. Иначе, сообщить.
*/

import java.util.Scanner;

public class T4 {
    public static int min(int[] arr) {
        int m = arr[0];
        for (int j : arr) {
            if ((m > j) && (j != -1)) m = j;
        }
        return m;
    }

    public static String solution(String sentence, String phrase) {
        int phraseIndex = sentence.indexOf(phrase);
        if (phraseIndex == -1) return "Фраза не найдена";
        else {
            int dotIndex = sentence.indexOf('.', phraseIndex);
            int commaIndex = sentence.indexOf('?', phraseIndex);
            int exclamationIndex = sentence.indexOf('!', phraseIndex);

            int mn = min(new int[]{dotIndex, commaIndex, exclamationIndex});

            if (mn == -1) return sentence.substring(phraseIndex);
            else return sentence.substring(phraseIndex, mn + 1);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String sentence = s.nextLine(), phrase = s.nextLine();
        System.out.println(solution(sentence, phrase));
    }
}
