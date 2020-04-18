package com.neopragma.primefactors.step2.fail;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeFactorsTest {

    @Test
    public void prime_factors_of_1_are_an_empty_list() {
        assertEquals(new ArrayList<Integer>(), PrimeFactors.of(1));
    }

    // We added the second example for the Prime Factors Kata.
    // We expect the new example to fail because the prime factors
    // of 2 are not an empty list.

    @Test
    public void prime_factors_of_2_are_2() {
        assertEquals(List.of(2), PrimeFactors.of(2));
    }
}
