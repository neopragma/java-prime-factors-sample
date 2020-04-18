package com.neopragma.primefactors.step2.refactored;

import com.neopragma.primefactors.step2.pass.PrimeFactors;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeFactorsTest {

    // We saw a pattern emerging in the examples and converted the
    // individual test cases into a parameterized test.
    // Refactoring: Extract Method, but not a simple one that the IDE
    // could do automatically.

    @ParameterizedTest(name = "it returns the prime factors of the given integer")
    @MethodSource("primeFactorsDataProvider")
    void it_returns_the_prime_factors_of_an_integer(
            int inputValue, List<Integer> expectedPrimes) {
        assertEquals(expectedPrimes, PrimeFactors.of(inputValue));
    }

    private static Stream<Arguments> primeFactorsDataProvider() {
        return Stream.of(
                Arguments.of(1, List.of()),
                Arguments.of(2, List.of(2))
        );
    }

}
