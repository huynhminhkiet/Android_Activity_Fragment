package com.example.minhkiet.criminalintent.model;

import java.util.UUID;

/**
 * Created by minhkiet on 14/11/2016.
 */

public class Crime {
    private UUID id;
    private String title;
    private boolean solved;

    public Crime() {
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isSolved() {
        return solved;
    }

    public void setSolved(boolean solved) {
        this.solved = solved;
    }
}
