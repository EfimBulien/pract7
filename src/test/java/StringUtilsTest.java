import org.example.StringUtils;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.time.Duration;

public class StringUtilsTest {

    @BeforeEach
    void setUp() {
        System.out.println("Начало теста...");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Завершение теста...");
    }

    @Test
    @DisplayName("Тест: Поиск слова с максимальным количеством 'И'")
    void testFindWordWithMostI() {
        String sentence = "Индийский тигр сидит на Иве";
        assertEquals("Индийский", StringUtils.findWordWithMostI(sentence));

        sentence = "и и и";
        assertEquals("и", StringUtils.findWordWithMostI(sentence));

        assertNull(StringUtils.findWordWithMostI(""));
    }

    @Test
    @DisplayName("Тест: Сравнение диагональных сумм в матрице")
    void testCompareDiagonalSums() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        assertEquals(15, StringUtils.compareDiagonalSums(matrix));

        matrix = new int[][]{
                {10, 2, 3},
                {4, 10, 6},
                {7, 8, 10}
        };
        assertEquals(30, StringUtils.compareDiagonalSums(matrix));
    }

    @ParameterizedTest
    @DisplayName("Параметризованный тест: Первые буквы слов в верхнем регистре")
    @CsvSource({
            "'java junit тестирование', 'JJТ'",
            "'hello world', 'HW'",
            "'', ''"
    })
    void testGetInitialsUppercase(String input, String expected) {
        assertEquals(expected, StringUtils.getInitialsUppercase(input));
    }

    @Test
    @DisplayName("assertTimeout: Проверка времени выполнения")
    void testTimeout() {
        assertTimeout(Duration.ofMillis(100), () -> {
            // Эмуляция метода
            Thread.sleep(50);
            StringUtils.getInitialsUppercase("java junit тестирование");
        });
    }

    @Test
    @DisplayName("assertThrows: Проверка исключений")
    void testException() {
        Exception exception = assertThrows(NullPointerException.class, () ->
                StringUtils.findWordWithMostI(null));
        assertEquals("Input string cannot be null", exception.getMessage());
    }
}
