package ge.edu.btu.calculator.service;

import ge.edu.btu.calculator.service.impl.CalculatorServiceImpl;

public class Main {

    public static void main(String[] args) {

        CalculatorServiceImpl calc = new CalculatorServiceImpl();

        calc.sum(5, 6);
        calc.divide(20, 0);

    }

}
