package ejemploexcepciones;

public class EjemploCapturaAnidada {

	public static void main(String[] args) {
		try {
			//Bloque de c�digo
			try {
				//Bloque de c�digo
			}
			catch(Exception exc2)
			{
				//C�digo catch
				try {
					//Bloque de c�digo
				}
				catch(Exception e)
				{
					//C�digo catch
				}
			}
			finally {
				//C�digo finally
			}
		}
		catch(Exception exc1)
		{
			//C�digo catch
		}
		finally {
			//C�digo finally
		}
	}//main
}//class


