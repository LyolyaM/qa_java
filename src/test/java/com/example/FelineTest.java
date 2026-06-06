package com.example;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;


class FelineTest {
    private final Feline feline = new Feline();

    @Test
    void testGetFamily() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    void testEatMeat() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, feline.eatMeat());
    }

    @Test
    void testGetKittensDefault() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    void testFelineIsPredator() {
        assertTrue(feline instanceof Predator);
    }
}


