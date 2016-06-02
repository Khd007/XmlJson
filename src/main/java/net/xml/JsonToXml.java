package net.xml;

import java.io.*;
/*
import net.sf.json.JSON;
import net.sf.json.JSONSerializer;
import net.sf.json.xml.JSONTypes;
import net.sf.json.xml.XMLSerializer;
import org.apache.commons.io.IOUtils;
*/
import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;
import org.json.JSONObject;

/**
 * Created by khalid on 5/27/16.
 */
public class JsonToXml {
    public static void main(String[] args) throws Exception {
        try {
            BufferedReader br = new BufferedReader(new FileReader("khd.json"));
            BufferedWriter bw= new BufferedWriter(new FileWriter("khd.xml") );
            String jsonStr = "";
            while ((jsonStr = br.readLine()) != null) {
                JSONObject jsonObj = new JSONObject(jsonStr);
                System.out.println(XML.toString(jsonObj));
                bw.write(XML.toString(jsonObj));
                bw.newLine();
            }
            bw.close();
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
