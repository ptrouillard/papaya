package org.acme.quickstart;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/sprint")
public class SprintResource {

    @Inject
    SprintService service;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String get() {
        return service.greeting("Sprint 1");
    }
}