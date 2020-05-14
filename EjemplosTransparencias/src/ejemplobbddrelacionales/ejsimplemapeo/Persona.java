package ejemplobbddrelacionales.ejsimplemapeo;

public class Persona {
	
	public int id;
	public String nombre;
	public String apellidos;
	
	public Persona(int id, String nombre, String apellidos)
	{
		this.id=id;
		this.apellidos=apellidos;
		this.nombre=nombre;
	}
	
	@Override
	public String toString() {
		return "Id: " + id + "\nNombre: " + this.nombre + "\nApellidos: " + this.apellidos;
	}
}

