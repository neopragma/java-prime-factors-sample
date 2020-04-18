package com.neopragma.primefactors.step6.fail;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

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
