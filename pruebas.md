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

Elegimos el framework **TestNG** para crear la clase de pruebas. Seleccionamos las opciones que se muestran en la imagen.


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
3. Resta de dos números decimales positivos, con una tolerancia de 0,01.

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


# EJEMPLO 2
## SEPARADOR DE PALABRAS

```java
public class Separa {
    public String[] separa(String text, String separador) {
        if (text == null || separador == null) {
            return null;
        }
        return text.split(separador);
    }
}
```
Vamos a probar los siguientes casos:

1. Que devuelve null cuando no se pasan parámetros.
2. Prueba de que la cadena "Me gusta programar" devuelve un array con las tres palabras.
3. Prueba que es sensible a mayúsculas, es decir, que si esperas un "me", "gusta", "programar" no pasará el test.
4. Prueba un separador diferente al espacio en blanco.


# EJEMPLO 3
## MATRICES Y EXCEPCIONES

```java
public class Matricad {
    private java.util.ArrayList<String> cadenes; 	// referència a la llista de cadenes, un camp
    /**
     * Constructor de Matricad.
     * @param dada matriu amb les cadenes per a la llista
     */
    public Matricad(String[] dada) {
        if ((dada == null) || (dada.length == 0)) {.	// Verifiquem que la llista tinga valors  
            throw new IllegalArgumentException();
        }
        this.cadenes = new java.util.ArrayList<>();
        for (String element : dada) {
            cadenes.add(element);
        }
    }
    /**
     * @return la cadena que té més caràcters. La primera si hi ha diverses amb la mateixa longitud
     */
    public String getMaxCad() {
        String max = "";
        for (String element : cadenes) {
            if (element.length() > max.length()) {
                max = element;
            }
        }
        return max;
    }
    /**
     * @return la suma total de caràcters de totes les cadenes.
     */
    public int getSumaCaracters() {
        int total = 0;
        for (String d : cadenes) {
            total += d.length();
        }
        return total;
    }
    /**
     * Retorna l'índex de la cadena buscada.
     *
     * @param unaCadena Cadena buscada
     * @return Retorna la posició d'un element dins de l’array
     * @throws java.util.NoSuchElementException Si l'element no existeix en la llista
     */
    public int getIndexDe(String unaCadena)
               throws java.util.NoSuchElementException {
        if (unaCadena == null) { 	// Comprovem que l'argument siga vàlid  
            throw new IllegalArgumentException();
        }
        int pos = 0;
        for (String d : cadenes) { 	// Recorrem la informació fins a trobar l'element
            if (d.equals(unaCadena)) {
                return pos;
            }
            pos++;
        }
        throw new java.util.NoSuchElementException(unaCadena); 	// L'element no existeix, llancem l'excepció
    }
}

```




