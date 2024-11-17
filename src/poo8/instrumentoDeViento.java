/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo8;

/**
 * La clase {@code instrumentoDeViento} representa un instrumento musical de viento
 * que implementa la interfaz {@code instrumentoMusical}. Define los métodos 
 * para tocar, afinar, y especificar el tipo de instrumento.
 * 
 * <p>Esta clase proporciona una implementación básica para los instrumentos de viento
 * y puede ser extendida para crear tipos específicos de instrumentos.</p>
 * 
 * @author Nestor bueno
 * @version 1.0
 */
public class instrumentoDeViento extends Object implements instrumentoMusical {

    /**
     * Constructor por defecto de la clase {@code instrumentoDeViento}.
     */
    public instrumentoDeViento() {
    }

    /**
     * Método para tocar el instrumento de viento.
     * Imprime un mensaje indicando que el instrumento está siendo tocado.
     */
    @Override
    public void tocar() {
        System.out.println("Tocando Instrumento Musical");
    }

    /**
     * Método que retorna el tipo de instrumento como una cadena.
     * 
     * @return Una cadena que indica el tipo de instrumento, en este caso "musical".
     */
    @Override
    public String tipodeInstrumento() {
        System.out.println("Musical");
        return "musical";
    }

    /**
     * Método para afinar el instrumento de viento.
     * Imprime un mensaje indicando que el instrumento ha sido afinado.
     */
    @Override
    public void afinar() {
        System.out.println("Afinado");
    }

    /**
     * Devuelve una representación en cadena de la clase {@code instrumentoDeViento}.
     * 
     * @return Una cadena que representa el objeto {@code instrumentoDeViento}.
     */
    @Override
    public String toString() {
        return "instrumentoDeViento{" + '}';
    }
    
}