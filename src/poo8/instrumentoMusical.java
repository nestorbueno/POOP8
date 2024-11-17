/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo8;

/**
 * La interfaz {@code instrumentoMusical} define los métodos básicos que deben 
 * ser implementados por cualquier clase que represente un instrumento musical.
 * Los métodos incluyen la capacidad de tocar el instrumento, especificar el 
 * tipo de instrumento, y afinar el instrumento.
 * 
 * <p>Esta interfaz proporciona una estructura común para diferentes tipos de 
 * instrumentos musicales, que pueden ser de viento, cuerdas, percusión, entre otros.</p>
 * 
 * @author Nestor bueno
 * @version 1.0
 */
public interface instrumentoMusical {

    /**
     * Método para tocar el instrumento musical.
     * Este método debe ser implementado para describir la acción de tocar el instrumento.
     */
    void tocar();

    /**
     * Método que retorna el tipo de instrumento musical como una cadena.
     * Este método debe ser implementado para especificar el tipo de instrumento.
     * 
     * @return Una cadena que indica el tipo de instrumento (por ejemplo, "viento", "cuerda").
     */
    String tipodeInstrumento();

    /**
     * Método para afinar el instrumento musical.
     * Este método debe ser implementado para describir la acción de afinar el instrumento.
     */
    void afinar();
    
}