package com.ghost.behavior.memento;

public interface Calculator {

    PreviousCalculationToCareTaker backupLastCalculation();
    void restorePreviousCalculation(PreviousCalculationToCareTaker memento);
    int getCalculationResult();
    void setFirstNumber(int firstNumber);
    void setSecondNumber(int secondNumber);

}
