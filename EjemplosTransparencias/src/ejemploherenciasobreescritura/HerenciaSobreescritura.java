package ejemploherenciasobreescritura;


class A{
	public void metodoA() {
		System.out.println("metodoA en A");
	}
	public void metodoSobreescrito1() {
		System.out.println("metodoSobreescrito1 en A");
	}
	public void metodoSobreescrito2() {
		System.out.println("metodoSobreescrito2 en A");
	}
	
	public static void metodoSobreescritoEstatico() {
		System.out.println("metodoSobreescrito estatico en A");
	}
}//classA

class B extends A{
	public void metodoB() {
		System.out.println("metodoB en B");
	}
	@Override
	public void metodoSobreescrito1() {
		System.out.println("metodoSobreescrito1 en B");
	}
	@Override
	public void metodoSobreescrito2() {
		System.out.println("metodoSobreescrito2 en B");
		super.metodoSobreescrito2();
	}
	
	public static void metodoSobreescritoEstatico() {
		System.out.println("metodoSobreescrito estatico en B");
	}
}//classB

class C extends B{
	public void metodoC() {
		System.out.println("metodoC en C");
	}
	@Override
	public void metodoSobreescrito1() {
		System.out.println("metodoSobreescrito1 en C");
	}
	@Override
	public void metodoSobreescrito2() {
		System.out.println("metodoSobreescrito2 en C");
		super.metodoSobreescrito2();
	}
	
	public static void metodoSobreescritoEstatico() {
		System.out.println("metodoSobreescrito estatico en C");
	}
}//classB

public class HerenciaSobreescritura {
	public static void main(String[] args) {
		C obj= new C();
		obj.metodoA();//metodoA en A
		obj.metodoB();//metodoB en B
		obj.metodoC();//metodoC en C
		System.out.println("---------------------------");
		obj.metodoSobreescrito1();//metodoSobreescrito1 en C
		((B)obj).metodoSobreescrito1();//metodoSobreescrito1 en C
		((A)obj).metodoSobreescrito1();//metodoSobreescrito1 en C
		System.out.println("---------------------------");
		obj.metodoSobreescrito2();	//metodoSobreescrito2 en C
									//metodoSobreescrito2 en B
									//metodoSobreescrito2 en A
		System.out.println("---------------------------");
		obj.metodoSobreescritoEstatico();//metodoSobreescrito estatico en C
		((B)obj).metodoSobreescritoEstatico();//metodoSobreescrito estatico en B
		((A)obj).metodoSobreescritoEstatico();//metodoSobreescrito estatico en A
		
	}
}//class HerenciaSobreescritura





