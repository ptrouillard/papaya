package com.pedro.papaya.sprint;

import javax.persistence.*;
import java.time.Instant;
import java.util.Objects;

@Entity
@NamedQuery(name = "Sprint.findAll",
        query = "SELECT s FROM Sprint s ORDER BY s.name")
public class Sprint {

    private long id;
    private String name;
    private String description;
    private Instant startDate;
    private Instant endDate;
    private int commitment;
    private int done;

    public Sprint(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Sprint() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="sprintSeq")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Instant getStartDate() {
        return startDate;
    }

    public void setStartDate(Instant startDate) {
        this.startDate = startDate;
    }

    public Instant getEndDate() {
        return endDate;
    }

    public void setEndDate(Instant endDate) {
        this.endDate = endDate;
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
                Objects.equals(startDate, sprint.startDate) &&
                Objects.equals(endDate, sprint.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, startDate, endDate);
    }
}
