package com.neopragma.primefactors.step5.fail;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeFactorsTest {

    @ParameterizedTest(name = "it returns the prime factors of the given integer")
    @MethodSource("primeFactorsDataProvider")
    void it_returns_the_prime_factors_of_an_integer(
            int inputValue, List<Integer> expectedPrimes) {
        assertEquals(expectedPrimes, PrimeFactors.of(inputValue));
    }

    private static Stream<Arguments> primeFactorsDataProvider() {
        return Stream.of(
                Arguments.of(1, List.of()),
                Arguments.of(2, List.of(2)),
                Arguments.of(3, List.of(3)),
                Arguments.of(4, List.of(2, 2)),

        // We add the 5th example for the Prime Factors kata.
        // We expect it to pass because the prime factors of 6
        // follow the same pattern as those of 4.

        // As TDD practitioners, we are not comfortable with an
        // example that passes on the first try. So, we alter the
        // expected value in order to see that the example can fail
        // for the right reason.

                Arguments.of(6, List.of(2, 4)) // <- should be (2, 3)
        );
    }

}
