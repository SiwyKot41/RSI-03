package net.wvffle;

import javax.jws.WebService;
@WebService(endpointInterface = "net.wvffle.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
    @Override
    public String getHelloWorldAsString(String name) {
        return "Witaj świecie JAX-WS: " + name;
    }
}

