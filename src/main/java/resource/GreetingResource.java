package resource;

import model.Greeting;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/greeting")
public class GreetingResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/hello")
    public Greeting helloWorld() {
        Greeting greeting = new Greeting();
        greeting.setMessage("Hello World");
        greeting.setName("Michael");
        return greeting;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/hello/{id}")
    public Greeting helloWorldWithId(@PathParam("id") String id) {
        Greeting greeting = new Greeting();
        greeting.setMessage("Hello World with id");
        greeting.setName("Sten");
        return greeting;
    }

}
