package ejemplopolimorfismo2;

class Avion extends Aereo{
	private int numMotores;
	public Avion(int numMotores)
	{
		this.numMotores=numMotores;
	}
	public void getInfo()
	{
		System.out.println("Avion");
	}
	public void getNumMotores() {
		System.out.println("Tiene " +numMotores + " motores");
	}
}//Avion

class Helicoptero extends Aereo{
	public void getInfo() {
		System.out.println("Helicoptero");
	}
}

public class Polimorfismo {

	public static void main(String[] args) {
		MedioTransporte mt;//Asignaci�n polimorfia
		mt= new Avion(4);
		
		mt.getInfo();//Ejecuci�n polimorfa. Se accede al m�todo de Avi�n

		System.out.println(mt.getClass().toString());//La clase del objeto en
													//ejecuci�n es Avion
		
		((Avion)mt).getNumMotores();//casteo a Avion para acceder a su m�todo
	}//main

}//Polimorfismo
