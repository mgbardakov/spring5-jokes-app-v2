package ru.tehnotron.sring5jokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    private static final ChuckNorrisQuotes QUOTES = new ChuckNorrisQuotes();

    @Override
    public String getJoke() {
        return QUOTES.getRandomQuote();
    }
}
