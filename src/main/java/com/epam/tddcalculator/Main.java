package com.epam.tddcalculator;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class Main {
    private static final Logger log = Logger.getLogger(Main.class);
    public static void main(String[] args){
        Scanner input;
        String expression;
        log.info("Calculator started.");
        do {
            log.info("Type an expression you want to calculate.\nType 'quit' to quit.");
            input = new Scanner(System.in);
            expression = input.nextLine();
            if (expression.equals("quit")) break;
            log.info("Your expression " + expression);
            log.info(Calculator.calculate(expression));
        } while (true);
        log.info("Calculator finished.");
    }
}
