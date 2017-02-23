import java.util.*;

public class VectorPila <E> extends AbstractPila{

	private Vector<E> list;

	/*Constructor de la clase*/
	public VectorPila(){
		list = new Vector<E>(); // Lista donde se almacenan los operandos y resultados
	}

	/* Realiza el push del operando hacia la lista*/
	@Override //Implementa el metodo de la interface iPila
	public void push(E digit) {
		list.add(digit);
	}

	@Override //Implementa el metodo de la interface iPila
	/* Realiza el pop del resultado y lo remueve*/
	public E pop() {
		Object object = list.lastElement();
		list.removeElementAt(list.size()-1);
		return object;
	}

	@Override //Implementa el metodo de la interface iPila
	/* Determina si la pila esta vacia */
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override //Implementa el metodo de la interface iPila
	/* Determina la cantidad de elementos dentro de la pila */
	public int size(){
		return list.size();
	}

}
