package com.neopragma.primefactors.step2.pass;

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
    // We did not change this example between 'fail' and 'pass'.
    // We expect all examples to pass after changing class PrimeFactors.

    @Test
    public void prime_factors_of_2_are_2() {
        assertEquals(List.of(2), PrimeFactors.of(2));
    }
}
