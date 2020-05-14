package ejemplointerfaces;

public class Principal {
	public static void main(String[] args)
	{
		Tren t= new Tren("001",0);
		System.out.println(t.getIdVehiculo());
		
		System.out.println("Velocidad="+ t.getVelocidad());
		
		for(int i=0;i<10;i++)
		{
			t.acelerar();
		}
		
		System.out.println("Velocidad="+ t.getVelocidad());
		t.imprimirUbicacionGeografica();
		t.resumirMetodosTren();
	}//main
}//Principal


