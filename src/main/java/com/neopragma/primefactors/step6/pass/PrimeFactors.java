package com.neopragma.primefactors.step6.pass;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public static List<Integer> of(int num) {
        List<Integer> primes = new ArrayList<>();
        if (num > 1) {

    // Transformation #10 (if -> while)
    // This was the only change needed to make the example pass.

            while (num % 2 == 0) {
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
