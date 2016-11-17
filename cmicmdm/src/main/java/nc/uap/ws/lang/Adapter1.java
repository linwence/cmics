
package nc.uap.ws.lang;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, StackTraceElement>
{


    public StackTraceElement unmarshal(String value) {
        return (nc.uap.ws.jaxb.DataConverter.parseStackTraceElement(value));
    }

    public String marshal(StackTraceElement value) {
        return (nc.uap.ws.jaxb.DataConverter.printStackTraceElement(value));
    }

}
