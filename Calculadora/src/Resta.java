/**
 * Esta clase sirve para restar n�meros enteros o reales por separado as� como para a�adir n�meros reales a un acumulador.
 * @author Jairo
 * @version 1.0
 */
public class Resta {
	private int entero;
	private double real;
	
    public int getEntero() {
		return entero;
	}

	public void setEntero(int entero) {
		this.entero = entero;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}


	public Resta() {
	}

	public Resta(int entero, double real) {
		super();
		this.entero = entero;
		this.real = real;
	}

	/** 
     * M�todo para hacer la resta de dos n�meros <b>reales</b>
     * @param num1 entrada primer n�mero real a restar
     * @param num2 entrada segundo n�mero real a restar
     * @return resultado real resta entre los dos n�meros reales introducidos
     * 
     */
    public double resta2Reales(double num1,double num2) {
        double restaReal=num1-num2;
        return restaReal;
    }

    /**
     * M�todo para hacer la resta de dos n�meros <b>enteros</b>
     * @param num1 entrada primer n�mero entero a restar
     * @param num2 entrada segundo n�mero entero a restar
     * @return resultado entero de la resta entre los dos n�meros enteros introducidos
     * 
     */
    public int restaEnteros(int num1,int num2) {
        int restaEntero=num1-num2;
        return restaEntero;
    }

    /**
     * M�todo para hacer la resta de <b>tres<b> n�meros <b>reales<b>
     * @param num1 entrada primer n�mero real a restar
     * @param num2 entrada segundo n�mero real a restar
     * @param num3 entrada tercer n�mero real a restar
     * @return resultado real resta entre los dos n�meros reales introducidos
     * 
     */
    public double resta3Reales(double num1,double num2,double num3) {
    	double restaReal=num1-num2-num3;
        return restaReal;
    }

    /**
     * M�todo para hacer la <b>resta con un valor acumulado<b>
     * @param num valor de entrada que se va restando al acumulado
     * @param acumulado es la variable que guarda el valor acumulado 
     */
    public void restaAcum(double num) {
    	double acumulado=0;
    	while (acumulado>-10) {
            acumulado=acumulado-num;
    	}
    	System.out.println(acumulado);
    }
    
	  
}

