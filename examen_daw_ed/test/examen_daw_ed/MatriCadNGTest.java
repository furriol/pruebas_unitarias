/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package examen_daw_ed;

import java.util.ArrayList;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Administrador
 */
public class MatriCadNGTest {

    public MatriCadNGTest() {
    }

    @Test
    public void testMatriCad1() {
        String[] datos = {"hola", "como", "estas"};
        MatriCad instance = new MatriCad(datos);
    }

    @Test
    public void testMatriCad2() {
        try {
            String[] datos = {};
            MatriCad instance = new MatriCad(datos);
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testMatriCad3() {
        try {
            String[] datos = null;
            MatriCad instance = new MatriCad(datos);
        } catch (IllegalArgumentException e) {
        }
    }

    /**
     * Test of getCantidadCadenasQueEmpiezanCon method, of class MatriCad.
     */
    @Test
    public void testGetCantidadCadenasQueEmpiezanCon() {
        System.out.println("getCantidadCadenasQueEmpiezanCon");
        String[] datos = {"hola", "como", "estas"};
        char letra = 'h';
        MatriCad instance = new MatriCad(datos);
        int expResult = 1;
        int result = instance.getCantidadCadenasQueEmpiezanCon(letra);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of hayCadenasQueEmpiezanPor method, of class MatriCad.
     */
    @Test
    public void testHayCadenasQueEmpiezanPor() {
        System.out.println("hayCadenasQueEmpiezanPor");
        char letra = 'v';
        String[] datos = {"hola", "como", "estas"};
        MatriCad instance = new MatriCad(datos);
        boolean expResult = false;
        boolean result = instance.hayCadenasQueEmpiezanPor(letra);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getConcatenacionCadenas method, of class MatriCad.
     */
    @Test
    public void testGetConcatenacionCadenas() {
        System.out.println("getConcatenacionCadenas");
        String[] datos = {"hola", "como", "estas"};
        MatriCad instance = new MatriCad(datos);
        String expResult = "hola como estas";
        String result = instance.getConcatenacionCadenas();
        assertEquals(result, expResult);
    }

    /**
     * Test of getPosicionesDe method, of class MatriCad.
     */
    @Test
    public void testGetPosicionesDeC() {
        try {
            System.out.println("getPosicionesDe");
            String unaCadena = null;
            String[] datos = {"hola", "como", "estas"};
            MatriCad instance = new MatriCad(datos);
            ArrayList result = instance.getPosicionesDe(unaCadena);
        } catch (IllegalArgumentException e) {
        }
    }

    /**
     * Test of getPosicionesDe method, of class MatriCad.
     */
    //@Test
    public void testGetPosicionesDeA() {
        System.out.println("getPosicionesDe");
        String unaCadena = "adios";
        String[] datos = {"hola", "como", "estas"};
        MatriCad instance = new MatriCad(datos);
        ArrayList result = instance.getPosicionesDe(unaCadena);
        java.util.ArrayList<Integer> expResult = new ArrayList<>();
        expResult.add(2);
        assertEquals(result, expResult);
    }

    @Test
    public void testGetPosicionesDeB() {
        System.out.println("getPosicionesDe");
        String unaCadena = "hola";
        String[] datos = {"hola", "como", "estas"};
        MatriCad instance = new MatriCad(datos);
        ArrayList<Integer> expResult = new ArrayList<>();
        expResult.add(0);
        ArrayList result = instance.getPosicionesDe(unaCadena);
        assertEquals(result, expResult);
    }
}
