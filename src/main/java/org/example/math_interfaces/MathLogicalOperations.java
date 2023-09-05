package org.example.math_interfaces;

public interface MathLogicalOperations<T extends Number> {
    T sum(T num1, T num2);
    T minus(T num1, T num2);
    T multiply(T num1, T num2);
    T divide(T num1, T num2) throws ArithmeticException;
}