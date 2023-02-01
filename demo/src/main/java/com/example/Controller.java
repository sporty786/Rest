package com.example;

import io.javalin.Javalin;

public class Controller {
    Javalin app;

    public Controller(){
        app = Javalin.create();
    }

    public void startAPI(){
        // By convention, with paths and databases, we always use the singular version of the noun
        app.get("/pet", ctx -> {
            // implement a get all pets functionality
        });
        app.get("/pet/{id}", ctx -> {
            // implement a get specific pet by id functionality here
            // return with a JSON of a specific pet
        });
        app.post("/pet", ctx -> {
            // implement save a pet functionality
            // assume that the request body contains a JSON of a pet, and if not, respond with 400
            // if posting a pet was successful, respond with the JSON of the pet
            // if posting a pet was not successful, 
            //      client error -> 400 (your fault)
            //      server error -> 500 (my fault)
        });
    }
}
