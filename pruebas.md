# EJEMPLO 1
## CALCULADORA

<p>
A continuación se muestra la clase Calculador, con la que vamos a realizar un ejemplo de como implementar pruebas unitarios con TestNG.
</p>

---
```java
public class Calculador {

    public double suma(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public double resta(double numero1, double numero2) {
        return numero1 - numero2;
    }

    public double multiplica(double numero1, double numero2) {
        return numero1 * numero2;
    }

    public double divideix(double numero1, double numero2) {
        return numero1 / numero2;
    }

} 
```
---


Dentro de la pestaña seleccionamos **Create/Update tests**.
1
Elegimos el framework **TestNG** para crear la clase de pruebas. Seleccionamos las opciones que se muestran en la imagen.
2

La clase creada debe ser tal y como la siguiente:

```java
public class CalculadorNGTest {
    
    public CalculadorNGTest() {
    }

    /**
     * Test of suma method, of class Calculador.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        double numero1 = 0.0;
        double numero2 = 0.0;
        Calculador instance = new Calculador();
        double expResult = 0.0;
        double result = instance.suma(numero1, numero2);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resta method, of class Calculador.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        double numero1 = 0.0;
        double numero2 = 0.0;
        Calculador instance = new Calculador();
        double expResult = 0.0;
        double result = instance.resta(numero1, numero2);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplica method, of class Calculador.
     */
    @Test
    public void testMultiplica() {
        System.out.println("multiplica");
        double numero1 = 0.0;
        double numero2 = 0.0;
        Calculador instance = new Calculador();
        double expResult = 0.0;
        double result = instance.multiplica(numero1, numero2);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of divideix method, of class Calculador.
     */
    @Test
    public void testDivideix() {
        System.out.println("divideix");
        double numero1 = 0.0;
        double numero2 = 0.0;
        Calculador instance = new Calculador();
        double expResult = 0.0;
        double result = instance.divideix(numero1, numero2);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

```

Cada una de las clases es la prueba para cada uno de los métodos de la clase **Calculador**.

En primer lugar, quitamos el método **fail()**, que se ejecutará cuando el método falle.

Vamos a proponer distintos casos de prueba para los métodos.

### SUMA

1. Suma de dos números enteros positivos.
2. Suma de dos números enteros negativos.
3. Suma de dos números decimales positivos, con una tolerancia de 0,01.

Por ejemplo:

```java
/**
* Test of suma method, of class Calculador.
*/
    @Test
    public void testSuma() {
        System.out.println("suma");
        double numero1 = 2.01;
        double numero2 = 2.02;
        Calculador instance = new Calculador();
        double expResult = 4;
        double result = instance.suma(numero1, numero2);
        assertEquals(result, expResult, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

```

**Para ejecutar el Test: CTRL+F6**

Este ejemplo fallará, puesto que la tolerancia es de 0'01, mayor a la que se obtiene, que es 0'3.

### RESTA

1. Resta de dos números enteros positivos.
2. Resta de dos números enteros negativos.
3. Suma de dos números decimales positivos, con una tolerancia de 0,01.

### MULTIPLICACIÓN

1. División de dos números enteros positivos, con tolerancia de 0,001.
2. División de dos números enteros negativos.
3. División por cero.

### DIVISIÓN

1. División de dos números enteros positivos.
2. División de dos números enteros negativos.
3. Divisón por cero.

```java
/**
* Test of divideix method, of class Calculador.
*/
    @Test
    public void testDivideix() {
        System.out.println("divideix");
        double numero1 = 0.0;
        double numero2 = 0.0;
        Calculador instance = new Calculador();
        double expResult = 0.0;
        double result = instance.divideix(numero1, numero2);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
```

El test no se pasará, puesto qe el resultado esperado en NaN y no cero. Prueba a incluir Nan en el resultado esperado.


