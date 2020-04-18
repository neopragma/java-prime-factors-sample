package com.neopragma.primefactors.step4.pass;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public static List<Integer> of(int inputValue) {
        List<Integer> primes = new ArrayList<>();
        if (inputValue > 1) {

        // Transformation #5 (statement -> statements)
        // Transformation #6 (unconditional -> if)

        // As long as the input value is evenly divisible by 2,
        // we add 2 to the list of primes, as that will be the
        // smallest possible prime factor.

            if (inputValue % 2 == 0) {
                primes.add(2);
                inputValue /= 2;
            }

        // After we've extracted all the 2's, we add the remaining
        // value to the list, unless it's 1.

            if (inputValue > 1) {
                primes.add(inputValue);
            }
        }
        return primes;
    }
}
