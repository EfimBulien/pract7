package org.example;

public class Main {
    public static void main(String[] args) {
        // 1. Пример использования метода findWordWithMostI
        String sentence = "Игра идет интереснее, если есть интрига";
        try {
            String wordWithMostI = StringUtils.findWordWithMostI(sentence);
            System.out.println("Слово с максимальным количеством 'И': " + wordWithMostI);
        } catch (NullPointerException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // 2. Пример использования метода compareDiagonalSums
        int[][] matrix = {
                {3, 2, 1},
                {4, 5, 6},
                {7, 8, 9}
        };
        int maxDiagonalSum = StringUtils.compareDiagonalSums(matrix);
        System.out.println("Максимальная сумма диагоналей: " + maxDiagonalSum);

        // 3. Пример использования метода getInitialsUppercase
        String fullSentence = "java is amazing";
        String initials = StringUtils.getInitialsUppercase(fullSentence);
        System.out.println("Инициалы в верхнем регистре: " + initials);
    }
}
