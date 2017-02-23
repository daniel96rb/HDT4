public class Nodo<E> {
    protected E conjunto; 
    protected Nodo<E> next_Element; 
    public Nodo(E x, Nodo<E> next){
    conjunto = x;
    next_Element = next;
}
    public Nodo(E x)
{
    this(x,null);
}
    public Nodo<E> next(){
    return next_Element;
}
public void setNext(Nodo<E> next){
next_Element = next;
}
public E value(){
return conjunto;
}
public void setValue(E value){
conjunto = value;
}
}