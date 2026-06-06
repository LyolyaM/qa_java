package com.example;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;


class FelineParametrizedTest {
    private final Feline feline = new Feline();

    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "1, 1",
            "3, 3",
            "7, 7"
    })
    void testGetKittensWithCount(int input, int expected) {
        assertEquals(expected, feline.getKittens(input));
    }
}

