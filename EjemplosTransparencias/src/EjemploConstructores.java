
@SuppressWarnings("unused")

public class EjemploConstructores {

	public static void main(String[] args) {
		Persona p1= new Persona();
		
		p1.setNombre("Felipe");
		p1.setEdad(28);
		
		System.out.println("Nombre:" + p1.getNombre() + " Edad: " + p1.getEdad());
				
		
		
	}

}

@SuppressWarnings("unused")

class Persona
{
	
	private String nombre;
	private int edad;
	
	public Persona(String nombre)
	{
		this.nombre=nombre;
	}
	public Persona(String nombre, int edad)
	{
		this.nombre=nombre;
		this.edad=edad;
	}
	
	//Constructor por defecto. 
	//Si no se define ningun constructor adicional 
	//no haría falta definirlo
	//Si declaramos un constructor (y queremos mantener también este)
	//es necesario declararlo, aunque sea el que existe por defecto
	public Persona()
	{
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public void setEdad(int edad)
	{
		this.edad=edad;
	}
}



