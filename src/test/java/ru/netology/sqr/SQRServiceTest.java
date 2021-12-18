package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'sqr is in range, boundaries not included', 110, 150, 2",
            "'sqr is in range, boundaries included', 100, 289, 8",
            "sqr is out of range, 1, 99, 0"})
    void shouldCount(String name, int min, int max, int expected) {
        SQRService counter = new SQRService();
        int actual = counter.count(min, max);
        assertEquals(expected, actual);
    }
}