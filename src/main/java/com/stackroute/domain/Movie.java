package com.stackroute.domain;

public class Movie {
    private Actor actor;

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void displayActorInfo()

    {
        actor.displayActorInfo1();
    }
}
