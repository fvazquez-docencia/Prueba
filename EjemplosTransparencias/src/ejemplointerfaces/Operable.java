package ejemplointerfaces;

public interface Operable {
	public abstract String getIdVehiculo(); //En interfaces, si no ponemos abstract en un método
	public abstract void acelerar();		//sin cuerpo ya se considera abstracto, pero para no
	public abstract void frenar();			//confundiros intentad ponerlo siempre
	
	default public void imprimirUbicacionGeografica() {
		System.out.println("Implementación por defecto en interfaz");
	}//imprimirUbicacionGeografica
	
	public static void imprimirMetodosInterfaz()
	{
		System.out.println("getIdVehiculo,acelerar,frenar, imprimirUbicacionGeografica"
				+ ",imprimirMetodosInterfaz");
	}//imprimirMetodosInteraz
}//interfaz


