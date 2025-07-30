package com.codewithrushi.SumCalculator;


import com.codewithrushi.SumCalculator.model.Calculation;
import com.codewithrushi.SumCalculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CalculatorController {
    @Autowired private CalculatorService service;

    @PostMapping("/sum")
    public Calculation getSum(@RequestBody List<Double> numbers) {
        return service.calculateSumIfNotPresent(numbers);
    }
}
