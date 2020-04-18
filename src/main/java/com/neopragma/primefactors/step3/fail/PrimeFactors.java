package com.neopragma.primefactors.step3.fail;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public static List<Integer> of(int inputValue) {
        List<Integer> primes = new ArrayList();
        if (inputValue > 1) {
            primes.add(2);
        }
        return primes;
    }
}
