/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chat;

import java.io.IOException;
import java.sql.SQLException;
import org.jdom2.JDOMException;

/**
 *
 * @author toshiba t
 */
public class Chat {

    /**
     * @param args the command line arguments
     * @throws org.jdom2.JDOMException
     * @throws java.io.IOException
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws JDOMException, IOException, ClassNotFoundException, SQLException {
          ChatInterface.main(args);
          Server.main(args);
//        Chatwindow cw=new Chatwindow();
//        cw.rcvmsg();
    }
    
}
