package com.pedro.papaya.sprint;

import javax.enterprise.context.ApplicationScoped;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

@ApplicationScoped
public class SprintService {

    private Set<Sprint> sprints = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

    public SprintService() {
        this.sprints.add(new Sprint("sprint 1"));
        this.sprints.add(new Sprint("sprint 2"));
    }

    public Set<Sprint> list() {
        return sprints;
    }

    public Set<Sprint> add(Sprint sprint) {
        this.sprints.add(sprint);
        return sprints;
    }

    public Set<Sprint> delete(Sprint sprint) {
        this.sprints.remove(sprint);
        return sprints;
    }
}
