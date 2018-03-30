/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//stackoverflow.com
package chat;

import java.awt.im.InputContext;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import static org.jdom2.filter.Filters.document;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

/**
 *
 * @author toshiba t
 */
public class CreateXML {
    	private static final String xmlFilePath ="C:\\Users\\toshiba t\\Desktop\\filesForExamples\\newXMLfile1.xml";
    private String[] args;
        //String a;
public void crXML(String a) throws SQLException, IOException, JDOMException, ClassNotFoundException{
            
                
    Element temp= new Element("temp") {};
                Document tempd = new Document(temp);
                temp.addContent(a);
                System.out.println(a);
                XMLOutputter xmlOutputer = new XMLOutputter();
                xmlOutputer.setFormat(Format.getPrettyFormat());
                xmlOutputer.output(tempd, new FileWriter(xmlFilePath));
                System.out.println("Created Successfully");
                
                Client.main(args);
//                ReadXML rm= new ReadXML();
//                rm.getxml();
//               Chatwindow cw=new Chatwindow();
//               cw.rcvmsg();
       
                 
}
}
        