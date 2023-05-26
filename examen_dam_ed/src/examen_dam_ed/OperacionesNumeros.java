/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_dam_ed;

/**
 *
 * @author Administrador
 */
public class OperacionesNumeros {

    private java.util.ArrayList<Integer> numeros; // referencia a la lista de números

    /**
     * Constructor de operacionesNumeros.
     *
     * @param datos arreglo con los números para la lista
     */

    public OperacionesNumeros(int[] datos) {
        if (datos == null || datos.length == 0) { // Verificamos que la lista tenga valores
            throw new IllegalArgumentException();
        }
        this.numeros = new java.util.ArrayList<>();
        for (int elemento : datos) {
            numeros.add(elemento);
        }
    }

    /**
     * @return el número máximo de la lista.
     */
    public int getMaximo() {
        int max = Integer.MIN_VALUE;
        for (int elemento : numeros) {
            if (elemento > max) {
                max = elemento;
            }
        }
        return max;
    }

    /**
     * @return el número mínimo de la lista.
     */
    public int getMinimo() {
        int min = Integer.MAX_VALUE;
        for (int elemento : numeros) {
            if (elemento < min) {
                min = elemento;
            }
        }
        return min;
    }

    /**
     * @return la suma total de los números de la lista.
     */
    public int getSuma() {
        int suma = 0;
        for (int elemento : numeros) {
            suma += elemento;
        }
        return suma;
    }

    /**
     * Retorna el índice de un número buscado.
     *
     * @param numero Número buscado.
     * @return Retorna la posición de un número dentro de la lista.
     * @throws java.util.NoSuchElementException Si el número no existe en la
     * lista.
     */
    public int getIndiceDe(int numero) throws java.util.NoSuchElementException {
        int pos = 0;
        for (int elemento : numeros) {
            if (elemento == numero) {
                return pos;
            }
            pos++;
        }
        throw new java.util.NoSuchElementException(String.valueOf(numero)); // El número no existe, lanzamos la excepción
    }
}
