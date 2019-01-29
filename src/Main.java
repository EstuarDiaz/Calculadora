
public class Main {
	public static void main(String[] args) {
		iPila<String> miStack = new Pila<String>();
	    miStack.push("Adios");  //1
		miStack.push("Hola");   //2

	    String cadena = miStack.pop();
	    System.out.println(cadena);
		cadena = miStack.pop();
		System.out.println(cadena);
	}
}
