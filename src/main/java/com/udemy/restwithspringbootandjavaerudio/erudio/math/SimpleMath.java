package com.udemy.restwithspringbootandjavaerudio.erudio.math;

import java.util.concurrent.atomic.AtomicLong;

public class SimpleMath {
    private final AtomicLong counter = new AtomicLong();

    public Double sum(Double numberOne, Double numberTwo) throws Exception {
        return (numberOne + numberTwo);
    }

    public Double subtracton(Double numberOne, Double numberTwo) throws Exception {
        return (numberOne - numberTwo);
    }

    public Double multiplication(Double numberOne, Double numberTwo) throws Exception {
        return (numberOne * numberTwo);
    }

    public Double division(Double numberOne, Double numberTwo) throws Exception {
        return (numberOne / numberTwo);
    }

    // MÉDIA
    public Double mean(Double numberOne, Double numberTwo) throws Exception {
        return (numberOne + numberTwo) / 2;
    }

    //Raiz quadrada
    public Double squareRoot(Double number) throws Exception {
        return Math.sqrt(number);
    }
}
