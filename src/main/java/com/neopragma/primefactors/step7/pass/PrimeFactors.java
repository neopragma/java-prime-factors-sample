package com.neopragma.primefactors.step7.pass;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public static List<Integer> of(int num) {
        List<Integer> primes = new ArrayList<>();

    // Move this declaration outside the scope of the first 'if' (now 'while').
    // Transformation #5 (statement -> statements)

        int candidate = 2;

    // Transformation #10 (if -> while)

        while (num > 1) {

            // The lowest prime might not be 2, so we start with 2
            // and then continue using whatever remains after the 2's
            // have been extracted as the next candidate prime.

            // Transformation #4 (constant -> scalar)

            while (num % candidate == 0) {
                primes.add(candidate);
                num /= candidate;
            }

            // Next candidate to try.
            // Transformation #5 (statement -> statements)

            candidate++;
        }
        if (num > 1) {
            primes.add(num);
        }
        return primes;
    }
}
