/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package examen_dam_ed;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Administrador
 */
public class OperacionesNumerosNGTest {

    public OperacionesNumerosNGTest() {
       
    }

    @Test
    public void testOperacionesNumeros1() {
        int[] datos = {1, 2, 3, 4, 5};
        OperacionesNumeros instance = new OperacionesNumeros(datos);
    }

    @Test
    public void testOperacionesNumeros2() {
        try {
            int[] datos = {};
            OperacionesNumeros instance = new OperacionesNumeros(datos);
            fail("Se esperaba una excepción");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testOperacionesNumeros3() {
        try {
            int[] datos = null;
            OperacionesNumeros instance = new OperacionesNumeros(datos);
            fail("Se esperaba una excepción");
        } catch (IllegalArgumentException e) {
        }
    }

    /**
     * Test of getMaximo method, of class OperacionesNumeros.
     */
    @Test
    public void testGetMaximo() {
        System.out.println("getMaximo");
        int[] datos = {1, 2, 3, 4, 5};
        OperacionesNumeros instance = new OperacionesNumeros(datos);
        int expResult = 5;
        int result = instance.getMaximo();
        assertEquals(result, expResult);
    }

    /**
     * Test of getMinimo method, of class OperacionesNumeros.
     */
    @Test
    public void testGetMinimo() {
        System.out.println("getMinimo");
        int[] datos = {1, 2, 3, 4, 5};
        OperacionesNumeros instance = new OperacionesNumeros(datos);
        int expResult = 1;
        int result = instance.getMinimo();
        assertEquals(result, expResult);
    }

    /**
     * Test of getSuma method, of class OperacionesNumeros.
     */
    @Test
    public void testGetSuma() {
        System.out.println("getSuma");
        int[] datos = {1, 2, 3, 4, 5};
        OperacionesNumeros instance = new OperacionesNumeros(datos);
        int expResult = 15;
        int result = instance.getSuma();
        assertEquals(result, expResult);
    }

    /**
     * Test of getIndiceDe method, of class OperacionesNumeros.
     */
    @Test
    public void testGetIndiceDe() {
        System.out.println("getIndiceDe");
        int numero = 4;
        int[] datos = {1, 2, 3, 4, 5};
        OperacionesNumeros instance = new OperacionesNumeros(datos);
        int expResult = 3;
        int result = instance.getIndiceDe(numero);
        assertEquals(result, expResult);
    }

    /**
     * Test of getIndiceDe method, of class OperacionesNumeros.
     */
    @Test
    public void testGetIndiceDe1() {
        try {
            System.out.println("getIndiceDe");
            int numero = 125;
            int[] datos = {1, 2, 3, 4, 5};
            OperacionesNumeros instance = new OperacionesNumeros(datos);
            int result = instance.getIndiceDe(numero);
            fail("Se esperaba una excepción");
        } catch (java.util.NoSuchElementException e) {
        }

    }

}
