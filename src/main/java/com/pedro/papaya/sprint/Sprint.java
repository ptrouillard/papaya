package com.pedro.papaya.sprint;

import java.time.Instant;
import java.util.Objects;

public class Sprint {

    private String name;
    private String description;
    private Instant start;
    private Instant end;
    private int commitment;
    private int done;

    public Sprint(String name) {
        this.name = name;
    }

    public Sprint() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Instant getStart() {
        return start;
    }

    public void setStart(Instant start) {
        this.start = start;
    }

    public Instant getEnd() {
        return end;
    }

    public void setEnd(Instant end) {
        this.end = end;
    }

    public int getCommitment() {
        return commitment;
    }

    public void setCommitment(int commitment) {
        this.commitment = commitment;
    }

    public int getDone() {
        return done;
    }

    public void setDone(int done) {
        this.done = done;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sprint sprint = (Sprint) o;
        return Objects.equals(name, sprint.name) &&
                Objects.equals(description, sprint.description) &&
                Objects.equals(start, sprint.start) &&
                Objects.equals(end, sprint.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, start, end);
    }
}
