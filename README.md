# Geniol

This is a Java program that solves a puzzle called "Geniol." The program prompts the user to enter values for seven variables (A, B, C, D, E, F, G) and then calculates the values based on a set of predefined expressions. Finally, it displays the values in a matrix format and outputs the result of the calculations.

## Usage

To use this program, follow these steps:

1. Compile the `Geniol` class using a Java compiler.
2. Run the compiled class file (`Geniol.class`).

Upon execution, the program will ask you to enter values for variables A, B, C, D, E, F, and G. Each value must be an integer between 1 and 7, inclusive. If you enter a value greater than 7, you will be prompted to enter the value again.

After entering the values, the program will perform calculations based on the following expressions:

1. C = E + 5
2. B = F + 1
3. D = F + 3
4. A = E + 4
5. D = G + 4

The program will check if all the expressions are satisfied and display the result (true or false). Additionally, it will print a matrix showing the values of the variables in a grid, with letters A to G on the vertical axis and numbers 1 to 7 on the horizontal axis.

## Example

Here is an example interaction with the program:

```
------------------------------------
             G E N I O L
------------------------------------

Os valores não podem ser maiores que 7
------------------------------------
Digite o valor de A: 3
------------------------------------
Digite o valor de B: 2
------------------------------------
Digite o valor de C: 6
------------------------------------
Digite o valor de D: 7
------------------------------------
Digite o valor de E: 5
------------------------------------
Digite o valor de F: 4
------------------------------------
Digite o valor de G: 1

Result: true
------------------------------------
             G E N I O L
------------------------------------



    1 2 3 4 5 6 7
___ __ __ __ __ __ __
A | x x x x 5 x x
B | x x x x x 4 x
C | x x x x x x 6
D | x x x 7 x x x
E | x x x x x 5 x
F | x x x x 4 x x
G | 1 x x x x x x
```

# Tests

The `GeniolTest` class contains unit tests to verify the correctness of the expressions and calculations in the `Geniol` class. The tests are implemented using JUnit 5 framework.

To run the tests, follow these steps:

1. Compile the `GeniolTest` class along with the `Geniol` class using a Java compiler.
2. Run the compiled test class (`GeniolTest.class`).

The `GeniolTest` class includes the following test methods:

## `testExpression1()`

This method tests the first expression `C = E + 5`. It verifies if the value of `letterValues[2]` is equal to the value of `letterValues[4] + 5`. The test is performed with two scenarios: one where the expression is true and another where it is false.

## `testExpression2()`

This method tests the second expression `B = F + 1`. It checks if `letterValues[1]` is equal to `letterValues[5] + 1`. Similar to the previous test, it includes both a true and a false scenario.

## `testExpression3()`

This method tests the third expression `D = F + 3`. It verifies the equality of `letterValues[3]` and `letterValues[5] + 3`. The test covers both the true and false cases.

## `testExpression4()`

This method tests the fourth expression `A = E + 4`. It checks if `letterValues[0]` is equal to `letterValues[4] + 4`. It includes a true and a false scenario.

## `testExpression5()`

This method tests the fifth expression `D = G + 4`. It verifies the equality of `letterValues[3]` and `letterValues[6] + 4`. It includes both a true and a false case.

## `testCalculateValues()`

This method tests the `calculateValues()` method in the `Geniol` class. It verifies if all the expressions are satisfied by setting the values of the variables to satisfy the equations and checking that the method returns `true`. It also includes a test case where the values do not satisfy the equations, expecting the method to return `false`.

It is important to note that these tests cover only a subset of possible scenarios and should be expanded to provide comprehensive test coverage.

To run the tests, execute the `GeniolTest` class. The test results will be displayed, indicating whether each test case passed or failed.

## License

This code is provided under the MIT License license.
