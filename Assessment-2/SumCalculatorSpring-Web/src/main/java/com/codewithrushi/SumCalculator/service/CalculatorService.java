package com.codewithrushi.SumCalculator.service;



import com.codewithrushi.SumCalculator.model.Calculation;
import com.codewithrushi.SumCalculator.repository.CalculationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.MessageDigest;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class CalculatorService {
    @Autowired private CalculationRepository repo;

    public Calculation calculateSumIfNotPresent(List<Double> numbers) {
        List<Double> sorted = new ArrayList<>(numbers);
        Collections.sort(sorted);
        String hash = hashOf(sorted);
        return repo.findById(hash)
                .orElseGet(() -> {
                    double sum = sorted.stream().mapToDouble(Double::doubleValue).sum();
                    String listStr = sorted.stream().map(String::valueOf).collect(Collectors.joining(","));
                    return repo.save(new Calculation(hash, listStr, sum));
                });
    }

    private String hashOf(List<Double> list) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            String raw = list.stream().map(String::valueOf).collect(Collectors.joining(","));
            byte[] digest = md.digest(raw.getBytes());
            return Base64.getEncoder().encodeToString(digest);
        } catch (Exception e) {
            throw new RuntimeException("Hash failed", e);
        }
    }
}
