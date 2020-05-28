package ejemploGUI;

import java.awt.EventQueue;

import ejemploGUI.controlador.ControladorPersona;
import ejemploGUI.vista.EditorPersona;

public class EjercicioEjemplo {


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					EditorPersona frame = new EditorPersona();
					
					ControladorPersona cp= new ControladorPersona(frame);
					
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
