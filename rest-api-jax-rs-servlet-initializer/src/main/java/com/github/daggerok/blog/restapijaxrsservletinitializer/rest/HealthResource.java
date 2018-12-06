package com.github.daggerok.blog.restapijaxrsservletinitializer.rest;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import static java.util.Collections.singletonMap;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("")
@RequestScoped
@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
public class HealthResource {

  @GET
  @Path("health")
  public Response health() {
    return Response.ok()
                   .entity(singletonMap("status", "rest-api-jax-rs-servlet-initializer is UP"))
                   .build();
  }
}
