package ejemplointerfaces;

public class Tren implements Operable {
	private String id;
	private int velocidad;
	
	Tren(String id, int velocidad)
	{
		this.id=id;
		this.velocidad=velocidad;
	}//constructor
		
	public String getIdVehiculo() {
		return ("Tren con id:"+this.id);
	}//getIdVehiculo

	public void acelerar() {
		velocidad++;
	}//acelerar

	public void frenar() {
		velocidad--;
	}//frenar

	public int getVelocidad()
	{
		return this.velocidad;
	}//getVelocidad
		
	public void resumirMetodosTren() {
		System.out.println("getVelocidad");
		Operable.imprimirMetodosInterfaz();//Aunque es un método estático en IOperable entramos a través del 
											//nombre de una clase que lo implementa
	}//resumirMetodosTren
}//Tren
