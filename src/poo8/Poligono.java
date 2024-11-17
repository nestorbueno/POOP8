/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo8;

/**
 * La clase abstracta {@code Poligono} representa la base para figuras geométricas con múltiples lados, 
 * proporcionando métodos abstractos para calcular el área y el perímetro.
 * 
 * <p>Las clases que hereden de {@code Poligono} deben implementar los métodos {@code area()} y {@code perimetro()}
 * para definir el cálculo específico de acuerdo con la figura geométrica.</p>
 * 
 * @author Nestor bueno
 * @version 1.0
 */
public abstract class Poligono {

    /**
     * Constructor por defecto de la clase {@code Poligono}.
     */
    public Poligono() {  
    }

    /**
     * Calcula el área del polígono.
     * Este método debe ser implementado por las clases derivadas.
     * 
     * @return El área del polígono.
     */
    public abstract float area();

    /**
     * Calcula el perímetro del polígono.
     * Este método debe ser implementado por las clases derivadas.
     * 
     * @return El perímetro del polígono.
     */
    public abstract float perimetro();

    /**
     * Devuelve una representación en cadena de la clase {@code Poligono}.
     * 
     * @return Una cadena que representa al objeto {@code Poligono}.
     */
    @Override
    public String toString() {
        return "Poligono{}";
    }
    
}