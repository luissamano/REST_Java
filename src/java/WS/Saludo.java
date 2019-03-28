/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author samanocedillo
 */

@Path("/saludo")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class Saludo {
    
    /**
     *
     * @return
     */
    @GET
    public Response saludoGet(){
        return Response.ok("WS GET con Java", MediaType.APPLICATION_JSON).build();
    }
    
    /**
     *
     * @return
     */
    @POST
    public Response saludoPost(){
        return Response.ok("WS POST con Java", MediaType.APPLICATION_JSON).build();
    }
    
    /**
     *
     * @return
     */
    @PUT
    public Response saludoPut(){
        return Response.ok("WS PUT con Java", MediaType.APPLICATION_JSON).build();
    }
    
    /**
     *
     * @return
     */
    @DELETE
    public Response saludoDelete(){
        return Response.ok("WS DELETE con Java", MediaType.APPLICATION_JSON).build();
    }
    
}

