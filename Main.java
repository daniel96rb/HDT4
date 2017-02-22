/*
Algoritmos y Estructuras de Datos
Seccion 10
Hoja de Trabajo # 4 Stack
@author Emilio Diaz #15316
@author Daniel Rodriguez #15796
*/
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/* Clase Main */
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader scanner = new BufferedReader(new FileReader(new File("datos.txt"))); // Scanner que interpreta el archivo .txt
		String texto =  scanner.readLine(); // Convierte la expresion a tipo String
		Calculadora calculadora = new Calculadora(); // Objeto de tipo Calculadora
		Double resultado =	calculadora.operar(texto); // Resultado al evaluar la expresion con el metodo operar de la clase calculadora */

		/* Representacion del resultado en pantalla */
		System.out.println("\nEl resultado de toda la operacion expresada en el documento es: ");
		System.out.println(resultado);
		}

	}
