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
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import org.xml.sax.SAXException;

public class CV01v02LecturaFileXmlConLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // String lRuta = "D:\\2016\\LanguajeProgram\\Java\\Web02v01EvaluacionJsp\\web\\xml\\";
        String lRuta = "D:\\2017\\04-LanguajeProgram\\Java\\Web02v01EvaluacionJsp\\web\\xml\\";
        //String lArchivo = "xml02v01EditMensajeSinId.xml";
        //String lArchivo = "xml02v02PortafolioSinId.xml";
        String lArchivo = "xml03v01CreditoLeasingSinId.xml";
        String lArchivoXml = lRuta + lArchivo;
        
        File oArchivoXml = new File(lArchivoXml);
        
        try{
            DocumentBuilder oDBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            
            Document oDoc = oDBuilder.parse(lArchivoXml);

            System.out.println("Archivo         : " + oArchivoXml);

            // Cargando el nodo principal
            System.out.println("Elemento Raíz   : " + oDoc.getDocumentElement().getNodeName());

            if (oDoc.hasChildNodes()){
                System.out.println("Procesando los Hijos del Elemento Raíz");
                imprimeNodo(oDoc.getChildNodes());
            };

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
    
    private static void imprimeNodo(NodeList poNodeList){
        try{
            for (int i = 0; i < poNodeList.getLength(); i++){
                
                //                System.out.println(i);
                
                Node oTmpNode = poNodeList.item(i);
                
                // Identificar los elementos del Nodo
                if (oTmpNode.getNodeType() == Node.ELEMENT_NODE){
                        // get node name and value
                    System.out.println("\nNode Name   = " + oTmpNode.getNodeName() + " [OPEN]");
                    System.out.println("Base URI    = " + oTmpNode.getBaseURI());
                    System.out.println("Local Name  = " + oTmpNode.getLocalName());
                    System.out.println("Space URI   = " + oTmpNode.getNamespaceURI());
                    System.out.println("Prefijo     = " + oTmpNode.getPrefix());
                    System.out.println("Node Value  = " + oTmpNode.getNodeValue());
                    System.out.println("Tipo Node   = " + oTmpNode.getNodeType());
                    System.out.println("Contexto    = " + oTmpNode.getTextContent());
                    
                    //Carga los atributos nombre y valores
                    if (oTmpNode.hasAttributes()){
                        
                        NamedNodeMap oNodeMap = oTmpNode.getAttributes();

                        for (int j = 0; j < oNodeMap.getLength(); j++) {

				Node oNodo = oNodeMap.item(j);
				System.out.println("attr name : " + oNodo.getNodeName());
				System.out.println("attr value : " + oNodo.getNodeValue());

			} // For 1

                    } // If 1
                    
                    if (oTmpNode.hasChildNodes()) {

			// loop again if has child nodes
			imprimeNodo(oTmpNode.getChildNodes());

                    } // If 2
                    
                    System.out.println("Node Name =" + oTmpNode.getNodeName() + " [CLOSE]");
                } // If 3
            } // For 2
        }catch(Exception oEX){
            oEX.getMessage();
        }
    }
    
}
