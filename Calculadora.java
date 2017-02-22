/* Clase Calculadora que implementa a la interface iCalculadora realizando todos los calculos necesarios */
public class Calculadora{

  private Pila <Double> operacion = new Pila<Double>();

  /* Constructor de la clase*/
  public Calculadora(){
  }

/* Interpreta la expresion del texto del documento y realiza las operaciones */
   public double operar(String datos){
     int contador=0;
     while(contador < datos.length()){
         if (datos.charAt(contador) == '0'){
           operacion.push(0.0);
         }
         else if (datos.charAt(contador) == '1'){
           operacion.push(1.0);
         }
         else if (datos.charAt(contador) == '2'){
           operacion.push(2.0);
         }
         else if (datos.charAt(contador) == '3'){
           operacion.push(3.0);
         }
         else if (datos.charAt(contador) == '4'){
           operacion.push(4.0);
         }
         else if (datos.charAt(contador) == '5'){
           operacion.push(5.0);
         }
         else if (datos.charAt(contador) == '6'){
           operacion.push(6.0);
         }
         else if (datos.charAt(contador) == '7'){
           operacion.push(7.0);
         }
         else if (datos.charAt(contador) == '8'){
           operacion.push(8.0);
         }
         else if (datos.charAt(contador) == '9'){
           operacion.push(9.0);
         }
         else if (datos.charAt(contador) == '+'){
           double x = (double) operacion.pop();
           double y = (double) operacion.pop();
           double resultado = suma(x,y);
           operacion.push(resultado);
         }
         else if (datos.charAt(contador) == '-'){
           double x = (double) operacion.pop();
           double y = (double) operacion.pop();
           double resultado = resta(x,y);
           operacion.push(resultado);
         }
         else if (datos.charAt(contador) == '*'){
           double x = (double) operacion.pop();
           double y = (double) operacion.pop();
           double resultado = multiplicacion(x,y);
           operacion.push(resultado);
         }
         else if (datos.charAt(contador) == '/'){
           double x = (double) operacion.pop();
           double y = (double) operacion.pop();
           double resultado = division(x,y);
           operacion.push(resultado);
         }
         contador++;
     }
     return (double)operacion.pop(); // Devolucion del resultado
   }

  /* Realiza la suma de los operandos */
	public double suma(double x, double y) {
		return x + y;
	}

  /* Realiza la resta de los operandos */
	public double resta(double x, double y) {
		return x - y;
	}

  /* Realiza la multiplicacion de los operandos */
	public double multiplicacion(double x, double y) {
		return x * y;
	}

  /* Realiza la division de los operandos */
	public double division(double x, double y) {
		return x / y;
	}
}
