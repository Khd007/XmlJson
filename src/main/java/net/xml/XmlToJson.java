package net.xml;

import org.json.JSONObject;
import org.json.XML;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created by khalid on 5/30/16.
 */
public class XmlToJson {
    public static void main(String[] args) throws Exception {
        try {
            BufferedReader br = new BufferedReader(new FileReader("pom.xml"));
            BufferedWriter bw= new BufferedWriter(new FileWriter("khd.json",true) );
            String  xmlStr= "";
            String temp = null;
            while ((xmlStr = br.readLine()) != null) {
                temp=temp+xmlStr;
            }
            JSONObject xmlJSONObj = XML.toJSONObject(temp);
            String jsonPrettyPrintString = xmlJSONObj.toString();
            System.out.println(jsonPrettyPrintString);
            bw.write(jsonPrettyPrintString);
            bw.close();
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
