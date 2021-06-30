import java.io.IOException;
import java.net.URI;

import com.sun.net.httpserver.HttpServer;
import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Starting REST Service...");
        ResourceConfig rc = new ResourceConfig().packages("org.example");
        HttpServer server = JdkHttpServerFactory.createHttpServer(URI.create("http://localhost:8080/"), rc);
        System.out.println("REST Service successfully started!");

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

        server.stop(0);
        System.out.println("Service stopped!");
    }


}
