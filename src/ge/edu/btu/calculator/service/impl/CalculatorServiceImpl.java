package ge.edu.btu.calculator.service.impl;


import ge.edu.btu.calculator.service.CalculatorService;

public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public void sum(int x, int y) {

        System.out.println(x+y);

    }

    @Override
    public void divide(int x, int y) {

        try {
            int division = x/y;
            System.out.println(division);
        }

        catch (ArithmeticException e) {
            System.out.println("Zero Division ERROR");

        }

    }
}
