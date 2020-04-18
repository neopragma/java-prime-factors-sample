package com.neopragma.primefactors.finalversion;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public static List<Integer> of(int num) {
        List<Integer> primes = new ArrayList<>();
        for (int candidate = 2; num > 1; candidate++) {
            for (; num % candidate == 0; num /= candidate) {
                primes.add(candidate);
            }
        }
        return primes;
    }
}
