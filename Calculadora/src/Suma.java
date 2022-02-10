/**
 * Esta clase sirve para sumar n�meros enteros o reales por separado as� como para a�adir n�meros reales a un acumulador.
 * @author Salvador
 * @version 1.0
 */
 
public class Suma {
    private int entero;
    private double real;
    
    public Suma() {
    	this.entero=0;
    	this.real=0.0;
    }
    
    public void setEntero(int entero) { //Usa "void" porque no necesita devolver ning�n valor. S�lo modificarlo.
		this.entero=entero;
	}
	public int getEntero() { //Especifica el tipo que se va a devlover a trav�s de return. En este caso "String".
		return this.entero;
	}
	
	public void setReal(double real) { 
		this.real=real;
	}
	public double getReal() {
		return this.real;
	}
	
	
	/**
	 *M�todo que realiza la suma de dos n�meros <b>reales</b> que se le pasan c�mo paramentros, 
	 * y devuelve el resultado c�mo <b>real</b>. Un real es cualquier n�mero, con decimales o sin ellos.
	 * 
	 * @param n1 representa uno de los n�meros a sumar.
	 * @param n2 representa el otro n�mero a sumar.
	 * @return devuelve un <b>real</b> que es la suma de los par�metros <b>n1</b> y <b>n2</b>.
	 */
	public double sumaDosNumerosReales(double n1,double n2) {
		//TODO
		double resultado = 0;
		return resultado;
	}
		
	/**
	 *M�todo que realiza la suma de dos n�meros <b>enteros</b> que se le pasan c�mo paramentros, 
	 * y devuelve el resultado c�mo <b>entero</b>. Un entero es un n�mero sin decimales.
	 * 
	 * @param n1 representa uno de los n�meros a sumar.
	 * @param n2 representa el otro n�mero a sumar.
	 * @return devuelve un <b>entero</b> que es la suma de los par�metros <b>n1</b> y <b>n2</b>.
	 */
	public int sumaDosNumerosEnteros(int n1,int n2) {
		//TODO
		int resultado = 0;
		return resultado;
	}
	
	/**
	 *M�todo que realiza la suma de tres n�meros <b>reales</b> que se le pasan c�mo paramentros, 
	 * y devuelve el resultado c�mo <b>real</b>. Un real es cualquier n�mero, con decimales o sin ellos.
	 * 
	 * @param n1 representa uno de los n�meros a sumar.
	 * @param n2 representa uno de los n�meros a sumar.
	 * @param n3 representa uno de los n�meros a sumar.
	 * @return devuelve un <b>real</b> que es la suma de los par�metros <b>n1</b> y <b>n2</b>.
	 */
	public double sumaTresNumerosReales(double n1,double n2, double n3) {
		//TODO
		double resultado = 0;
		return resultado;
	}
	
	/**
	 *M�todo que a�ade al valor de un contador cualquier n�mero <b>real</b> que se le pasan c�mo paramentro.
	 *El valor del contados se puede modificar con el setter <b>setEntero()</b> y obtener con el getter <b>getEntero()</b> . 
	 * 
	 * @param n1 representa el n�mero que se quiere sumar al contador.
	 */
	public void sumaValorAcumulado(double n1) {
		//TODO
	}
	
}
