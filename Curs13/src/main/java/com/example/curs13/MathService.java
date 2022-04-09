package com.example.curs13;

import org.springframework.stereotype.Service;

@Service
public class MathService {

    public int operationResult(MathServiceParams mathServiceParams){
        int firstNumber = mathServiceParams.getFirstNumber();
        int secondNumber = mathServiceParams.getSecondNumber();
        String operation = mathServiceParams.getOperation();

        return switch (operation){
            case "sum" -> (firstNumber + secondNumber);
            case "difference" -> (firstNumber - secondNumber);
            case "multiply" -> (firstNumber * secondNumber);
            case "divide" -> (firstNumber / secondNumber);
            case "power" -> (int)Math.pow(firstNumber, secondNumber);
            default -> throw new IllegalStateException("Unexpected value: " + operation);
        };
    }
}
