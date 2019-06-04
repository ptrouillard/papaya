package com.pedro.papaya.sprint;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Set;

@Path("/sprints")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SprintResource {

    @Inject
    SprintService service;

    @GET
    public Set<Sprint> list() {
        return service.list();
    }

    @POST
    public Set<Sprint> add(Sprint sprint) {
        return service.add(sprint);
    }

    @DELETE
    public Set<Sprint> delete(Sprint sprint) {
        return service.delete(sprint);
    }
}