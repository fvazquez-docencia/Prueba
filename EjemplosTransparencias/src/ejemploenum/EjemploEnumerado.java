package ejemploenum;

enum Colores {
	ROJO, AZUL, VERDE
}

public class EjemploEnumerado {

	enum DiaSemana {
		LUNES(1,"Lunes"),
		MARTES(2,"Martes"),
		MIERCOLES(3,"Miércoles"),
		JUEVES(4,"Jueves"),
		VIERNES(5,"Viernes"),
		SABADO(6,"Sábado"),
		DOMINGO(7,"Domingo");
		
		DiaSemana(int dia,String nombreDia)
		{
			
		}
		
		int idDia;
		String nombreDia;
		
		String getDia() {
		      return nombreDia;
		   } 
	}//enum
	

	public static void main(String args[]) {
		DiaSemana dia= DiaSemana.MIERCOLES;

		switch (dia) {
		case LUNES:
			System.out.println("Lunes");
			break;
		case MARTES:
			System.out.println("Martes");
			break;
		case MIERCOLES:
			System.out.println("Miércoles");
			break;
		case JUEVES:
			System.out.println("Jueves");
			break;
		case VIERNES:
			System.out.println("Viernes");
			break;
		case SABADO:
			System.out.println("Sábado");
			break;
		case DOMINGO:
			System.out.println("Domingo");
			break;
		}
		
		
		//Obtener el enumerado como array
		DiaSemana arr[] = DiaSemana.values();
 
        for (DiaSemana ds : arr)
        {
            System.out.println(ds + " en el índice "
                             + ds.ordinal());//Posición en la enumeración
        }
 
        // Usando valueOf(). Devuelve un objeto de
        //Tipo DiaSemana correspondiente a la constante pasada
        System.out.println(DiaSemana.valueOf("MARTES"));

	}// main
}// class

