package net.xml;

import net.sf.json.xml.XMLSerializer;
import net.sf.json.JSON;

import org.apache.commons.io.IOUtils;

import java.io.*;
import java.net.URL;

/**
 * Created by khalid on 5/30/16.
 */
public class XMLtoJsonConverter {
    //private URL url = null;
    private InputStream inputStream = null;
    public void getXMLfromJson() {
        try{
            FileInputStream file=new FileInputStream("pom.xml");
            //inputStream = file;
            String xml = IOUtils.toString(file);
            JSON objJson = new XMLSerializer().read(xml);
            System.out.println("JSON data : " + objJson);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
                //url = null;
            } catch (IOException ex) {}
        }
    }

}
