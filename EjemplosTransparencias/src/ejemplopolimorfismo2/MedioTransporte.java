package ejemplopolimorfismo2;

public abstract class MedioTransporte {
	public void getInfo() {
		System.out.println("Medio de transporte");
	}
}//MedioTransporte

class Aereo extends MedioTransporte{
	public void getInfo() {
		System.out.println("Aereo");
	}
}//Aereo




