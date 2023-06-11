/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unipar.si_tdd_2bim_geniol;

/**
 *
 * @author nathanael
 */
public class Geniol {
    public int[] letterValues;
    private static int MAX_VALUE = 7;

    /**
     * Lê o valor da variável selecionada e caso seja
     * maior que 7, pede para digitar novamente
     */
    public int readValue(String variable) {
        String data = "";
        int value = 0;
        boolean isInvalid = true;

        while (isInvalid) {
            System.out.println("------------------------------------");
            System.out.print("Digite o valor de " + variable + ": ");

            data = System.console().readLine();
            value = Integer.parseInt(data);

            if (value > MAX_VALUE) {
                System.out.println("O valor de " + variable + " não pode ser maior que " + MAX_VALUE);
                System.out.println("Digite novamente");
            } else {
                isInvalid = false;
            }
        }

        return value;
    }

    /**
     * Lê os valores da variável selecionada
     */
    public void readValues() {
        System.out.println("------------------------------------");
        System.out.println("             G E N I O L            ");
        System.out.println("------------------------------------");
        System.out.println("Os valores não podem ser maiores que " + MAX_VALUE);

        letterValues = new int[7];
        letterValues[0] = readValue("A");
        letterValues[1] = readValue("B");
        letterValues[2] = readValue("C");
        letterValues[3] = readValue("D");
        letterValues[4] = readValue("E");
        letterValues[5] = readValue("F");
        letterValues[6] = readValue("G");
    }

    /** C = E + 5; */
    public boolean expression1() {
        return letterValues[2] == letterValues[4] + 5;
    }

    /** B = F + 1; */
    public boolean expression2() {
        return letterValues[1] == letterValues[5] + 1;
    }

    /** D = F + 3; */
    public boolean expression3() {
        return letterValues[3] == letterValues[5] + 3;
    }

    /** A = E + 4; */
    public boolean expression4() {
        return letterValues[0] == letterValues[4] + 4;
    }

    /** D = G + 4; */
    public boolean expression5() {
        return letterValues[3] == letterValues[6] + 4;
    }

    /**
     * Calcula os valores das variáveis
     */
    public boolean calculateValues() {
        return expression1() && expression2() && expression3() && expression4() && expression5();
    }

    /**
     * Imprime a matriz de valores das variáveis
     * em um quadriculado com letras de A a G na vertical
     * e números de 1 a 7 na horizontal
     *
     * Labels de colunas: 1 2 3 4 5 6 7
     * Labels de linhas: A B C D E F G
     */
    public void printMatrix() {
        // Mostra o cabeçalho
        System.out.println("------------------------------------");
        System.out.println("             G E N I O L            ");
        System.out.println("------------------------------------");
        System.out.println("\n\n");

        System.out.print("    ");
        for (int j = 0; j < MAX_VALUE; j++) {
            System.out.printf("%-2d", j + 1);
        }
        System.out.println();

        System.out.print("___");
        for (int j = 0; j < MAX_VALUE; j++) {
            System.out.print("__");
        }
        System.out.println();

        for (int i = 0; i < MAX_VALUE; i++) {
            System.out.print((char) (i + 65) + " | ");
            for (int j = 0; j < MAX_VALUE; j++) {
                // Se o valor da variável for igual ao valor da coluna
                // imprime a variável, caso contrário imprime 0
                if (letterValues[i] == j + 1) {
                    System.out.printf("%-2d", letterValues[i]);
                } else {
                    System.out.print("x ");
                }
            }
            System.out.println();
        }
    }

    /**
     * Retorna o valor da variável de acordo com a letra
     */
    public int getLetterValue(char letter) {
        return letterValues[letter - 65];
    }

    public static void main(String[] args) {
        Geniol geniol = new Geniol();
        geniol.readValues();
        boolean result = geniol.calculateValues();
        System.out.println("Result: " + result);
        geniol.printMatrix();
    }

    public void setLetterValues(int[] letterValues) {
        this.letterValues = letterValues;
    }
}
