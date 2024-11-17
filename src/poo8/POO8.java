/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo8;

/**
 * Clase principal {@code POOP8} que demuestra el uso de polimorfismo y herencia 
 * en objetos de tipo {@code Poligono}, {@code Triangulo} y {@code Cuadrilatero}. 
 * También se muestran ejemplos de casting, uso de interfaces e impresión de constantes.
 * 
 * @author Nesotor bueno
 * @version 1.0
 */
public class POO8 {

    /**
     * Método principal que ejecuta la demostración del programa.
     * Crea instancias de polígono, triángulo y cuadrilátero, calcula sus áreas y perímetros,
     * y muestra ejemplos de polimorfismo y casting.
     *
     * @param args los argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        // Crea un objeto de tipo Poligono usando una instancia de Triangulo
        Poligono poligono1 = new Triangulo();
        
        // Crea un Triangulo con ángulos y lados específicos
        Triangulo triangulo1 = new Triangulo(60,60,60,5,5,5,5,5);
        System.out.println(triangulo1);
        System.out.println("Area = " + triangulo1.area());
        System.out.println("Perimetro = " + triangulo1.perimetro());
        
        // Crea un Cuadrilatero con ángulos y lados específicos
        Cuadrilatero cuadrilatero1 = new Cuadrilatero(90,90,5,5,5,5,5,5);
        System.out.println(cuadrilatero1);
        System.out.println("Area = " + cuadrilatero1.area());
        System.out.println("Perimetro = " + cuadrilatero1.perimetro());
        
        // Crea una referencia de Poligono y asigna una instancia de Cuadrilatero
        Poligono poligono2 = new Cuadrilatero();
        
        // Polimorfismo: usa una referencia de tipo Poligono apuntando a un Triangulo
        Triangulo triangulo2 = new Triangulo();
        System.out.println(triangulo2);
        poligono2 = triangulo2;
        System.out.println(poligono2);
        
        // Ejemplo de casting de Object a Cuadrilatero
        Cuadrilatero cuadrilatero2 = new Cuadrilatero();
        System.out.println(cuadrilatero2);
        Object object1 = new Object();
        System.out.println(object1);
        object1 = cuadrilatero2;
        System.out.println(object1);
        
        // Identificación de tipos de figuras usando instanceof
        identificarFiguras(poligono1);
        identificarFiguras(poligono2);
        
        // Ejemplo de uso de la interfaz Flauta
        Flauta flauta = new Flauta();
        flauta.tocar();
        flauta.afinar();
        flauta.tipodeInstrumento();
        
        // Ejemplos de uso de constantes y métodos estáticos
        System.out.println(Math.PI);
        System.out.println(Meses.UNO);
        System.out.println(Meses.MESES[Meses.TRES]);
    }
    
    /**
     * Identifica el tipo de figura que es el objeto {@code Poligono} pasado.
     * Verifica si el polígono es una instancia de {@code Triangulo} o {@code Cuadrilatero}.
     *
     * @param poligono el objeto Poligono a identificar.
     */
    public static void identificarFiguras(Poligono poligono) {
        if (poligono instanceof Triangulo) {
            System.out.println("Instancia de Triangulo");
        } else if (poligono instanceof Cuadrilatero) {
            System.out.println("Instancia de Cuadrilatero");
        } else {
            System.out.println("Instancia de Poligono");
        }
    }
}