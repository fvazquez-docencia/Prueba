package ejemploserializacion;

import java.io.Serializable;

public class Persona implements Serializable{

	public String nombre;
	public String apellidos;
	public Direccion direccion;
	
	public Persona(String nombre, String apellidos, Direccion direccion)
	{
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.direccion=direccion;
	}
	
}


