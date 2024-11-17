/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo8;

/**
 * Clase {@code Cuadrilatero} que representa un polígono de cuatro lados con
 * características específicas como ángulos, lados, base y altura.
 * 
 * Incluye métodos para calcular el área y el perímetro del cuadrilátero.
 * 
 * @author Nestor bueno
 * @version 1.0
 */
public class Cuadrilatero extends Poligono {
    private int alfa;    // Ángulo alfa del cuadrilátero
    private int beta;    // Ángulo beta del cuadrilátero
    private float a;     // Longitud del lado a
    private float b;     // Longitud del lado b
    private float c;     // Longitud del lado c
    private float d;     // Longitud del lado d
    private float base;  // Longitud de la base
    private float altura;// Altura del cuadrilátero

    public Cuadrilatero() {
    }
    
    // Constructor
    public Cuadrilatero(int alfa, int beta, float a, float b, float c, float d, float base, float altura) {
        this.alfa = alfa;
        this.beta = beta;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.base = base;
        this.altura = altura;
    }

    

    /**
     * Obtiene el ángulo alfa del cuadrilátero.
     * 
     * @return El valor de alfa en grados.
     */
    public int getAlfa() {
        return alfa;
    }

    /**
     * Establece el ángulo alfa del cuadrilátero.
     * 
     * @param alfa El valor en grados a asignar a alfa.
     */
    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }

    /**
     * Obtiene el ángulo beta del cuadrilátero.
     * 
     * @return El valor de beta en grados.
     */
    public int getBeta() {
        return beta;
    }

    /**
     * Establece el ángulo beta del cuadrilátero.
     * 
     * @param beta El valor en grados a asignar a beta.
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }

    /**
     * Obtiene la longitud del lado a del cuadrilátero.
     * 
     * @return La longitud del lado a.
     */
    public float getA() {
        return a;
    }

    /**
     * Establece la longitud del lado a del cuadrilátero.
     * 
     * @param a La longitud a asignar al lado a.
     */
    public void setA(float a) {
        this.a = a;
    }

    /**
     * Obtiene la longitud del lado b del cuadrilátero.
     * 
     * @return La longitud del lado b.
     */
    public float getB() {
        return b;
    }

    /**
     * Establece la longitud del lado b del cuadrilátero.
     * 
     * @param b La longitud a asignar al lado b.
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * Obtiene la longitud del lado c del cuadrilátero.
     * 
     * @return La longitud del lado c.
     */
    public float getC() {
        return c;
    }

    /**
     * Establece la longitud del lado c del cuadrilátero.
     * 
     * @param c La longitud a asignar al lado c.
     */
    public void setC(float c) {
        this.c = c;
    }

    /**
     * Obtiene la longitud del lado d del cuadrilátero.
     * 
     * @return La longitud del lado d.
     */
    public float getD() {
        return d;
    }

    /**
     * Establece la longitud del lado d del cuadrilátero.
     * 
     * @param d La longitud a asignar al lado d.
     */
    public void setD(float d) {
        this.d = d;
    }

    /**
     * Obtiene la longitud de la base del cuadrilátero.
     * 
     * @return La longitud de la base.
     */
    public float getBase() {
        return base;
    }

    /**
     * Establece la longitud de la base del cuadrilátero.
     * 
     * @param base La longitud a asignar a la base.
     */
    public void setBase(float base) {
        this.base = base;
    }

    /**
     * Obtiene la altura del cuadrilátero.
     * 
     * @return La altura del cuadrilátero.
     */
    public float getAltura() {
        return altura;
    }

    /**
     * Establece la altura del cuadrilátero.
     * 
     * @param altura La altura a asignar al cuadrilátero.
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * Calcula el perímetro del cuadrilátero sumando las longitudes de sus lados.
     *
     * @return El perímetro del cuadrilátero.
     */
    @Override
    public float perimetro() {
        return a + b + c + d;
    }

    /**
     * Calcula el área del cuadrilátero usando la base y la altura.
     *
     * @return El área del cuadrilátero.
     */
    @Override
    public float area() {
        return base * altura;
    }

    /**
     * Devuelve una representación en cadena del objeto {@code Cuadrilatero},
     * mostrando sus ángulos, lados, base y altura.
     *
     * @return Una cadena de texto que describe el cuadrilátero.
     */
    @Override
    public String toString() {
        return "Cuadrilatero{" + "alfa=" + alfa + ", beta=" + beta + ", a=" + a +
               ", b=" + b + ", c=" + c + ", d=" + d + ", base=" + base + ", altura=" + altura + '}';
    }
}