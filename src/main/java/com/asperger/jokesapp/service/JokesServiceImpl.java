package com.asperger.jokesapp.service;

import com.asperger.jokesapp.model.Joke;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesServiceImpl implements JokesService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokesServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public Joke getRandomJoke() {
        Joke joke = new Joke();
        joke.setFunnyQuote(this.chuckNorrisQuotes.getRandomQuote());
        return joke;
    }
}
