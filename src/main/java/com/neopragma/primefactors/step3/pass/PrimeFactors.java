package com.neopragma.primefactors.step3.pass;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public static List<Integer> of(int inputValue) {
        List<Integer> primes = new ArrayList<>();
        if (inputValue > 1) {

    // So far, all examples call for a list containing the input value.
    // Transformation #4: (constant -> scalar)

            primes.add(inputValue);
        }
        return primes;
    }
}
