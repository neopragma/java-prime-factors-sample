package com.neopragma.primefactors.step5.pass;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    // No changes needed to pass example #5 in the kata.

    public static List<Integer> of(int num) {
        List<Integer> primes = new ArrayList<>();
        if (num > 1) {
            if (num % 2 == 0) {
                primes.add(2);
                num /= 2;
            }
            if (num > 1) {
                primes.add(num);
            }
        }
        return primes;
    }
}
