package com.pedro.papaya.team;

import com.pedro.papaya.sprint.Sprint;
import com.pedro.papaya.sprint.SprintService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Set;

@Path("/teams")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TeamResource {

    @Inject
    TeamService service;

    @GET
    public Set<Team> list() {
        return service.list();
    }

    @POST
    public Set<Team> add(Team team) {
        return service.add(team);
    }

    @DELETE
    public Set<Team> delete(Team team) {
        return service.delete(team);
    }

}
