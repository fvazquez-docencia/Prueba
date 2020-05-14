package ejemploserializacion;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class EjemploSerializacion {

	public static void main(String[] args) {
		Direccion d = new Direccion();
		d.calle = "Avenida de Oza";
		d.numero = 17;

		Persona p = new Persona("Jesus", "Iglesias", d);
		serializarPersona(p);
		
		Persona p2= new Persona("Laura","Gimenez",d);
		
		Persona p3= new Persona("María","Martinez",null);
		
		ArrayList<Persona> personas= new ArrayList<Persona>();
		personas.add(p);
		personas.add(p2);
		personas.add(p3);
		
		
		serializarPersonas(personas);
		
		ArrayList<Persona> lista2;
		lista2=deserializarPersonas();
		//Persona p2 = deserializarPersona();

		//System.out.println(p2.nombre);

	}

	public static void serializarPersona(Persona p) {

		// utilización de try-with-resources para que se cierren los streams al final
		try (FileOutputStream fos = new FileOutputStream("./prueba.bin", false);
				ObjectOutputStream os = new ObjectOutputStream(fos);) {
			os.writeObject(p);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}// serializarPersona

	public static Persona deserializarPersona() {
		Persona p = null;

		// utilización de try-with-resources para que se cierren los streams al final
		try (FileInputStream fis = new FileInputStream("./prueba.bin");
				ObjectInputStream os = new ObjectInputStream(fis);) {

			p = (Persona) os.readObject();// Hay que hacer un cast a Persona
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return p;
	}// deserializarPersona

	public static void serializarPersonas(ArrayList<Persona> listaPersonas) {
		// utilización de try-with-resources para que se cierren los streams al final
		try (FileOutputStream fos = new FileOutputStream("./pruebaLista.bin", false);
				ObjectOutputStream os = new ObjectOutputStream(fos);) {
			for (Persona p : listaPersonas) {
				os.writeObject(p);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}// serializarPersonas

	public static ArrayList<Persona> deserializarPersonas() {
		ArrayList<Persona> listaPersonas = new ArrayList<>();
		// utilización de try-with-resources para que se cierren los streams al final
		try (FileInputStream fis = new FileInputStream("./pruebaLista.bin");
				ObjectInputStream os = new ObjectInputStream(fis);) {
			Persona p = null;
			 while (fis.available()>0) {//Mientras hay bytes a leer
				p = (Persona) os.readObject();// Hay que hacer un cast a Persona
				if (p != null)
					listaPersonas.add(p);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return listaPersonas;
	}// deserializarPersonas

}// class
