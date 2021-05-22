package person.biki.learnspring.sfgjokegen.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisQuoteGeneratorImpl implements ChuckNorrisQuoteGenerator {
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisQuoteGeneratorImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getRandomQuote() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
