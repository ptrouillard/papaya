package com.pedro.papaya.team;

import com.pedro.papaya.sprint.Sprint;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class TeamService {

    @Inject
    private EntityManager em;

    public TeamService() {
    }

    public List<Team> list() {
        TypedQuery<Team> query =
                em.createNamedQuery("Team.findAll", Team.class);
        return query.getResultList();
    }

    @Transactional
    public void add(Team team) {
        Team t = new Team(team.getName());
        em.persist(t);
    }

    public void delete(Team team) {
        em.remove(team);
    }
}
