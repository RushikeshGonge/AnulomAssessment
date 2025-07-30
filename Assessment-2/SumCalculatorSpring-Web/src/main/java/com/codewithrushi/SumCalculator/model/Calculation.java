package com.codewithrushi.SumCalculator.model;


import jakarta.persistence.*;

@Entity
@Table(name = "calculations")
public class Calculation {
    @Id private String hash;

    @Column(length = 1000, name = "number_list", nullable = false)
    private String numberList;

    @Column(nullable = false)
    private double sum;

    public Calculation() {}
    public Calculation(String hash, String numberList, double sum) {
        this.hash = hash; this.numberList = numberList; this.sum = sum;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getNumberList() {
        return numberList;
    }

    public void setNumberList(String numberList) {
        this.numberList = numberList;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Calculation{" +
                "hash='" + hash + '\'' +
                ", numberList='" + numberList + '\'' +
                ", sum=" + sum +
                '}';
    }
}

