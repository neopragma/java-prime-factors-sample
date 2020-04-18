package com.neopragma.primefactors.step7.refactored;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public static List<Integer> of(int num) {
        List<Integer> primes = new ArrayList<>();
// Refactoring: Simplification (while -> for)
        for (int candidate = 2; num > 1; candidate++) {
// Refactoring: Simplification (while -> for)
            for (; num % candidate == 0; num /= candidate) {
                primes.add(candidate);
            }
        }
// Refactoring: Remove unnecessary code.
//        if (num > 1) {
//            primes.add(num);
//        }
        return primes;
    }
}
