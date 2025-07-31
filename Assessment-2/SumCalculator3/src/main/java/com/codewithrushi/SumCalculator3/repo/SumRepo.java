package com.codewithrushi.SumCalculator3.repo;


import java.util.*;

import org.springframework.stereotype.Repository;

@Repository
public class SumRepo {
    private final Map<List<Integer>, Integer> cache = new HashMap<>();

    public int getOrComputeSum(List<Integer> numbers) {
        List<Integer> key = new ArrayList<>(numbers);
        Collections.sort(key); // Normalize the list for consistent key

        if (cache.containsKey(key)) {
            return cache.get(key);
        } else {
            int sum = numbers.stream().mapToInt(Integer::intValue).sum();
            cache.put(key, sum);
            return sum;
        }
    }
}