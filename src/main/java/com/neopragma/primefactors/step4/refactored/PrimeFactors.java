package com.neopragma.primefactors.step4.refactored;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    // Refactoring: Rename
    // We are manipulating the input value to extract the prime factors,
    // so we changed the name of the argument from inputValue to num, as
    // the name inputValue is not descriptive of the method's behavior.

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
