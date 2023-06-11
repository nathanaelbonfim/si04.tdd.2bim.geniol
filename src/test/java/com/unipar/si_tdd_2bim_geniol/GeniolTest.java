package com.unipar.si_tdd_2bim_geniol;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
import com.unipar.si_tdd_2bim_geniol.Geniol;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author nathanael
 */
public class GeniolTest {
    @Test
    public void testExpression1() {
        // C = E + 5
        // letterValues[2] == letterValues[4] + 5
        Geniol geniol = new Geniol();
        //                               A  B  C  D  E  F  G
        geniol.setLetterValues(new int[]{1, 2, 7, 0, 2, 9, 5});

        // C = E + 5 -> 7 = 2 + 5
        assertTrue(geniol.expression1());

        // Precisa retornar FALSE
        //                               A  B  C  D  E  F  G
        geniol.setLetterValues(new int[]{1, 2, 7, 0, 0, 9, 5});
        // C = E + 5 -> 7 != 0 + 5
        assertFalse(geniol.expression1());
    }

    @Test
    public void testExpression2() {
        // B = F + 1
        // letterValues[1] == letterValues[5] + 1
        Geniol geniol = new Geniol();
        //                               A  B   C  D  E  F  G
        geniol.setLetterValues(new int[]{1, 10, 7, 0, 2, 9, 5});

        // B = F + 1 -> 10 = 9 + 1
        assertTrue(geniol.expression2());

        // Precisa retornar FALSE
        //                               A  B  C  D  E  F  G
        geniol.setLetterValues(new int[]{1, 2, 7, 0, 2, 9, 5});
        // B = F + 1 -> 2 != 9 + 1
        assertFalse(geniol.expression2());
    }

    @Test
    public void testExpression3() {
        // D = F + 3
        // letterValues[3] == letterValues[5] + 3
        Geniol geniol = new Geniol();
        //                               A  B  C   D  E  F  G
        geniol.setLetterValues(new int[]{1, 2, 7, 12, 2, 9, 5});

        // D = F + 3 -> 12 = 9 + 3
        assertTrue(geniol.expression3());

        // Precisa retornar FALSE
        //                               A  B  C  D  E  F  G
        geniol.setLetterValues(new int[]{1, 2, 7, 0, 2, 9, 8});
        // D = F + 3 -> 0 != 9 + 3
        assertFalse(geniol.expression3());
    }

    @Test
    public void testExpression4() {
        // A = E + 4
        // letterValues[0] == letterValues[4] + 4
        Geniol geniol = new Geniol();
        //                               A  B  C  D  E  F  G
        geniol.setLetterValues(new int[]{6, 2, 7, 0, 2, 9, 5});

        // A = E + 4 -> 6 = 2 + 4
        assertTrue(geniol.expression4());

        // Precisa retornar FALSE
        //                               A  B  C  D  E  F  G
        geniol.setLetterValues(new int[]{1, 2, 7, 0, 5, 9, 5});
        // A = E + 4 -> 1 != 5 + 4
        assertFalse(geniol.expression4());
    }

    @Test
    public void testExpression5() {
        // D = G + 4
        // letterValues[3] == letterValues[6] + 4
        Geniol geniol = new Geniol();
        //                               A  B  C  D  E  F  G
        geniol.setLetterValues(new int[]{1, 2, 7, 9, 2, 9, 5});

        // D = G + 4 -> 9 = 5 + 4
        assertTrue(geniol.expression5());

        // Precisa retornar FALSE
        //                               A  B  C  D  E  F  G
        geniol.setLetterValues(new int[]{1, 2, 7, 0, 2, 9, 5});
        // D = G + 4 -> 0 != 5 + 4
        assertFalse(geniol.expression5());
    }
    
        @Test
    public void testCalculateValues() {
        Geniol geniol = new Geniol();

        // Define os valores para satisfazer todas as expressões
        // C = E + 5 -> 9 = 4 + 5
        // B = F + 1 -> 6 = 5 + 1
        // D = F + 3 -> 8 = 5 + 3
        // A = E + 4 -> 8 = 4 + 4
        // D = G + 4 -> 8 = 4 + 4
        //
        //                               A  B  C  D  E  F  G
        geniol.setLetterValues(new int[]{8, 6, 9, 8, 4, 5, 4});
        assertTrue(geniol.calculateValues());

        // Define valores aleatórios para dar dar FALSE
        //                               A  B  C  D  E  F  G
        geniol.setLetterValues(new int[]{1, 2, 7, 0, 2, 9, 5});
        assertFalse(geniol.calculateValues());
    }
}
