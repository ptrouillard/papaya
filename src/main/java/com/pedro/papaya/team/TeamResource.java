package com.pedro.papaya.team;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/teams")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TeamResource {

    @Inject
    TeamService service;

    @GET
    public List<Team> list() {
        return service.list();
    }

    @POST
    public void add(Team team) {
        service.add(team);
    }

    @DELETE
    public void delete(Team team) {
        service.delete(team);
    }

}
