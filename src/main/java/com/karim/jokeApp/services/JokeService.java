package com.karim.jokeApp.services;

import guru.springframework.norris.chuck.ChuckNorrisInfoContributor;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;


@Service
public class JokeService {

    private final ChuckNorrisQuotes quotes;

    private  String joke;

    public JokeService() {
        this.quotes = new ChuckNorrisQuotes();
    }


    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }
    public String getJokeQuote(){
        setJoke(quotes.getRandomQuote());
        return getJoke();


    }
}
