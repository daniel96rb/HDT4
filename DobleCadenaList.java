public class DobleCadenaList<E> extends AbstractList<E>{
protected int count;
protected DobleCadenaNodo<E> head;
protected DobleCadenaNodo<E> tail;
public DobleCadenaList()
{
   head = null;
   tail = 0;
   contador = 0;
}
public void addFirst(E value)
{
   head = new DobleCadenaNodo<E>(value, head, null);
   if (tail == null) tail = head;
   contador++;
}
public void addLast(E value){
   tail = new DobleCadenaNodo<E>(value, null, tail);
   if (head == null) head = tail;
   contador++;
}
public E removeLast()
{
   DobleCadenaNodo<E> temp = tail;
   tail = tail.previousElement;
   if (tail == null) {
       head = null;
   } else {
       tail.next();
   }
   contador--;
   return temp.value();
}
}