package org.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api")
public class RESTRandomizer {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public int getRandomInt() {              // code from: https://www.educative.io/edpresso/how-to-generate-random-numbers-in-java
        int min = 500;
        int max = 600;

        //Generate random int value from 500 to 600
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        return random_int;
    }
}