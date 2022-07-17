package soap;

import javax.xml.ws.Endpoint;

public class ServerMain {
    public static void main(String[] args) {
        Endpoint.publish("http://127.0.0.1:5000/biblioteca", new ServerSoap());
    }
}
