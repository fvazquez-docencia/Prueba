package ejemploexcepciones;

public class EjemploCapturaAnidada {

	public static void main(String[] args) {
		try {
			//Bloque de código
			try {
				//Bloque de código
			}
			catch(Exception exc2)
			{
				//Código catch
				try {
					//Bloque de código
				}
				catch(Exception e)
				{
					//Código catch
				}
			}
			finally {
				//Código finally
			}
		}
		catch(Exception exc1)
		{
			//Código catch
		}
		finally {
			//Código finally
		}
	}//main
}//class


