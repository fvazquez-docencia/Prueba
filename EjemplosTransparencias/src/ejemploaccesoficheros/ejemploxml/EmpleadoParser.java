package ejemploaccesoficheros.ejemploxml;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class EmpleadoParser {
	public List<Empleado> obtenerEmpleados(String ruta) throws SAXException, IOException, ParserConfigurationException{
		List<Empleado> empleados= new ArrayList<Empleado>();
		//Clases DOM para la lectura del fichero XML
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        //Apertura y obtención del fichero xml
        Document document = builder.parse(new File(ruta));
        //Obtención de los nodos (<--->) del documento
        NodeList nodeList = document.getDocumentElement().getChildNodes(); 
        
        //Se recorren los nodos
        for (int i = 0; i < nodeList.getLength(); i++) {
             Node node = nodeList.item(i);
             if (node.getNodeType() == Node.ELEMENT_NODE) {//Si el nodo es un 'elemento DOM'
                  Element elEmp = (Element) node;             
                  //Busco el nodo que tiene el tag nombre (distingue mayúsculas y minúsculas)
                  //y obtengo el valor interno. El texto
                  String nombre = elEmp.getElementsByTagName("nombre")
                          .item(0).getChildNodes().item(0).getNodeValue();
                  String apellidos = elEmp.getElementsByTagName("apellidos")
                                      .item(0).getChildNodes().item(0).getNodeValue();
                  //Dirección es un nodo diferente a los anteriores. 
                  //Tiene una estructura de árbol también
                  Element elDir =(Element) elEmp.getElementsByTagName("direccion").item(0);
                              
                  Direccion d= null;
                  if(elDir!=null) {//Si no se indica la dirección no queremos que de error
                	  
                	  String direccion= elDir.getElementsByTagName("direccion")
                              .item(0).getChildNodes().item(0).getNodeValue();
                	  
                	  int numero =Integer.valueOf(elDir.getElementsByTagName("numero")
                              .item(0).getChildNodes().item(0).getNodeValue());
                	  
                	  d= new Direccion(direccion,numero);
                  }
                  //Creo un Empleado con los datos obtenidos y lo añado a la lista
                  //Esto para cada empleado dentro del xml
                  Empleado e = new Empleado(nombre,apellidos,d);
                  empleados.add(e);
             }//if Node.ELEMENT_NODE
        }//for
                
		return empleados;
	}//obtenerEmpleados
	
	public void guardarEmpleados(String ruta, List<Empleado> listaEmpleados)
	{
		//Creacion objetos DOM para construir la esctructura xml
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();
            
            //elemento raiz (<Empleados>)
            Element rootElement =
                doc.createElementNS(null, "empleados");
       
            //Añado el nodo raiz al documento
            doc.appendChild(rootElement);

            //cada elemento <Empleado> que tenemos en el listado
            for(Empleado e:listaEmpleados)
            {
            	Element empleado = doc.createElement("empleado");//Creación de un nodo empleado

            	Element node = doc.createElement("nombre");//Creación de un nodo para el campo
            	//Se crea un nodo de texto y se pega al nodo nombre
                node.appendChild(doc.createTextNode(e.getNombre()));
            	empleado.appendChild(node);//El nodo del campo (nombre) se añade el nodo del empleado

            	node = doc.createElement("apellidos");
                node.appendChild(doc.createTextNode(e.getApellidos()));
            	empleado.appendChild(node);
            	
            	Direccion d= e.getDireccion();
            	if(d!=null)//Creamos los nodos de dirección sólo si tiene dirección asignada
            	{
            		Element direccion = doc.createElement("direccion");
            		node = doc.createElement("direccion");
                    node.appendChild(doc.createTextNode(d.getDireccion()));
                	direccion.appendChild(node);
                	
                	node = doc.createElement("numero");
                    node.appendChild(doc.createTextNode(String.valueOf(d.getNumero())));
                	direccion.appendChild(node);
                	
                	empleado.appendChild(direccion);
            	}
            	rootElement.appendChild(empleado);//al final, asignamos el nodo empleado al nodo raiz (<empleados>)
            }
            
     
            //Clases que nos transforman la estructura de nodos en el xml
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();

            //Impresión indentada (que no lo ponga todo seguido)
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);

            //Creación de un Flujo a un fichero
            StreamResult file = new StreamResult(new File(ruta));
            //Se guarda la estructura xml en el fichero
            transformer.transform(source, file);

        } catch (Exception e) {
            e.printStackTrace();
        }
	}//guardarEmpleados
	
}//class
