package com.codewithrushi.SumCalculator3.model;

import java.util.ArrayList;
import java.util.List;

public class SumData {
    private List<Integer> numberList = new ArrayList<>();

    public List<Integer> getNumberList() {
        return numberList;
    }

    public void addNumber(int number) {
        numberList.add(number);
    }

    public void clearList() {
        numberList.clear();
    }
}
