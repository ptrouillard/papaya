package com.pedro.papaya.sprint;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class SprintService {

    @Inject
    private EntityManager em;

    public SprintService() {
    }

    public List<Sprint> list() {
        TypedQuery<Sprint> query =
                em.createNamedQuery("Sprint.findAll", Sprint.class);
        return query.getResultList();
    }

    @Transactional
    public void add(Sprint sprint) {
        Sprint sp = new Sprint(sprint.getName(), sprint.getDescription());
        em.persist(sp);
    }

    public void delete(Sprint sprint) {
        em.remove(sprint);
    }
}
