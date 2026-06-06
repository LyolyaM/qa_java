package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;



@ExtendWith(MockitoExtension.class)
public class LionExceptionTest {
    @Mock
    private Predator mockPredator;

    @Test
    void testInvalidSexThrowsException() {
        assertThrows(Exception.class, () -> new Lion("Неизвестно", mockPredator));
    }

    @Test
    void testEmptySexThrowsException() {
        assertThrows(Exception.class, () -> new Lion("", mockPredator));
    }

    @Test
    void testNullSexThrowsException() {
        assertThrows(Exception.class, () -> new Lion(null, mockPredator));
    }
}

