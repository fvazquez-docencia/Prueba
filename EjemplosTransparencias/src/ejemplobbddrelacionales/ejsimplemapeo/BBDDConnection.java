package ejemplobbddrelacionales.ejsimplemapeo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BBDDConnection {

	private static Connection conexion = null;

	public static void CargarDriverConexionBBDD() throws ClassNotFoundException {
		// Cargar el driver de conexi�n con base de datos
		Class.forName("org.mariadb.jdbc.Driver");

	}

	public static Connection obtenerConexion() throws SQLException {
		if (conexion == null) {
			String url = "jdbc:mariadb://localhost:3306/transparencias";
			Connection con = DriverManager.getConnection(url, "root", "");
			conexion = con;
		}
		return conexion;
	}// obtenerConexion
	
	public static void cerrarConexion() throws SQLException
	{
		if(conexion!=null) {
			conexion.close();
			conexion=null;
		}
	}

	public static ArrayList<Persona> obtenerListadoPersonas() {
		ArrayList<Persona> lista = new ArrayList<>();

		try {
			BBDDConnection.CargarDriverConexionBBDD();
			Connection con = BBDDConnection.obtenerConexion();

			// Creaci�n del objeto Statement a partir de la conexi�n
			// Sirve para realizar consultas sobre la base de datos
			Statement st = con.createStatement();
			st.execute("Select id,nombre,apellidos as apell from persona");
			// Creaci�n del objeto ResultSet
			// Representa una tabla en memoria con los datos consultados
			ResultSet rs = st.getResultSet();
			while (rs.next()) {// Mientras haya elementos en el ResultSet
				// Se obtiene el elemento de la primera columna
				// seg�n el orden de la consulta (si ponemos * en el select
				// el orden ser� el mismo que el de la tabla)
				int id = rs.getInt(1);
				// Tambi�n se puede obtener por el nombre de la columna
				// en el ResultSet (si usamos alias pondr�amos ese)
				String nombre = rs.getString("nombre");
				String apellidos = rs.getString("apell");
				Persona p = new Persona(id, nombre, apellidos);
				lista.add(p);
			}

			rs.close();
			st.close();
		} catch (java.lang.ClassNotFoundException e) {
			System.out.println("No se ha encontrado la clase del driver");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return lista;
	}

	public static void guardarListadoPersonas(ArrayList<Persona> listaPersonas) {

		ArrayList<Persona> listaInsertar = new ArrayList<Persona>();
		ArrayList<Persona> listaModificar = new ArrayList<Persona>();

		for (Persona p : listaPersonas) {
			if (p.id == 0) {
				listaInsertar.add(p);
			} else {
				listaModificar.add(p);
			}
		}
		//insertarListadoPersonasPorLotes(listaInsertar);
		actualizarListadoPersonasPorLotes(listaModificar);
	}

	private static void insertarListadoPersonas(ArrayList<Persona> listaPersonas) {
		try {
			BBDDConnection.CargarDriverConexionBBDD();
			Connection con = BBDDConnection.obtenerConexion();
			for (Persona p : listaPersonas) {
				//Creo el objeto PreparedStatement sobre la conexi�n
				// e indicando que recibe dos par�metros
				PreparedStatement ps = con.prepareStatement("INSERT INTO persona (nombre,apellidos) VALUES (?, ?)");

				//Asigno valor a los par�metros mediante m�todos set
				//El primer argumento es el orden  de par�metros dentro de la consulta (empieza en 1)
				//Tambi�n es �til porque se indica el tipo de lo recibido
				ps.setString(1, p.nombre);
				ps.setString(2, p.apellidos);
				ps.executeUpdate();
				ps.close();
			}

		} catch (java.lang.ClassNotFoundException e) {
			System.out.println("No se ha encontrado la clase del driver");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void insertarListadoPersonasPorLotes(ArrayList<Persona> listaPersonas) {
		try {
			BBDDConnection.CargarDriverConexionBBDD();
			Connection con = BBDDConnection.obtenerConexion();
			
			//Creo el objeto PreparedStatement sobre la conexi�n
			// e indicando que recibe dos par�metros
			PreparedStatement ps = con.prepareStatement("INSERT INTO persona (nombre,apellidos) VALUES (?, ?)");
			
			for (Persona p : listaPersonas) {
				ps.setString(1, p.nombre);
				ps.setString(2, p.apellidos);
				ps.addBatch();//Se a�ade la consulta al lote de ejecuci�n	
			}
			
			//Cuando se termina de a�adir valores se ejecuta
			ps.executeBatch();
			
			ps.close();

		} catch (java.lang.ClassNotFoundException e) {
			System.out.println("No se ha encontrado la clase del driver");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void actualizarListadoPersonas(ArrayList<Persona> listaPersonas) {

		try {
			BBDDConnection.CargarDriverConexionBBDD();
			Connection con = BBDDConnection.obtenerConexion();
			for (Persona p : listaPersonas) {
				PreparedStatement ps = con
						.prepareStatement("UPDATE persona SET nombre = ?, apellidos = ? WHERE id = ?");

				// set the preparedstatement parameters
				ps.setString(1, p.nombre);
				ps.setString(2, p.apellidos);
				ps.setInt(3, p.id);
				ps.executeUpdate();
				ps.close();
			}

		} catch (java.lang.ClassNotFoundException e) {
			System.out.println("No se ha encontrado la clase del driver");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private static void actualizarListadoPersonasPorLotes(ArrayList<Persona> listaPersonas) {

		try {
			BBDDConnection.CargarDriverConexionBBDD();
			Connection con = BBDDConnection.obtenerConexion();
			
			PreparedStatement ps = con
					.prepareStatement("UPDATE persona SET nombre = ?, apellidos = ? WHERE id = ?");
			
			for (Persona p : listaPersonas) {
				ps.setString(1, p.nombre);
				ps.setString(2, p.apellidos);
				ps.setInt(3, p.id);
				ps.addBatch();
				
			}
			
			ps.executeBatch();
			ps.close();

		} catch (java.lang.ClassNotFoundException e) {
			System.out.println("No se ha encontrado la clase del driver");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	
	public static void eliminarListadoPersonas(ArrayList<Persona> listaPersonas) {

		try {
			BBDDConnection.CargarDriverConexionBBDD();
			Connection con = BBDDConnection.obtenerConexion();
			for (Persona p : listaPersonas) {
				PreparedStatement ps = con
						.prepareStatement("DELETE FROM persona WHERE id = ?");

				ps.setInt(1, p.id);
				ps.executeUpdate();
				ps.close();
			}

		} catch (java.lang.ClassNotFoundException e) {
			System.out.println("No se ha encontrado la clase del driver");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	public static void eliminarListadoPersonasPorLotes(ArrayList<Persona> listaPersonas) {

		try {
			BBDDConnection.CargarDriverConexionBBDD();
			Connection con = BBDDConnection.obtenerConexion();
			
			PreparedStatement ps = con
					.prepareStatement("DELETE FROM persona WHERE id = ?");
			
			for (Persona p : listaPersonas) {
				ps.setInt(1, p.id);
				ps.addBatch();
			}
			
			ps.executeBatch();
			ps.close();

		} catch (java.lang.ClassNotFoundException e) {
			System.out.println("No se ha encontrado la clase del driver");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}// class
