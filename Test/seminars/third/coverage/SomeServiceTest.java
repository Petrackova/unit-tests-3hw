package seminars.third.coverage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SomeServiceTest {
    private SomeService someService;

    @BeforeEach
    void setUp() {
        someService = new SomeService();
    }

    @DisplayName("Проверка на четность")
    @Test
    void evenOddNumber() {
        assertTrue(someService.evenOddNumber(2));
        assertTrue(someService.evenOddNumber(100));
    }
    @DisplayName("Проверка на нечетность")
    @Test
    void noEvenOddNumber() {
        assertFalse(someService.evenOddNumber(1011));
        assertFalse(someService.evenOddNumber(1));
    }
    @DisplayName("Проверка на вхождение в интервал (25;100)")
    @Test
    void numberInInterval() {
        assertTrue(someService.numberInInterval(26));
        assertTrue(someService.numberInInterval(99));
        assertTrue(someService.numberInInterval(50));
        assertTrue(someService.numberInInterval(70));

    }
    @DisplayName("Проверка на не вхождение в интервал (25;100)")
    @Test
    void numberNotInInterval() {
        assertFalse(someService.numberInInterval(1));
        assertFalse(someService.numberInInterval(25));
        assertFalse(someService.numberInInterval(100));
        assertFalse(someService.numberInInterval(150));
    }
}