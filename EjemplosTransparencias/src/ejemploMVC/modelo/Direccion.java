package ejemploMVC.modelo;

public class Direccion {
	private String direccion;
	private int numero;
	
	public Direccion(String direccion, int numero)
	{
		this.direccion=direccion;
		this.numero=numero;
	}//Direccion
	
	public String getDireccion() {
		return direccion;
	}//getDireccion
	
	public int getNumero() {
		return numero;
	}//getNumero
	
	@Override
	public String toString() {
		return String.format("\nDireccion:%s\nNúmero:%s",direccion,numero);
	}//toString
	
}//class

