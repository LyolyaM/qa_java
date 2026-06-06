package com.example;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;



@ExtendWith(MockitoExtension.class)

public class CatMockTest {
    @Mock
    private Feline mockFeline;

    @Test
    void testGetSound() {
        Cat cat = new Cat(mockFeline);
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    void testGetFoodUsesEatMeat() throws Exception {
        List<String> expectedFood = List.of("Мышь", "Птица");
        when(mockFeline.eatMeat()).thenReturn(expectedFood);

        Cat cat = new Cat(mockFeline);
        List<String> result = cat.getFood();

        assertEquals(expectedFood, result);
        verify(mockFeline, times(1)).eatMeat();
    }
}

