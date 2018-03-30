/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//stackoverflow.com
package chat;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import org.jdom2.Content;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author toshiba t
 */
public class ReadXML {
    public String getxml() throws JDOMException, IOException, ClassNotFoundException, SQLException{
//        Client c=new Client();
//           c.recievexml();
    SAXBuilder builder = new SAXBuilder();
    File xmlFile = new File("C:\\Users\\toshiba t\\Desktop\\filesForExamples\\recivednewXMLfile1.xml");
        
        Document document = (Document) builder.build(xmlFile);
        Element rootNode = document.getRootElement();
        String a=rootNode.getText();
        System.out.println(a);
        System.out.println("Read Succesfully");
        
       // Client.main(args);
     
        return a;
        
 }
}
