/**
 * Clase para las operaciones de la calculadora.
 */

public class Calculadora 
	implements iCalculadora{
	/** 
	 * Método para hacer la suma de la calculadora
	 * @param a double - sumando
	 * @param b double - sumando
	 * @return Double - El resultado de la suma de a y b
	 */
	public double sumar(double a, double b) {
		return a+b;
	}
	
	/** 
	 * Método para hacer la resta de la calculadora
	 * @param a double - 
	 * @param b double - 
	 * @return Double - El resultado de la resta entre a y b
	 */
	public double restar(double a, double b) {
		return a-b;
	}
	
	/** 
	 * Método para hacer la multiplicación de la calculadora
	 * @param a double - factor
	 * @param b double - factor
	 * @return Double - El resultado de la multiplicación entre a y b
	 */
	public double multiplicar(double a, double b) {
		return a*b;
	}
	
	/** 
	 * Método para hacer la división de la calculadora
	 * @param a double - dividendo
	 * @param b double - divisor
	 * @return Double - El resultado de la división entre a y b
	 */
	public double dividir(double a, double b) {
		if(b != 0) {
			return a/b;
		}
		else {
			return 0;
		}
	}
}
