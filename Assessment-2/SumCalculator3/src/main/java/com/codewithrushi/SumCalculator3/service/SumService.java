package com.codewithrushi.SumCalculator3.service;

import com.codewithrushi.SumCalculator3.repo.SumRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SumService {

    @Autowired
    private SumRepo repository;

    public int getOrComputeSum(List<Integer> numbers) {
        return repository.getOrComputeSum(numbers);
    }
}
