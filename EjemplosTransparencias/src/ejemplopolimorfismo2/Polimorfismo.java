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
		MedioTransporte mt;//Asignación polimorfia
		mt= new Avion(4);
		
		mt.getInfo();//Ejecución polimorfa. Se accede al método de Avión

		System.out.println(mt.getClass().toString());//La clase del objeto en
													//ejecución es Avion
		
		((Avion)mt).getNumMotores();//casteo a Avion para acceder a su método
	}//main

}//Polimorfismo
