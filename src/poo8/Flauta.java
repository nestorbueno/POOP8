/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo8;

/**
 * La clase {@code Flauta} representa una flauta, que es un tipo de 
 * instrumento de viento. Proporciona métodos específicos para tocar, afinar
 * y obtener el tipo de instrumento.
 * 
 * @author Nestor bueno
 * @version 1.0
 */
public class Flauta extends instrumentoDeViento {

    /**
     * Constructor de la clase {@code Flauta}.
     */
    public Flauta() {
    }
    
    /**
     * Imprime un mensaje indicando que se está tocando la flauta.
     */
    public void tocar() {
        System.out.println("Tocando Flauta");
    }
    
    /**
     * Devuelve el tipo de instrumento, en este caso "Flauta".
     * 
     * @return El tipo de instrumento ("Flauta").
     */
    @Override
    public String tipodeInstrumento() {
        System.out.println("Flauta");
        return "Flauta";
    }
    
    /**
     * Imprime un mensaje indicando que se está afinando la flauta.
     */
    @Override
    public void afinar() {
        System.out.println("Afinando Flauta");
    } 

    /**
     * Devuelve una representación en cadena de la flauta.
     * 
     * @return Una cadena que representa el objeto Flauta.
     */
    @Override
    public String toString() {
        return "Flauta{}";
    }
}
