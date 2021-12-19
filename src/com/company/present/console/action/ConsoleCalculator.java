package com.company.present.console.action;

import com.company.entity.Operation;
import com.company.present.console.util.ConsoleReader;
import com.company.present.console.util.ConsoleWriter;
import com.company.service.CalculatorService;

public class ConsoleCalculator {
    private ConsoleReader consoleReader = new ConsoleReader();
    private ConsoleWriter consoleWriter = new ConsoleWriter();
    private CalculatorService calculatorService = new CalculatorService();

    public void run(){
        while (true){
            calculatorMenu();
            int v = consoleReader.readInt();
            switch (v){
                case 0:
                    return;
                case 1:
                    consoleWriter.write("Enter number 1");
                    double v1 = consoleReader.readNumber();
                    consoleWriter.write("Enter number 2");
                    double v2 = consoleReader.readNumber();
                    Operation sum = calculatorService.sum(v1, v2);
                    consoleWriter.write("Result = " + sum.getResult());
                    break;
                case 2:
                    consoleWriter.write("Enter number 1");
                    double v3 = consoleReader.readNumber();
                    consoleWriter.write("Enter number 2");
                    double v4 = consoleReader.readNumber();
                    Operation sub = calculatorService.sub(v3, v4);
                    consoleWriter.write("Result = " + sub.getResult());
                    break;
                case 3:
                    consoleWriter.write("Enter number 1");
                    double v5 = consoleReader.readNumber();
                    consoleWriter.write("Enter number 2");
                    double v6 = consoleReader.readNumber();
                    Operation mul = calculatorService.mul(v5, v6);
                    consoleWriter.write("Result = " + mul.getResult());
                    break;
                case 4:
                    consoleWriter.write("Enter number 1");
                    double v7 = consoleReader.readNumber();
                    consoleWriter.write("Enter number 2");
                    double v8 = consoleReader.readNumber();
                    Operation div = calculatorService.div(v7, v8);
                    consoleWriter.write("Result = " + div.getResult());
                    break;
            }
        }
    }


    private void calculatorMenu(){
        consoleWriter.write("Hello");
        consoleWriter.write("Choose operation: 1 SUM, 2 SUB, 3 MUL, 4 DIV, 0 EXIT");
    }
}
