package ejemploGUI.modelo;

public class Persona {
	//propiedades
	private int id;
	private String nombre;
	private String apellidos;
	//constructor
	public Persona(int id, String nombre, String apellidos) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	//metodos
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
}//Persona


