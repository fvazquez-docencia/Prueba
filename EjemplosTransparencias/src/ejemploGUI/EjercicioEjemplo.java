package ejemploGUI;

import java.awt.EventQueue;

import ejemploGUI.controlador.ControladorPersona;
import ejemploGUI.vista.EditorPersona;

public class EjercicioEjemplo {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					EditorPersona formulario = new EditorPersona();		
					ControladorPersona controlador= new ControladorPersona(formulario);									
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}//main
}//EjercicioEjemplo


