public class DobleCadenaNodo<E>{
    protected E conjunto;
    protected DobleCadenaNodo<E> nextElement;
    protected DobleCadenaNodo<E> previousElement;
public DobleCadenaNodo(E x,DobleCadenaNodo<E> next,DobleCadenaNodo<E> previous){
    conjunto = x;
    nextElement = next;
    if (nextElement != null)
        nextElement.previousElement = this;
    previousElement = previous;
    if (previousElement != null)
        previousElement.nextElement = this;
}
public DobleCadenaNodo(E x)
{
    this(x,null,null);
}
public DobleCadenaNodo<E> next()
{
	return nextElement;
}
public DobleCadenaNodo<E> previous(){
    return previousElement;
}
public void setPrevious(DobleCadenaNodo<E> previous){
previousElement = previous;
}
public void setNext(DobleCadenaNodo<E> next)
{
nextElement = next;
}
public E value()
{
return conjunto;
}
public void setValue(E value)
{
conjunto = value;
}
}