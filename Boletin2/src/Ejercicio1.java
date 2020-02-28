import java.util.Scanner;

import utilidades.UtilObtencionDatos;

/*
 * Pedir dos números por teclado y mostrar por pantalla los siguientes 
 * resultadosde la operación entre ambos números: 
 * Suma, resta, multiplicación,  división real y divisiónentera 
 * junto con el resto. 
 * (La resta y la divisiones realizarla entre el número mayor y elmenor).
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		// 
		int num1;
		int num2;
		
		num1=UtilObtencionDatos.obtenerValorEntero("Introduce el primer valor entero");
		num2=UtilObtencionDatos.obtenerValorEntero("Introduce el segundo valor entero");

		
		int res=calcularSuma(num1, num2);
		System.out.printf("La suma de %d y %d es %d",num1,num2,res);
		
		//System.out.printf("La suma de 3 y 8 es %d",calcularSuma(3, 8));
		
		calcularEImprimirResta(num1, num2);
		
		
	}//main
	

	private static int calcularSuma(int n1, int n2)
	{
		int resultado=n1+n2;		
		return resultado;
	}
	
	
	private static void calcularEImprimirResta(int n1, int n2)
	{
		System.out.printf("La resta de %d y %d es %d",n1,n2,n1-n2);
	}
	

}//class
