
public class PilaFactory {

    public PilaFactory() {
    }

    public AbstractPila fabStack(){

        Scanner scan = new Scanner(System.in);
	      int choice = 0;
        System.out.println("Ingrese 1 para vector, y 2 para Array: \n");
        choice = scan.nextInt();
        Object pila;
        pila = new Object();

        switch(choice){
            case 1:
                System.out.println("Vector");
                VectorPila vector = new VectorPila();
                pila = vector;
                break;
            case 2:
                System.out.println("Array");
                ArrayListPila array = new ArrayListPila();
                pila = array;
                break;
            case 3:
                System.out.println("Lista");
                ListaPila lista = new ListaPila();
                pila = lista;
                break;
        }
            return (AbstractStack) pila;
    }

}
