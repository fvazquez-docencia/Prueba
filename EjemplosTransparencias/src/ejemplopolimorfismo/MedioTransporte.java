package ejemplopolimorfismo;

public interface MedioTransporte {
	default public void getInfo() {
		System.out.println("Medio de transporte");
	}
}//MedioTransporte

class Aereo implements MedioTransporte{
	public void getInfo() {
		System.out.println("Aereo");
	}
}//Aereo



