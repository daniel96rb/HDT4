
public class ListaPila <E> extends AbstractPila{


	private List<E> list;
	private ListaFactory fact = new ListaFactory();

 	public ListaPila(){
		list = fact.getList();
  }

	/* Realiza el push del operando hacia la lista*/
	@Override //Implementa el metodo de la interface iPila
	public void push(E digit) {
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
		return list.isEmpty();
	}

	@Override //Implementa el metodo de la interface iPila
	/* Determina la cantidad de elementos dentro de la pila */
	public int size(){
		return list.size();
	}

	public Object get() {
			return list.remove();
	}

}
