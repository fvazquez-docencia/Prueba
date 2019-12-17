import java.util.Scanner;

/*
 * .Realizar un diagrama de flujo de un programa que lea por pantalla la nómina bruta 
 * mensual de 3 empleados y, dado que los empleados tienen 14 pagas anuales y 
 * se les realiza una retención del 12% en 12 de esas pagas, 
 * mostrar por pantalla tanto la nómina anual bruta como la nómina anual neta. 
 */
public class Ejercicio20 {

	public static void main(String[] args) {
		// definición de variables
		int nominaBrMensual=0;
		int numPagas=14;
		int numPagasRetenc=12;
		double retencion=0.12;
		int numEmp=3;
		int nominaAnualBruta=0;
		double nominaAnualNeta =0;
		
		Scanner sc= new Scanner(System.in);
		
		boolean valorCorrecto;
		
		for(int i=0;i<numEmp;i++)
		{
			valorCorrecto=false;
			
			while(valorCorrecto==false)
			{
				System.out.println("Introduce el valor de la nómina para el empleado " + i);
				if(sc.hasNextInt())
				{
					nominaBrMensual=sc.nextInt();
					valorCorrecto=true;
				}
				else
				{
					sc.next();
					valorCorrecto=false;
				}
			}
			
			double nominaNetaMensual;
			//nomina del empleado correcta
			for(int j=0;j<numPagas;j++)//Bucle pagas
			{
				if(j<numPagasRetenc)
				{
					nominaNetaMensual=nominaBrMensual-(nominaBrMensual*retencion);					
				}
				else
				{
					nominaNetaMensual=nominaBrMensual;
				}
				nominaAnualNeta=nominaAnualNeta+nominaNetaMensual;
				nominaAnualBruta=nominaAnualBruta+nominaBrMensual;
			}
			
			
			//Impresión por pantalla
			System.out.println("La nomina bruta anual es: " + nominaAnualBruta);
			System.out.println("La nomina neta anual es: " + nominaAnualNeta);
			
			
			//reinicio de variables
			nominaAnualBruta=0;
			nominaAnualNeta =0;
			
		}//for empleados

	}//main

}
