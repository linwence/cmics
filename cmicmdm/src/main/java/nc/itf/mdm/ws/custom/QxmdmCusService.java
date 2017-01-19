package nc.itf.mdm.ws.custom;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2016-10-17T10:44:09.971+08:00
 * Generated source version: 3.1.7
 * 
 */
@WebServiceClient(name = "QxmdmCusService", 
                  wsdlLocation = "http://10.17.9.94/uapws/service/QxmdmCusService?wsdl",
                  targetNamespace = "http://ws.mdm.itf.nc/QxmdmCusService") 
public class QxmdmCusService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ws.mdm.itf.nc/QxmdmCusService", "QxmdmCusService");
    public final static QName QxmdmCusServiceSOAP11PortHttp = new QName("http://ws.mdm.itf.nc/QxmdmCusService", "QxmdmCusServiceSOAP11port_http");
    static {
        URL url = null;
        try {
            url = new URL("http://10.17.9.94/uapws/service/QxmdmCusService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(QxmdmCusService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://10.17.9.94/uapws/service/QxmdmCusService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public QxmdmCusService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public QxmdmCusService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public QxmdmCusService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public QxmdmCusService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public QxmdmCusService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public QxmdmCusService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns QxmdmCusServicePortType
     */
    @WebEndpoint(name = "QxmdmCusServiceSOAP11port_http")
    public QxmdmCusServicePortType getQxmdmCusServiceSOAP11PortHttp() {
        return super.getPort(QxmdmCusServiceSOAP11PortHttp, QxmdmCusServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns QxmdmCusServicePortType
     */
    @WebEndpoint(name = "QxmdmCusServiceSOAP11port_http")
    public QxmdmCusServicePortType getQxmdmCusServiceSOAP11PortHttp(WebServiceFeature... features) {
        return super.getPort(QxmdmCusServiceSOAP11PortHttp, QxmdmCusServicePortType.class, features);
    }

}