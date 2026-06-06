package com.example;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import com.example.Lion;
import com.example.Predator;


public class LionParametrizedTest {


        private static final Predator STUB_PREDATOR = new Predator() {
            @Override
            public List<String> eatMeat() throws Exception {
                return List.of();
            }
            @Override
            public List<String> getFood(String animalKind) throws Exception {
                return List.of();
            }
            @Override
            public int getKittens() {
                return 0;
            }
        };

        @ParameterizedTest
        @CsvSource({
                "Самец, true",
                "Самка, false"
        })
        void testDoesHaveMane(String sex, boolean expectedHasMane) throws Exception {
            Lion lion = new Lion(sex, STUB_PREDATOR);
            assertEquals(expectedHasMane, lion.doesHaveMane());
        }
    }

