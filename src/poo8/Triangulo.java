/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo8;

/**
 * La clase {@code Triangulo} representa un polígono con tres lados y ángulos.
 * Extiende la clase abstracta {@code Poligono} e implementa los métodos para calcular
 * el área y el perímetro de un triángulo.
 * 
 * <p>Los valores de los lados y ángulos del triángulo se asignan al crear una instancia
 * de la clase y pueden ser modificados mediante los métodos setters.</p>
 * 
 * @author Nestor bueno
 * @version 1.0
 */
public class Triangulo extends Poligono {
    private int alfa;  // Primer ángulo del triángulo
    private int beta;  // Segundo ángulo del triángulo
    private int gama;  // Tercer ángulo del triángulo
    private float a;   // Longitud del primer lado del triángulo
    private float b;   // Longitud del segundo lado del triángulo
    private float c;   // Longitud del tercer lado del triángulo
    private float base;   // Base del triángulo
    private float altura; // Altura del triángulo

    /**
     * Constructor por defecto de la clase {@code Triangulo}.
     */
    public Triangulo() {
    }

    /**
     * Constructor que inicializa un triángulo con ángulos, lados, base y altura.
     * 
     * @param alfa Ángulo alfa del triángulo
     * @param beta Ángulo beta del triángulo
     * @param gama Ángulo gamma del triángulo
     * @param a Longitud del primer lado
     * @param b Longitud del segundo lado
     * @param c Longitud del tercer lado
     * @param base Base del triángulo
     * @param altura Altura del triángulo
     */
    public Triangulo(int alfa, int beta, int gama, float a, float b, float c, float base, float altura) {
        this.alfa = alfa;
        this.beta = beta;
        this.gama = gama;
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.altura = altura;
    }

    public int getAlfa() {
        return alfa;
    }

    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }

    public int getBeta() {
        return beta;
    }

    public void setBeta(int beta) {
        this.beta = beta;
    }

    public int getGama() {
        return gama;
    }

    public void setGama(int gama) {
        this.gama = gama;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    /**
     * Calcula el área del triángulo.
     * 
     * @return El área del triángulo como el producto de la base y la altura, dividido por 2.
     */
    @Override
    public float area() {
        return (base * altura) / 2;
    }
    
    /**
     * Calcula el perímetro del triángulo.
     * 
     * @return La suma de los tres lados del triángulo.
     */
    @Override
    public float perimetro() {
        return a + b + c;
    }

    /**
     * Devuelve una representación en cadena de la clase {@code Triangulo}.
     * 
     * @return Una cadena que representa los atributos del triángulo.
     */
    @Override
    public String toString() {
        return "Triangulo{" + "alfa=" + alfa + ", beta=" + beta + ", gama=" + gama + ", a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", altura=" + altura + '}';
    }
}