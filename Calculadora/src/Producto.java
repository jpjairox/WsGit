/**
 * Esta clase sirve para hacer multiplicaciones tanto de 2 n�meros enteros, como de 2 o 3 n�meros reales, y para hacer potencias.
 * @author Carlos Otazo
 * @version 1.0
 */

public class Producto {
	
	    /** 
	     * M�todo que calcula el resultado de la multiplicaci�n de 2 n�meros reales.
	     * @param real1 representa el valor del primer n�mero introducido, el que ser� multiplicado.
	     * @param real2 representa el valor del segundo n�mero introducido, es decir el que multiplicar�.
	     * @return el resultado de la multiplicaci�n de ambos n�meros. 
	     * <b>Caso especial:</b> Cualquier n�mero multiplicado por 0 da como resultado 0.
	     */
	    public double dosNumerosReales(double real1, double real2){
	     return (real1*real2);
	    }
	    /** 
	     * M�todo que calcula el resultado de la multiplicaci�n de 2 n�meros enteros.
	     * @param entero1 representa el valor del primer n�mero introducido, el que ser� multiplicado.
	     * @param entero2 representa el valor del segundo n�mero introducido, es decir el que multiplicar�.
	     * @return el resultado de la multiplicaci�n de ambos n�meros.
	     * <b>Caso especial</b>: Cualquier n�mero multiplicado por 0 da como resultado 0.
	     */
	    public int dosNumerosEnteros(int entero1, int entero2){
	     return (entero1*entero2);
	    }
	    /** 
	     * M�todo que calcula el resultado de la multiplicaci�n de 3 n�meros reales.
	     * @param real1 representa el valor del primer n�mero introducido, el que ser� multiplicado.
	     * @param real2 representa el valor del segundo n�mero introducido, es decir el primero que multiplicar�.
	     * @param real3 representa el valor del tercer n�mero introducido, es decir el segundo que multiplicar�.
	     * @return el resultado de la multiplicaci�n de los tres n�meros.
	     * <b>Caso especial:</b> Cualquier n�mero multiplicado por 0 da como resultado 0.
	     */
	    public double tresNumerosreales(double real1, double real2, double real3){
	     return (real1*real2*real3);
	    }
	    /**
	     * M�todo que calcula la potencia del n�mero ingresado como base.
	     * @param base representa el valor del n�mero a multiplicar.
	     * @param exponente representa el valor del n�mero de veces que se multiplicar� la base por si misma.
	     * @return el resultado de elevar la base al n�mero ingresado como exponente.
	     * <b>Caso especial:</b> En caso de que los n�meros ingresados sean mas grandes que el tipo de dato, no se podr�a realizar la potencia.
	     */
	    public int potencia(int base, int exponente){
	     if (base == 0)
	        return 1;
	     else
	        return base * potencia(base, exponente - 1);
	    }
}

