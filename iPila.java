/* Interface iCalculadora que contiene los metodos para la calculadora */
public interface iPila<E>{

	/* Determina si la pila esta vacia */
	public boolean isEmpty();

	/* Realiza el push del operando */
	public void push(E digit);

	/* Realiza el pop del resultado */
	public E pop();

	public int size();
}
