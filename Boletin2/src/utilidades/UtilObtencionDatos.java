package utilidades;

import java.util.Scanner;

public class UtilObtencionDatos {

	public static int obtenerValorEntero(String mensaje)
	{
		int valor=0;

		Scanner sc;
		sc= new Scanner(System.in);
		
		boolean valorCorrecto=false;
		while(valorCorrecto==false)
		{
			System.out.println(mensaje);
			if(sc.hasNextInt())
			{
				valor=sc.nextInt();
				valorCorrecto=true;
			}
			else
			{
				sc.next();
				valorCorrecto=false;
			}
		}//while
		return valor;
	}//metodo
}
