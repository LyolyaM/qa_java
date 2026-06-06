package com.example;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;



@ExtendWith(MockitoExtension.class)
public class LionMockTest {
    @Mock
    private Predator mockPredator;

    @Test
    void testGetKittensReturnsMockValue() throws Exception {
        when(mockPredator.getKittens()).thenReturn(7);

        Lion lion = new Lion("Самец", mockPredator);
        int kittens = lion.getKittens();

        assertEquals(7, kittens);
        verify(mockPredator, times(1)).getKittens();
    }

    @Test
    void testGetFoodReturnsMockValue() throws Exception {
        List<String> expectedFood = List.of("Антилопа", "Зебра");
        when(mockPredator.getFood("Хищник")).thenReturn(expectedFood);

        Lion lion = new Lion("Самка", mockPredator);
        List<String> food = lion.getFood();

        assertEquals(expectedFood, food);
        verify(mockPredator, times(1)).getFood("Хищник");
    }

    @Test
    void testGetKittensCallsPredatorMethod() throws Exception {
        Lion lion = new Lion("Самец", mockPredator);

        lion.getKittens();

        verify(mockPredator, atLeastOnce()).getKittens();
    }

    @Test
    void testGetFoodCallsPredatorWithCorrectParameter() throws Exception {
        Lion lion = new Lion("Самец", mockPredator);

        lion.getFood();

        verify(mockPredator, times(1)).getFood("Хищник");
    }
}



