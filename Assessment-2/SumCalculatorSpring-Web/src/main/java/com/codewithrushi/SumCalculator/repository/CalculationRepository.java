package com.codewithrushi.SumCalculator.repository;



import com.codewithrushi.SumCalculator.model.Calculation;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CalculationRepository extends JpaRepository<Calculation, String> {}

