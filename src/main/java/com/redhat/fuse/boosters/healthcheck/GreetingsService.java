package com.redhat.fuse.boosters.healthcheck;

/**
 * Service interface for name service.
 * 
 */
public interface GreetingsService {

    /**
     * Generate Greetings
     *
     * @return a string greetings
     */
    Greetings getGreetings( String name);

}