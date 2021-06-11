package com.orkhanmammadov.game;

public class GameException extends Exception{
    private String message;

    public GameException(String message) {
        super(message);
    }
}
