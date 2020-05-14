package ejemploGUI;

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
	private JTextField txtNombreDelEmpleado;
	private JTextField txtApellidosDelEmpleado;
	private JTextField txtId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditorPersona frame = new EditorPersona();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EditorPersona() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 428, 252);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pnBotonera = new JPanel();
		contentPane.add(pnBotonera, BorderLayout.SOUTH);
		
		JButton btnNuevo = new JButton("Nuevo");
		
		btnNuevo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});

		pnBotonera.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		pnBotonera.add(btnNuevo);
		
		JButton btnGuardar = new JButton("Guardar");
		pnBotonera.add(btnGuardar);
		
		JButton btnEliminar = new JButton("Eliminar");
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
		txtNombreDelEmpleado.setBounds(107, 64, 226, 22);
		pnFormulario.add(txtNombreDelEmpleado);
		txtNombreDelEmpleado.setColumns(20);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(50, 112, 56, 16);
		pnFormulario.add(lblApellidos);
		
		txtApellidosDelEmpleado = new JTextField();
		txtApellidosDelEmpleado.setFont(new Font("Tahoma", Font.ITALIC, 13));
		txtApellidosDelEmpleado.setText("Apellidos del empleado");
		txtApellidosDelEmpleado.setBounds(107, 109, 226, 22);
		pnFormulario.add(txtApellidosDelEmpleado);
		txtApellidosDelEmpleado.setColumns(10);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(50, 29, 45, 16);
		pnFormulario.add(lblId);
		
		txtId = new JTextField();
		txtId.setText("id");
		txtId.setFont(new Font("Tahoma", Font.ITALIC, 13));
		txtId.setColumns(20);
		txtId.setBounds(107, 26, 226, 22);
		pnFormulario.add(txtId);
	}
}
