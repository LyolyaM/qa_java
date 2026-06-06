package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)

public class AlexTest {
    @Mock
    private Predator mockPredator;

    @Test
    void testAlexIsMale() throws Exception {
        Alex alex = new Alex(mockPredator);
        assertTrue(alex.doesHaveMane());
    }

    @Test
    void testGetFriends() throws Exception {
        Alex alex = new Alex(mockPredator);
        List<String> expectedFriends = List.of("Марти", "Глория", "Мелман");
        assertEquals(expectedFriends, alex.getFriends());
    }

    @Test
    void testGetPlaceOfLiving() throws Exception {
        Alex alex = new Alex(mockPredator);
        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    void testGetKittensReturnsZero() throws Exception {
        Alex alex = new Alex(mockPredator);
        assertEquals(0, alex.getKittens());
    }

    @Test
    void testAlexInheritsFromLion() throws Exception {
        Alex alex = new Alex(mockPredator);
        assertTrue(alex instanceof Lion);
    }
}

