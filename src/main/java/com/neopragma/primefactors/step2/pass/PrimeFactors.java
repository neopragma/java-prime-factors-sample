package com.neopragma.primefactors.step2.pass;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    // When the input value is greater than 1, return a list containing 2.
    // Obviously not a complete solution, but the minimum code necessary
    // to make all the examples pass. To flesh out the solution we must
    // write appropriate examples to drive out the logic step by step.

    public static List<Integer> of(int inputValue) {
        List<Integer> primes = new ArrayList();
        if (inputValue > 1) {
            primes.add(2);
        }
        return primes;
    }
}
