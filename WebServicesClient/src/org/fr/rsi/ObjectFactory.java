
package org.fr.rsi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


@XmlRegistry
public class ObjectFactory {

    private final static QName _GetHelloWorldAsString_QNAME = new QName("http://rsi.fr.org/", "getHelloWorldAsString");
    private final static QName _GetHelloWorldAsStringResponse_QNAME = new QName("http://rsi.fr.org/", "getHelloWorldAsStringResponse");

    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetHelloWorldAsString }
     * 
     */
    public GetHelloWorldAsString createGetHelloWorldAsString() {
        return new GetHelloWorldAsString();
    }

    public GetHelloWorldAsStringResponse createGetHelloWorldAsStringResponse() {
        return new GetHelloWorldAsStringResponse();
    }

    @XmlElementDecl(namespace = "http://rsi.fr.org/", name = "getHelloWorldAsString")
    public JAXBElement<GetHelloWorldAsString> createGetHelloWorldAsString(GetHelloWorldAsString value) {
        return new JAXBElement<GetHelloWorldAsString>(_GetHelloWorldAsString_QNAME, GetHelloWorldAsString.class, null, value);
    }

    @XmlElementDecl(namespace = "http://rsi.fr.org/", name = "getHelloWorldAsStringResponse")
    public JAXBElement<GetHelloWorldAsStringResponse> createGetHelloWorldAsStringResponse(GetHelloWorldAsStringResponse value) {
        return new JAXBElement<GetHelloWorldAsStringResponse>(_GetHelloWorldAsStringResponse_QNAME, GetHelloWorldAsStringResponse.class, null, value);
    }

}
