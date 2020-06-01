package ejemploGUI.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ejemploGUI.modelo.Persona;
import ejemploGUI.modelo.PersonaBBDDMock;
import ejemploGUI.vista.EditorPersona;

public class ControladorPersona {
	private Persona modelo;
	private EditorPersona vista;
		
	public ControladorPersona(EditorPersona vista) {
		this.vista=vista;
		vista.setVisible(true);

		anhadirListeners();
		anhadirNuevaPersona();		
	}//ControladorPersona
	
	public void actualizarVista() {		
		vista.actualizarDatos(String.valueOf(modelo.getId()),modelo.getNombre(),modelo.getApellidos());
	}//actualizarVista
	
	public void obtenerSiguientePersona() {
		Persona sigPersona=PersonaBBDDMock.obtenerPersona(modelo.getId()+1);
		if(sigPersona!=null)
		{
			modelo=sigPersona;
			actualizarVista();
		}
	}//obtenerSiguientePersona
	
	public void obtenerAnteriorPersona() {
		Persona antPersona=PersonaBBDDMock.obtenerPersona(modelo.getId()-1);
		if(antPersona!=null)
		{
			modelo=antPersona;
			actualizarVista();
		}
	}//obtenerAnteriorPersona	
	
	public void guardarPersona() {
		modelo.setNombre(vista.txtNombreDelEmpleado.getText());
		modelo.setApellidos(vista.txtApellidosDelEmpleado.getText());
		PersonaBBDDMock.guardarPersona(modelo);
		actualizarVista();
	}//guardarPersona
	
	public void eliminarPersona() {
		PersonaBBDDMock.eliminarPersona(modelo);
		anhadirNuevaPersona();
	}//eliminarPersona
	
	private void anhadirNuevaPersona() {
		modelo = new Persona(0, "", "");
		actualizarVista();
	}//anhadirNuevaPersona
	
	
	private void anhadirListeners() {
		vista.addbtNuevoClickActionListener(new ActionListener()
	    {
	      public void actionPerformed(ActionEvent e)
	      {
	        anhadirNuevaPersona();
	      }
	    });		
		
		vista.addbtGuardarClickActionListener(new ActionListener()
	    {
	      public void actionPerformed(ActionEvent e)
	      {
	        guardarPersona();
	      }
	    });
		
		vista.addbtEliminarClickActionListener(new ActionListener()
	    {
	      public void actionPerformed(ActionEvent e)
	      {
	        eliminarPersona();
	      }
	    });
		
		vista.addbtSiguienteClickActionListener(new ActionListener()
	    {
	      public void actionPerformed(ActionEvent e)
	      {
	        obtenerSiguientePersona();
	      }
	    });
		
		vista.addbtAnteriorClickActionListener(new ActionListener()
	    {
	      public void actionPerformed(ActionEvent e)
	      {
	        obtenerAnteriorPersona();
	      }
	    });
	}//anhadirListeners
	
}//class

