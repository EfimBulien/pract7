package org.example;

import java.util.Arrays;

public class StringUtils {

    // 1. Метод для поиска слова с максимальным количеством буквы 'И'
    public static String findWordWithMostI(String sentence) {
        if (sentence == null) {
            throw new NullPointerException("Input string cannot be null");
        }
        if (sentence.isEmpty()) {
            return null;
        }

        String[] words = sentence.split("\\s+");
        String resultWord = "";
        int maxCount = 0;

        for (String word : words) {
            int count = (int) word.chars().filter(ch -> ch == 'И' || ch == 'и').count();
            if (count > maxCount) {
                maxCount = count;
                resultWord = word;
            }
        }
        return resultWord;
    }

    // 2. Метод для сравнения суммы значений по диагоналям двумерного массива
    public static int compareDiagonalSums(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return 0;

        int primarySum = 0, secondarySum = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            primarySum += matrix[i][i]; // Главная диагональ
            secondarySum += matrix[i][n - 1 - i]; // Побочная диагональ
        }
        return Math.max(primarySum, secondarySum);
    }

    // 3. Метод для возврата строки из первых букв слов в верхнем регистре
    public static String getInitialsUppercase(String sentence) {
        if (sentence == null || sentence.isEmpty()) return "";

        StringBuilder initials = new StringBuilder();
        Arrays.stream(sentence.split("\\s+"))
                .forEach(word -> initials.append(Character.toUpperCase(word.charAt(0))));
        return initials.toString();
    }
}

