import java.util.ArrayList;

public class ArrayListPila <E> extends AbstractPila{

	private ArrayList<E> list;

	/*Constructor de la clase*/
	public ArrayListPila(){
		list = new ArrayList<E>(); // Lista donde se almacenan los operandos y resultados
	}

	/* Realiza el push del operando hacia la lista*/
	@Override //Implementa el metodo de la interface iPila
	public void push(E digit) {
		list.add(digit);
	}

	@Override //Implementa el metodo de la interface iPila
	/* Realiza el pop del resultado y lo remueve*/
	public Object pop() {
		E object = list.get(list.size()-1);
		list.remove(list.size()-1);
		return object;
	}

	@Override //Implementa el metodo de la interface iPila
	/* Determina si la pila esta vacia */
	public boolean isEmpty() {
		return list.isEmpty();
	}

	public int size(){
			return list.size();
	}

}
