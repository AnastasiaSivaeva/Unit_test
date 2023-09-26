package HW_1;

public class calculator {
    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }

    public static double squareRootExtraction(double num) {
            if(num < 0) {
                throw new IllegalArgumentException("Cannot calculate square root of a negative number");
            }
            return Math.sqrt(num);
    }

    public static double calculate_discount(double purchaseAmount, int discountAmount){
        if (discountAmount < 0) {
            throw new ArithmeticException("Скидка не может быть меньше нуля");
        }
        if (discountAmount > 100) {
            throw new ArithmeticException("Скидка не может быть больше 100");
        }
        return purchaseAmount - discountAmount / 100 * purchaseAmount;
    }
}

