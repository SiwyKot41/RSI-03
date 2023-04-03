package webservicesclient;

import org.fr.rsi.HelloWorld;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class WebServicesClient2 {

    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:9999/ws/hello?wsdl");
        QName qName = new QName("http://rsi.fr.org/", "HelloWorldImplService");

        Service service = Service.create(url, qName);
        HelloWorld hello = service.getPort(HelloWorld.class);

        String zapytanie = "To ja - KLIENT 2";
        String response = hello.getHelloWorldAsString(zapytanie);
        System.out.println("Klient wysłał: " + zapytanie);
        System.out.println("Klient otrzymał: " + response);
    }
}