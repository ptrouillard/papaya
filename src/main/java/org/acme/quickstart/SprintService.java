package org.acme.quickstart;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SprintService {

    public String greeting(String name) {
        return "hello " + name + "\n";
    }
}
