import java.util.ArrayList;

public class Pila<E>
 implements iPila<E>
{
	protected ArrayList<E> data;

	public Pila(){
		data = new ArrayList<E>();
	}
	/**
	* Agregar un elemento en la pila
	* @param item E - Elemento que se agrega en la pila
	*/
	public void push(E item){
		data.add(item);
	}
	
	/**
    * Obtener el ultimo elemento de la pila y borrarlo de la pila
    * @return - El ultimo elemento de la pila
    */
	public E pop(){
		return data.remove(size()-1);
	}

	/**
    * Obtener el ultimo elemento de la pila sin sacarlo
    * @return - El ultimo elemento de la pila
    */
	public E peek(){
		return data.get(size() - 1);
	}
	
	/**
    * Devuelve el estado de la pila, si esta vacia o no
    * @return Boolean - True si y solo si el stack esta vacio
    */
	public boolean empty(){
		return size() == 0;
	}
  
	/**
    * Devuelve el tamanio de la pila
    * @return int - El numero de elementos de la pila
    */
	public int size(){
		return data.size();
	}
}