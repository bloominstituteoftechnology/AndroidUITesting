package com.lambdaschool.android_ui_testing_calculator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

    private String expression;
    private String reCalculate;

    private enum Operator {ADD, SUBTRACT, MULTIPLY, DIVIDE, SQUARED, SQUARE_ROOT}

    public Calculator() {
        this.expression = "";
        this.reCalculate = "";
    }

    public String addSymbol(String symbol) {
        this.expression += symbol;
        this.reCalculate = "";
        return this.expression;
    }

    public String addDecimal() {
        if (!this.expression.contains("."))
            this.expression += ".";
        this.reCalculate = "";

        return this.expression;
    }

    public String addition() {
        if (this.expression.length() > 0 && !this.expression.contains("+"))
            this.expression += "+";
        this.reCalculate = "";

        return this.expression;
    }

    public String subtraction() {
        if (this.expression.length() > 0 && !this.expression.contains("—"))
            this.expression += "—";
        this.reCalculate = "";

        return this.expression;
    }

    public String multiplication() {
        if (this.expression.length() > 0 && !this.expression.contains("×"))
            this.expression += "×";
        this.reCalculate = "";

        return this.expression;
    }

    public String division() { // ALT 0247
        if (this.expression.length() > 0 && !this.expression.contains("÷"))
            this.expression += "÷";
        this.reCalculate = "";

        return this.expression;
    }

    public String square() { // ALT 0178
        if (this.expression.length() > 0 && !this.expression.contains("²"))
            this.expression += "²";
        this.reCalculate = "";

        return this.expression;
    }

    public String squareRoot() { // ALT 251
        if (this.expression.length() > 0 && !this.expression.contains("√"))
            this.expression += "√";
        this.reCalculate = "";

        return this.expression;
    }

    public String pi() { // ALT 227
        if (!this.expression.contains("π"))
            this.expression += "π";
        this.reCalculate = "";

        return this.expression;
    }

    public String calculate() {
        if (this.expression.length() > 0) {

            String expressionToCalculate = this.reCalculate.equals("") ? this.expression : this.reCalculate;

            Pattern deconstructedPattern = Pattern.compile("(^-?[\\dπ.]+)?([+—×÷²√π])?([\\dπ.]+)?");
            Matcher deconstructedMatcher = deconstructedPattern.matcher(expressionToCalculate);

            ArrayList<String> separatedGroups = new ArrayList<>();
            if (deconstructedMatcher.find()) {
                for (int i = 1; i <= deconstructedMatcher.groupCount(); ++i) {
                    separatedGroups.add(deconstructedMatcher.group(i));
                }
                separatedGroups.removeAll(Collections.singleton(null));
            }

            ArrayList<Double> operands = new ArrayList<>();
            ArrayList<Operator> operators = new ArrayList<>();

            for (String segment : separatedGroups) {

                switch (segment) {
                    case "+":
                        operators.add(Operator.ADD);
                        break;
                    case "—":
                        operators.add(Operator.SUBTRACT);
                        break;
                    case "×":
                        operators.add(Operator.MULTIPLY);
                        break;
                    case "÷":
                        operators.add(Operator.DIVIDE);
                        break;
                    case "²":
                        operators.add(Operator.SQUARED);
                        break;
                    case "√":
                        operators.add(Operator.SQUARE_ROOT);
                        break;
                    case "π":
                        operands.add(Math.PI);
                        break;
                    default:
                        operands.add(Double.parseDouble(segment));
                        break;
                }
            }

            if (operators.size() > 0 && operands.size() > 0) {
                switch (operators.get(0)) {
                    case ADD:
                        if (operands.size() > 1) {
                            this.expression = String.valueOf(operands.get(0) + operands.get(1));
                            this.reCalculate = "+" + operands.get(1);
                        } else {
                            this.expression = String.valueOf(Double.parseDouble(this.expression) + operands.get(0));
                        }
                        break;
                    case SUBTRACT:
                        if (operands.size() > 1) {
                            this.expression = String.valueOf(operands.get(0) - operands.get(1));
                            this.reCalculate = "—" + operands.get(1);
                        } else {
                            this.expression = String.valueOf(Double.parseDouble(this.expression) - operands.get(0));
                        }
                        break;
                    case MULTIPLY:
                        if (operands.size() > 1) {
                            this.expression = String.valueOf(operands.get(0) * operands.get(1));
                            this.reCalculate = "×" + operands.get(1);
                        } else {
                            this.expression = String.valueOf(Double.parseDouble(this.expression) * operands.get(0));
                        }
                        break;
                    case DIVIDE:
                        if (operands.size() > 1) {
                            this.expression = String.valueOf(operands.get(0) / operands.get(1));
                            this.reCalculate = "÷" + operands.get(1);
                        } else {
                            this.expression = String.valueOf(Double.parseDouble(this.expression) / operands.get(0));
                        }
                        break;
                    case SQUARED:
                        if (operands.size() > 1) {
                            this.expression = String.valueOf(operands.get(0) * operands.get(0));
                            this.reCalculate = "²" + this.expression;
                        } else {
                            this.expression = String.valueOf(Double.parseDouble(this.expression) * Double.parseDouble(this.expression));
                        }
                        break;
                    case SQUARE_ROOT:
                        if (operands.size() > 1) {
                            this.expression = String.valueOf(Math.sqrt(operands.get(0)));
                            this.reCalculate = "√" + this.expression;
                        } else {
                            this.expression = String.valueOf(Math.sqrt(Double.parseDouble(this.expression)));
                        }
                        break;
                }
            }


            if (this.expression.endsWith(".0")) {
                this.expression = this.expression.replace(".0", "");
            }
        }

        return this.expression;
    }

    public String backspace() {
        if (this.expression.length() > 0) {
            this.expression = this.expression.substring(0, this.expression.length() - 1);
        }
        this.reCalculate = "";

        return this.expression;
    }

    public String reset() {
        this.reCalculate = "";
        return this.expression = "";
    }

    public String getExpression() {
        return this.expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }
}
