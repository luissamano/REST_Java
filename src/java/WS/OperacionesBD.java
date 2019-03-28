/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS;

import Modelo.Producto;
import com.google.gson.Gson;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author samanocedillo
 */
@Path("/operaciones")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class OperacionesBD {
    
    @GET
    public Response recuperarProducto(String json){
        
        Gson gson = new Gson();
        Producto pd = gson.fromJson(json, Producto.class);
        
        Producto pdRecuperacion = new Producto();
        pdRecuperacion.setClaveProducto("123");
        pdRecuperacion.setDescripcionProducto("Lapiz");
        pdRecuperacion.setPrecioPrducto(3);
        pdRecuperacion.setExistenciaProducto(1);
        
        return Response.ok(gson.toJson(pdRecuperacion, Producto.class),
                            MediaType.APPLICATION_JSON).build();
    }
    
    
    /*
    
    {
	"claveProducto": "",
	"descripcionProducto": "",
	"precioPrducto": 0,
	"existenciaProducto": 0
            }
    */
    
    
}
