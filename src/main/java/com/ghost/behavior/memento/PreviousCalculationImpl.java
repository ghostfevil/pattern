package com.ghost.behavior.memento;

public class PreviousCalculationImpl implements PreviousCalculationToCareTaker,PreviousCalculationToOriginator {

    //关键实现
    private int firstNumber;
    private int secondNumber;

    public PreviousCalculationImpl(int firstNumber, int secondNumber) {
        this.firstNumber=firstNumber;
        this.secondNumber=secondNumber;
    }

    @Override
    public int getFirstNumber() {
        return firstNumber;
    }

    @Override
    public int getSecondNumber() {
        return secondNumber;
    }
}
