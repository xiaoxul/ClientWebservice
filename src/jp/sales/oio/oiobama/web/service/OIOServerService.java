
package jp.sales.oio.oiobama.web.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "OIOServerService", targetNamespace = "http://service.web.oiobama.oio.sales.jp/", wsdlLocation = "http://localhost:9080/jp/sales/oio/oiobama/web/OIOServerService.wss?wsdl")
public class OIOServerService
    extends Service
{

    private final static URL OIOSERVERSERVICE_WSDL_LOCATION;
    private final static WebServiceException OIOSERVERSERVICE_EXCEPTION;
    private final static QName OIOSERVERSERVICE_QNAME = new QName("http://service.web.oiobama.oio.sales.jp/", "OIOServerService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9080/jp/sales/oio/oiobama/web/OIOServerService.wss?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        OIOSERVERSERVICE_WSDL_LOCATION = url;
        OIOSERVERSERVICE_EXCEPTION = e;
    }

    public OIOServerService() {
        super(__getWsdlLocation(), OIOSERVERSERVICE_QNAME);
    }

    public OIOServerService(WebServiceFeature... features) {
        super(__getWsdlLocation(), OIOSERVERSERVICE_QNAME, features);
    }

    public OIOServerService(URL wsdlLocation) {
        super(wsdlLocation, OIOSERVERSERVICE_QNAME);
    }

    public OIOServerService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, OIOSERVERSERVICE_QNAME, features);
    }

    public OIOServerService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OIOServerService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns OIOServer
     */
    @WebEndpoint(name = "OIOServerPort")
    public OIOServer getOIOServerPort() {
        return super.getPort(new QName("http://service.web.oiobama.oio.sales.jp/", "OIOServerPort"), OIOServer.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OIOServer
     */
    @WebEndpoint(name = "OIOServerPort")
    public OIOServer getOIOServerPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.web.oiobama.oio.sales.jp/", "OIOServerPort"), OIOServer.class, features);
    }

    private static URL __getWsdlLocation() {
        if (OIOSERVERSERVICE_EXCEPTION!= null) {
            throw OIOSERVERSERVICE_EXCEPTION;
        }
        return OIOSERVERSERVICE_WSDL_LOCATION;
    }

}
