package com.neopragma.primefactors.step4.fail;

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

        // We add the fourth example for the Prime Factors kata.
        // We expect this to fail because PrimeFactors.of() returns
        // a list containing just the original input value, so in
        // this case it will return a list containing 4.

                Arguments.of(4, List.of(2, 2))
        );
    }

}
