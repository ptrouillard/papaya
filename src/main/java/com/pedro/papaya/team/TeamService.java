package com.pedro.papaya.team;

import com.pedro.papaya.sprint.Sprint;

import javax.enterprise.context.ApplicationScoped;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

@ApplicationScoped
public class TeamService {

    private Set<Team> teams = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

    public TeamService() {
        this.teams.add(new Team("team 1"));
        this.teams.add(new Team("team 2"));
    }

    public Set<Team> list() {
        return teams;
    }

    public Set<Team> add(Team team) {
        this.teams.add(team);
        return teams;
    }

    public Set<Team> delete(Team team) {
        this.teams.remove(team);
        return teams;
    }
}
