package ejemploaccesoficheros.ejemploxml;

import java.util.List;

public class EjemploXml {

	public static void main(String[] args) {
		List<Empleado> listaEmpleados;
		EmpleadoParser parser = new EmpleadoParser();
		try
		{
			String ruta=System.getProperty("user.dir") +"\\src\\ejemploaccesoficheros\\ejemploxml\\ListadoEmpleados.xml"; 
			listaEmpleados= parser.obtenerEmpleados(ruta);
			
			//Impresión de valores
			for(Empleado e: listaEmpleados) {
				System.out.println(e);
			}
			
			
			listaEmpleados.add(new Empleado("Prueba","Prueaba",new Direccion("direc",1)));
			
			ruta=System.getProperty("user.dir") +"\\src\\ejemploaccesoficheros\\ejemploxml\\ListadoGuardadoEmpleados.xml";
			parser.guardarEmpleados(ruta, listaEmpleados);
			
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
