package de.eis.tomee;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created with IntelliJ IDEA.
 * User: dmitry
 * Date: 08.01.13
 * Time: 18:15
 * To change this template use File | Settings | File Templates.
 */
@Path("/test")
public class TestService {
    @GET
    @Path("/test2")
    @Produces(MediaType.APPLICATION_JSON)
    public Entity getEntity() {
        return new Entity();
    }
}
