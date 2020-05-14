package ejemplobbddrelacionales.ejsimplemapeo;

import java.util.ArrayList;

public class EjemploConexionBBDD {

	public static void main(String[] args) {
		ArrayList<Persona> listaPersonas;
		listaPersonas=BBDDConnection.obtenerListadoPersonas();
		
		
		for(Persona p: listaPersonas) {
			System.out.println(p);
		}
		
/*
		//Modifico un elemento de la lista
		Persona p= listaPersonas.get(2);
		p.apellidos="Nuñez Feijoo";
		p.nombre="Alberto";
		
		
		//Creo un nuevo elemento (sin id) para insertar
		Persona nuevaPersona = new Persona(0, "Jose Manuel", "Graña López");
		listaPersonas.add(nuevaPersona);
		
		BBDDConnection.guardarListadoPersonas(listaPersonas);
	*/
		/*
		ArrayList<Persona> listaEliminar=  new ArrayList<Persona>();
		listaEliminar.add(listaPersonas.get(listaPersonas.size()-1));
		BBDDConnection.eliminarListadoPersonas(listaEliminar);
	*/
		
		//INSERCIÓN POR LOTES
//		Persona p1= new Persona(0,"Persona1","Apellidos1");
//		Persona p2= new Persona(0,"Persona2","Apellidos2");
//		Persona p3= new Persona(0,"Persona3","Apellidos3");
//		ArrayList<Persona> listaAnhadir=  new ArrayList<Persona>();
//		listaAnhadir.add(p1);
//		listaAnhadir.add(p2);
//		listaAnhadir.add(p3);
		//BBDDConnection.guardarListadoPersonas(listaAnhadir);
	
		//Modificación por lotes
//		ArrayList<Persona> listaModificar=  new ArrayList<Persona>();
//		listaModificar.add(listaPersonas.get(listaPersonas.size()-1));
//		listaModificar.get(0).apellidos="Prueba de mod4";
//		listaModificar.add(listaPersonas.get(listaPersonas.size()-2));
//		listaModificar.get(1).apellidos="Prueba de mod3";
//		BBDDConnection.guardarListadoPersonas(listaModificar);
		
		
		//Eliminación por lotes
		ArrayList<Persona> listaEliminar=  new ArrayList<Persona>();
		listaEliminar.add(listaPersonas.get(listaPersonas.size()-1));
		listaEliminar.add(listaPersonas.get(listaPersonas.size()-2));
		BBDDConnection.eliminarListadoPersonasPorLotes(listaEliminar);
		
	
	}
	
	
	

}
