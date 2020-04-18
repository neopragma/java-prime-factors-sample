package com.neopragma.primefactors.step1.pass;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeFactorsTest {

    // We decided the method should return a list.
    // We chose java.util.List<Integer> as the return type.
    // We improved the name of the example.
    // We decided an empty list represents the prime factors of 1.

    @Test
    public void prime_factors_of_1_are_an_empty_list() {
        assertEquals(new ArrayList<Integer>(), PrimeFactors.of(1));
    }
}
