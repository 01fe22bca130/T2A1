class Calculator {

    /**
     * The function "addition" takes two float operands and returns their sum.
     *
     * @param operand_1 The first operand for addition. It is a float data type.
     * @param operand_2 The second operand in the addition operation.
     * @return The sum of operand_1 and operand_2 is being returned.
     */
    float addition(float operand_1, float operand_2) {
        return (operand_1 + operand_2);
    }

    /**
     * The function "substraction" takes two float operands and returns their
     * difference.
     *
     * @param operand_1 The first operand for the subtraction operation.
     * @param operand_2 The second operand in the subtraction operation.
     * @return the result of subtracting operand_2 from operand_1.
     */

    float substraction(float operand_1, float operand_2) {
        return (operand_1 - operand_2);
    }

    /**
     * The function "multiplication" takes two float operands and returns their
     * product.
     *
     * @param operand_1 The first operand for multiplication. It is a floating-point
     *                  number.
     * @param operand_2 The second operand in the multiplication operation.
     * @return the product of the two operands, which is the result of multiplying
     *         operand_1 and
     *         operand_2.
     */
    float multiplication(float operand_1, float operand_2) {
        return (operand_1 * operand_2);
    }

    /**
     * The function "division" takes two float operands and returns their division
     * result.
     *
     * @param operand_1 The first operand of the division operation.
     * @param operand_2 The second operand in the division operation.
     * @return the result of dividing operand_1 by operand_2.
     */
    float division(float operand_1, float operand_2) {
        return (operand_1 / operand_2);
    }

    /**
     * The function "square" takes a float number as input and returns the square of
     * that number.
     *
     * @param operand_1 A float value representing the operand to be squared.
     * @return the square of the operand_1 value.
     */
    float square(float operand_1) {
        return (operand_1 * operand_1);
    }

    // The line `public static void main(String[] args){` is the main method in
    // Java. It is the entry
    // point of the program and is where the program starts executing. The `main`
    // method is a special
    // method that is required in every Java program. It is declared as `public` so
    // that it can be
    // accessed from outside the class, `static` so that it can be called without
    // creating an instance
    // of the class, and `void` because it does not return any value. The `String[]
    // args` parameter
    // allows command-line arguments to be passed to the program.
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        float operand_1 = 10;
        float operand_2 = 10;

        // The code `float add_result=calc.addition(operand_1,operand_2);` is calling
        // the `addition`
        // method of the `Calculator` class and passing `operand_1` and `operand_2` as
        // arguments. It
        // assigns the returned value to the variable `add_result`, which is of type
        // `float`.
        float add_result = calc.addition(operand_1, operand_2);
        System.out.println("result is" + add_result);

        float sub_result = calc.substraction(operand_1, operand_2);
        System.out.println("result is" + sub_result);

        float mul_result = calc.multiplication(operand_1, operand_2);
        System.out.println("result is" + mul_result);

        float div_result = calc.division(operand_1, operand_2);
        System.out.println("result is" + div_result);

        float squ_result = calc.square(operand_1);
        System.out.println("result is" + squ_result);

    }
}
