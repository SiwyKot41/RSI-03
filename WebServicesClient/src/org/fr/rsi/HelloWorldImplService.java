
package org.fr.rsi;

import javax.xml.namespace.QName;
import javax.xml.ws.*;
import java.net.MalformedURLException;
import java.net.URL;

@WebServiceClient(name = "HelloWorldImplService", targetNamespace = "http://rsi.fr.org/", wsdlLocation = "http://localhost:9999/ws/hello?wsdl")
public class HelloWorldImplService
    extends Service
{

    private final static URL HELLOWORLDIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException HELLOWORLDIMPLSERVICE_EXCEPTION;
    private final static QName HELLOWORLDIMPLSERVICE_QNAME = new QName("http://rsi.fr.org/", "HelloWorldImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9999/ws/hello?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HELLOWORLDIMPLSERVICE_WSDL_LOCATION = url;
        HELLOWORLDIMPLSERVICE_EXCEPTION = e;
    }

    public HelloWorldImplService() {
        super(__getWsdlLocation(), HELLOWORLDIMPLSERVICE_QNAME);
    }

    public HelloWorldImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), HELLOWORLDIMPLSERVICE_QNAME, features);
    }

    public HelloWorldImplService(URL wsdlLocation) {
        super(wsdlLocation, HELLOWORLDIMPLSERVICE_QNAME);
    }

    public HelloWorldImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HELLOWORLDIMPLSERVICE_QNAME, features);
    }

    public HelloWorldImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloWorldImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    @WebEndpoint(name = "HelloWorldImplPort")
    public HelloWorld getHelloWorldImplPort() {
        return super.getPort(new QName("http://rsi.fr.org/", "HelloWorldImplPort"), HelloWorld.class);
    }

    @WebEndpoint(name = "HelloWorldImplPort")
    public HelloWorld getHelloWorldImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://rsi.fr.org/", "HelloWorldImplPort"), HelloWorld.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HELLOWORLDIMPLSERVICE_EXCEPTION!= null) {
            throw HELLOWORLDIMPLSERVICE_EXCEPTION;
        }
        return HELLOWORLDIMPLSERVICE_WSDL_LOCATION;
    }

}
