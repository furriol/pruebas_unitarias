/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_daw_ed;

/**
 *
 * @author Administrador
 */
public class MatriCad {

    private java.util.ArrayList<String> cadenes; // referencia a la lista de cadenas, un campo /**

    /**             
    * Constructor de Matricad.         
    *
    * @param dada matriu amb les cadenes per a la llista
    */
            
    public MatriCad(String[] dada) {
        if ((dada == null) || (dada.length == 0)) { // Verificamos que la lista tenga valores
            throw new IllegalArgumentException();
        }
        this.cadenes = new java.util.ArrayList<>();
        for (String element : dada) {
            cadenes.add(element);
        }
    }

    /**
     * @return la cantidad de cadenas que empiezan con una letra específica.
     */
    public int getCantidadCadenasQueEmpiezanCon(char letra) {
        int contador = 0;
        for (String element : cadenes) {
            if (element.charAt(0) == letra) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * @return true si hay cadenas que empiezan por el argumento dado.
     * 
     */
    public boolean hayCadenasQueEmpiezanPor(char letra) {
        for (String element : cadenes) {
            if (element.charAt(0) == letra) {
                return true;
            }
        }
        return false;
    }

    /**
     * @return la concatenación de todas las cadenas en la lista, separadas por
     * un espacio.
     */
    public String getConcatenacionCadenas() {
        StringBuilder concatenacion = new StringBuilder();
        for (String element : cadenes) {
            concatenacion.append(element).append(" ");
        }
        return concatenacion.toString().trim();
    }

    /**
     * Busca todas las apariciones de una cadena y devuelve sus posiciones como
     * una lista de enteros.
     *
     * @param unaCadena Cadena buscada
     * @return Retorna una lista de enteros con las posiciones de la cadena en
     * la lista, o una lista vacía si no se encuentra.
     * @throws Ksfjlfjd`f
     */
    public java.util.ArrayList<Integer> getPosicionesDe(String unaCadena) {
        if (unaCadena == null) { // Comprobamos que el argumento se válido
            throw new IllegalArgumentException();
        }
        java.util.ArrayList<Integer> posiciones = new java.util.ArrayList<>();
        for (int i = 0; i < cadenes.size(); i++) {
            String d = cadenes.get(i);
            if (d.equals(unaCadena)) {
                posiciones.add(i);
            }
        }
        return posiciones;
    }
}
