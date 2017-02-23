public class CircularList<E> extends AbstractList<E>{
protected Nodo<E> tail; 
protected int contador;

public CircularList(){
   tail = 0;
   count = 0;
}
public void addFirst(E value)
{
   Nodo<E> temp = new Nodo<E>(value);
   if (tail == null) { 
       tail = temp;
       tail.setNext(tail);
   } else { 
       temp.setNext(tail.next());
       tail.setNext(temp);
   }
   contador++;
}
public void addLast(E value){
   addFirst(value);
   tail = tail.next();
}
public E removeLast()
{
   Nodo<E> finger = tail;
   while (finger.next() != tail) {
       finger = finger.next();
   }
   Nodo<E> temp = tail;
   if (finger == tail)
   {
       tail = null;
   } else {
       finger.setNext(tail.next());
       tail = finger;
   }
   count--;
   return temp.value();
}
}