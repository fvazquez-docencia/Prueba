package ejemploaccesoficheros.ejemploxml;

public class Empleado {
	private String nombre;
	private String apellidos;
	private Direccion direccion;
	
	public Empleado(String nombre, String apellidos, Direccion direccion)
	{
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.direccion=direccion;
	}//Empleado
	
	public String getNombre() {
		return nombre;
	}//getNombre
	
	public String getApellidos() {
		return apellidos;
	}//getApellidos
	
	public Direccion getDireccion() {
		return direccion;
	}//getDireccion
	
	@Override
	public String toString() {
		return String.format("Nombre:%s\nApellidos:%s\nDireccion:%s",this.nombre,this.apellidos,this.direccion);
	}//toString
}//class

