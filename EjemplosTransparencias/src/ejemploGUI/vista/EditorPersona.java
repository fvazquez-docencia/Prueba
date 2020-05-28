package ejemploGUI.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JInternalFrame;
import javax.swing.BoxLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EditorPersona extends JFrame {

	private JPanel contentPane;
	public JTextField txtNombreDelEmpleado;
	public JTextField txtApellidosDelEmpleado;
	private JTextField txtId;
	private JButton btnNuevo;
	private JButton btnSiguiente;
	private JButton btnAnterior;
	private JButton btnGuardar;
	private JButton btnEliminar;
	
	/**
	 * Create the frame.
	 */
	public EditorPersona() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 272);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel pnBotonera = new JPanel();
		contentPane.add(pnBotonera, BorderLayout.SOUTH);

		btnNuevo = new JButton("Nuevo");

		pnBotonera.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		pnBotonera.add(btnNuevo);

		btnGuardar = new JButton("Guardar");
		pnBotonera.add(btnGuardar);

		btnEliminar = new JButton("Eliminar");
		pnBotonera.add(btnEliminar);

		JPanel pnFormulario = new JPanel();
		contentPane.add(pnFormulario, BorderLayout.CENTER);
		pnFormulario.setLayout(null);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(50, 67, 45, 16);
		lblNombre.setLabelFor(lblNombre);
		pnFormulario.add(lblNombre);

		txtNombreDelEmpleado = new JTextField();
		txtNombreDelEmpleado.setFont(new Font("Tahoma", Font.ITALIC, 13));
		txtNombreDelEmpleado.setText("nombre del empleado");
		txtNombreDelEmpleado.setBounds(117, 64, 226, 22);
		pnFormulario.add(txtNombreDelEmpleado);
		txtNombreDelEmpleado.setColumns(20);

		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(50, 102, 56, 16);
		pnFormulario.add(lblApellidos);

		txtApellidosDelEmpleado = new JTextField();
		txtApellidosDelEmpleado.setFont(new Font("Tahoma", Font.ITALIC, 13));
		txtApellidosDelEmpleado.setText("Apellidos del empleado");
		txtApellidosDelEmpleado.setBounds(117, 99, 226, 22);
		pnFormulario.add(txtApellidosDelEmpleado);
		txtApellidosDelEmpleado.setColumns(10);

		JLabel lblId = new JLabel("Id");
		lblId.setBounds(50, 29, 45, 16);
		pnFormulario.add(lblId);

		txtId = new JTextField();
		txtId.setEditable(false);
		txtId.setText("id");
		txtId.setFont(new Font("Tahoma", Font.ITALIC, 13));
		txtId.setColumns(20);
		txtId.setBounds(117, 28, 226, 22);
		pnFormulario.add(txtId);

		btnSiguiente = new JButton(">");
		btnSiguiente.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSiguiente.setBounds(288, 144, 45, 25);
		pnFormulario.add(btnSiguiente);

		btnAnterior = new JButton("<");
		btnAnterior.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAnterior.setBounds(243, 144, 45, 25);
		pnFormulario.add(btnAnterior);
	}

	public void addbtNuevoClickActionListener(ActionListener listener) {
		btnNuevo.addActionListener(listener);
	}

	public void addbtSiguienteClickActionListener(ActionListener listener) {
		btnSiguiente.addActionListener(listener);
	}

	public void addbtAnteriorClickActionListener(ActionListener listener) {
		btnAnterior.addActionListener(listener);
	}
	
	public void addbtGuardarClickActionListener(ActionListener listener) {
		btnGuardar.addActionListener(listener);
	}
	
	public void addbtEliminarClickActionListener(ActionListener listener) {
		btnEliminar.addActionListener(listener);
	}

	public void actualizarDatos(String id, String nombre, String apellidos) {
		txtId.setText(id);
		txtNombreDelEmpleado.setText(nombre);
		txtApellidosDelEmpleado.setText(apellidos);

	}

}
