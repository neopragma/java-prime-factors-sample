package com.neopragma.primefactors.step1.fail;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeFactorsTest {

    // We know we want a static method to return the prime factors of an integer.
    // We think the name 'of' will be readable and understandable.
    // We haven't yet decided the best name for this test case.
    // We know the method must return a list of integers.
    // We expect this example to fail because the method returns null.

    @Test
    public void prime_factors_test() {
        assertEquals(new Object(), PrimeFactors.of(1));
    }
}
