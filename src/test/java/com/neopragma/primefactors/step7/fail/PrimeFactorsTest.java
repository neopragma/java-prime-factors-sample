package com.neopragma.primefactors.step7.fail;

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
                Arguments.of(6, List.of(2, 3)),
                Arguments.of(8, List.of(2, 2, 2)),

        // We add the example for 9, the 7th step in the kata.
        // We expect it to fail because the logic currently starts
        // by extracting 2's from the input value.

                Arguments.of(9, List.of(3, 3))
        );
    }

}
