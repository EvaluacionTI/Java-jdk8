/*
 * REQ : Leer un archivo xml
 */
package aemsa.vista.xml;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.DOMException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class CV01v02LecturaCreditoLeasingConId {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1.0 Establecer la ruta y el documento xml a leer
        String lRuta = "D:\\2016\\LanguajeProgram\\Java\\Web02v01EvaluacionJsp\\web\\xml\\";
        //String lArchivo = "xml02v03EmpleadoConId.xml"; // Ojo cambiar el atributo a staff
        String lArchivo = "xml03v02CreditoLeasingConId.xml"; // Ojo cambiar el atributo a opcion_compra
        String lArchivoXml = lRuta + lArchivo;
        
        File oArchivoXml = new File(lArchivoXml);
        
        try{
            System.out.println("Lectura del Archivo xml que tiene un Id");
            System.out.println("=======================================");
            
            // 2.0 Crear un DocumentBuilder
            DocumentBuilderFactory oDBFactory = DocumentBuilderFactory.newInstance();
            
            DocumentBuilder oDBuilder = oDBFactory.newDocumentBuilder();
            
            // 3.0 Crear un documento a partir de un archivo o emisión
            Document oDoc = oDBuilder.parse(lArchivoXml);

            System.out.println("Archivo" + oArchivoXml);

            oDoc.getDocumentElement().normalize();
            
            // 4.0 Cargando el nodo principal
            System.out.println("Elemento Raíz   : " + oDoc.getDocumentElement().getNodeName());

            // 5.0 Devuelve atributos
            NodeList nList = oDoc.getElementsByTagName("opcion_compra");
            
            System.out.println("----------------------------");

            // 6.0 Devuelve Elementos
            for (int temp = 0; temp < nList.getLength(); temp++) {

                Node nNode = nList.item(temp);

                System.out.println("\nElemento Actual : " + "(" + temp + ")" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;

                    System.out.println("Id                   : " + eElement.getAttribute("id"));
                    System.out.println("Código Cliente Win   : " + eElement.getElementsByTagName("CodigoClienteWin").item(0).getTextContent());
                    System.out.println("Código Cliente IBS   : " + eElement.getElementsByTagName("CodigoClienteIBS").item(0).getTextContent());
                    System.out.println("N° Operación WL      : " + eElement.getElementsByTagName("NumeroOperacionWL").item(0).getTextContent());
                    System.out.println("N° Operación IBS     : " + eElement.getElementsByTagName("NumeroOperacionIBS").item(0).getTextContent());
                    System.out.println("Moneda               : " + eElement.getElementsByTagName("Moneda").item(0).getTextContent());                        
                    System.out.println("Importe Financiado   : " + eElement.getElementsByTagName("ImporteFinanciado").item(0).getTextContent());
                    System.out.println("Importe Opción COmpra: " + eElement.getElementsByTagName("ImporteOpcionCompra").item(0).getTextContent());
                }
            }
        }catch(ParserConfigurationException oEX){
            System.out.println(oEX.getMessage());
        } catch (SAXException oEX) {
            System.out.println(oEX.getMessage());
        } catch (IOException oEX) {
            System.out.println(oEX.getMessage());
        } catch (DOMException oEX) {
            System.out.println(oEX.getMessage());
        }
        
    }
    
}
