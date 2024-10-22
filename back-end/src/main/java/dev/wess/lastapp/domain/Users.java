package dev.wess.lastapp.domain;

import jakarta.persistence.*;

@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    public Users(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Users() {
    }

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
}
