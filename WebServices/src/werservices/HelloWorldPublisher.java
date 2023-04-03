package werservices;

import javax.xml.ws.Endpoint;
import net.wvffle.HelloWorldImpl;

public class HelloWorldPublisher {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9999/ws/hello", new HelloWorldImpl());
        System.out.println("Web serwis czeka na klienta....");
    }
}
