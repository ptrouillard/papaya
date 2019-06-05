package com.pedro.papaya.sprint;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Set;

@Path("/sprints")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SprintResource {

    @Inject
    private SprintService service;

    @GET
    public List<Sprint> list() {
        return service.list();
    }

    @POST
    public void add(Sprint sprint) {
        service.add(sprint);
    }

    @DELETE
    public void delete(Sprint sprint) {
        service.delete(sprint);
    }
}