package ejemploGUI.modelo;

import java.util.ArrayList;
import java.util.Comparator;

public class PersonaBBDDMock {
	private static ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

	public static void guardarPersona(Persona p) {
		if (p.getId() == 0) {//Es nuevo. Se añade
			int ultimoId = 0;
			if (listaPersonas.size() > 0)
				ultimoId = listaPersonas.stream().max(Comparator.comparing(pers -> pers.getId())).get().getId();
			p.setId(ultimoId + 1);
			listaPersonas.add(p);
		}
		else {//No es nuevo. Se modifica de la lista
			for(Persona persG:listaPersonas) {
				if(persG.getId()==p.getId()) {
					persG.setNombre(p.getNombre());
					persG.setApellidos(p.getApellidos());
				}
			}
		}
	}//guardarPersona

	public static Persona obtenerPersona(int id) {
		Persona persEncontrada = null;
		for (Persona p : listaPersonas) {
			if (p.getId() == id)
			{
				persEncontrada = p;
				break;
			}
		} // for

		return persEncontrada;

	}// obtenerPersona

	
	public static void eliminarPersona(Persona p) {
		for(Persona persG:listaPersonas) {
			if(persG.getId()==p.getId()) {
				listaPersonas.remove(persG);
				break;
			}
		}
	}//eliminarPersona
	
}
