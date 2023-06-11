/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unipar.si_tdd_2bim_geniol;

/**
 *
 * @author nathanael
 */
public class Main {
    public static void main(String[] args) {
        Geniol geniol = new Geniol();

        geniol.readValues();

        // Mostra as expressões calculadas
        System.out.println();
        System.out.println("C = E + 5: " + geniol.expression1());
        System.out.println("B = F + 1: " + geniol.expression2());
        System.out.println("D = F + 3: " + geniol.expression3());
        System.out.println("A = E + 4: " + geniol.expression4());
        System.out.println("D = G + 4: " + geniol.expression5());
        System.out.println();

        // Resultado final
        System.out.println("Ganhou? " + geniol.calculateValues());

        // Mostra os valores das variáveis
        geniol.printMatrix();
    }
}
