package org.example.math;

import org.example.math_interfaces.MathLogicalOperations;

public class MathIntegerLib implements
        MathLogicalOperations<Integer> {

    @Override
    public Integer sum(Integer num1, Integer num2) {
        return num1 + num2;
    }

    @Override
    public Integer minus(Integer num1, Integer num2) {
        return num1 - num2;
    }

    @Override
    public Integer multiply(Integer num1, Integer num2) {
        return num1 * num2;
    }

    @Override
    public Integer divide(Integer num1, Integer num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Dividing by zero is incorrect!");
        }
        return num1 / num2;
    }
}
