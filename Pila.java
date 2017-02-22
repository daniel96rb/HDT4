/* Clase Abstracta Pila que implementa la interface iPila realizando los push y pops de los operandos y resultados */
import java.util.ArrayList;

public abstract class Pila <E> implements iPila{

	private ArrayList list;

	/*Constructor de la clase*/
	public Pila(){
		list = new ArrayList<E>(); // Lista donde se almacenan los operandos y resultados
	}

	/* Realiza el push del operando hacia la lista*/
	@Override //Implementa el metodo de la interface iPila
	public void push(Object digit) {
		list.add(digit);
	}

	@Override //Implementa el metodo de la interface iPila
	/* Realiza el pop del resultado y lo remueve*/
	public Object pop() {
		return list.remove(0);
	}

	@Override //Implementa el metodo de la interface iPila
	/* Determina si la pila esta vacia */
	public boolean isEmpty() {
		return list.size() == 0;
	}

}
