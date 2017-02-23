public class SimpleCadenaList<E> extends AbstractList<E>{
    protected int contador; 
   protected Nodo<E> head; 
   public SimpleCadenaList(){
      head = null;
      contador = 0;
   }
   public int size(){
    return contador;
  }
  public void addFirst(E value){
     head = new Nodo<E>(value, head);
     contador++;
  }
  public E removeFirst(){
     Nodo<E> temp = head;
     head = head.next(); 
     contador--;
     return temp.value();
  }
  public E getFirst(){
      return head.value();
  }
  public void addLast(E value)
  {
      Nodo<E> temp = new Nodo<E>(value,null);
      if (head != null)
     {
         Nodo<E> finger = head;
         while (finger.next() != null)
         {
                finger = finger.next();
         }
         finger.setNext(temp);
      } else head = temp;
	  contador++;
   }
   public boolean contains(E value){
      Nodo<E> finger = head;
      while (finger != null &&
             !finger.value().equals(value))
     {
          finger = finger.next();
      }
      return finger != null;
    }
}