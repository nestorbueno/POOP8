/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package poo8;

/**
 * La interfaz {@code Meses} define constantes para representar los doce meses del año, 
 * tanto en formato numérico como en una cadena de texto.
 * 
 * <p>Los valores numéricos de los meses van de {@code 1} (enero) a {@code 12} (diciembre).
 * También se proporciona un arreglo de cadenas {@code MESES} que contiene los nombres 
 * de los meses en español.</p>
 * 
 * <p>Esta interfaz puede ser utilizada para simplificar la representación de meses en 
 * otros lugares del código, sin necesidad de declarar nuevas constantes.</p>
 * 
 * @author Nestor bueno
 * @version 1.0
 */
public interface Meses {
    
    /** Representa el mes de enero con el valor numérico 1. */
    int UNO = 1;
    
    /** Representa el mes de febrero con el valor numérico 2. */
    int DOS = 2;
    
    /** Representa el mes de marzo con el valor numérico 3. */
    int TRES = 3;
    
    /** Representa el mes de abril con el valor numérico 4. */
    int CUATRO = 4;
    
    /** Representa el mes de mayo con el valor numérico 5. */
    int CINCO = 5;
    
    /** Representa el mes de junio con el valor numérico 6. */
    int SEIS = 6;
    
    /** Representa el mes de julio con el valor numérico 7. */
    int SIETE = 7;
    
    /** Representa el mes de agosto con el valor numérico 8. */
    int OCHO = 8;
    
    /** Representa el mes de septiembre con el valor numérico 9. */
    int NUEVE = 9;
    
    /** Representa el mes de octubre con el valor numérico 10. */
    int DIEZ = 10;
    
    /** Representa el mes de noviembre con el valor numérico 11. */
    int ONCE = 11;
    
    /** Representa el mes de diciembre con el valor numérico 12. */
    int DOCE = 12;

    /** 
     * Arreglo de cadenas que contiene los nombres de los meses en español. 
     * El índice del arreglo corresponde al valor numérico del mes.
     */
    String[] MESES = {"", "enero", "febrero", "marzo", "abril", "mayo", "junio", 
                      "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    
}