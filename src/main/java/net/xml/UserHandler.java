package net.xml;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
/**
 * Created by khalid on 5/27/16.
 */
public class UserHandler extends  DefaultHandler {
    private boolean bFirstName = false;
    private boolean bLastName = false;
    private boolean bNickName = false;
    private boolean bMarks = false;

    public void startElement(String uri,
                             String localName, String qName, Attributes attributes)
            throws SAXException {
        if (qName.equalsIgnoreCase("student")) {
            String rollNo = attributes.getValue("rollno");
            System.out.println("Roll No : " + rollNo);
        } else if (qName.equalsIgnoreCase("firstname")) {
            bFirstName = true;
        } else if (qName.equalsIgnoreCase("lastname")) {
            bLastName = true;
        } else if (qName.equalsIgnoreCase("nickname")) {
            bNickName = true;
        } else if (qName.equalsIgnoreCase("marks")) {
            bMarks = true;
        }
    }

    public void endElement(String uri,
                           String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("student")) {
            System.out.println("End Element :" + qName);
        }
    }

    public void characters(char ch[],
                           int start, int length) throws SAXException {
        if (bFirstName) {
            System.out.println("First Name: "
                    + new String(ch, start, length));
            bFirstName = false;
        } else if (bLastName) {
            System.out.println("Last Name: "
                    + new String(ch, start, length));
            bLastName = false;
        } else if (bNickName) {
            System.out.println("Nick Name: "
                    + new String(ch, start, length));
            bNickName = false;
        } else if (bMarks) {
            System.out.println("Marks: "
                    + new String(ch, start, length));
            bMarks = false;
        }
    }
}
