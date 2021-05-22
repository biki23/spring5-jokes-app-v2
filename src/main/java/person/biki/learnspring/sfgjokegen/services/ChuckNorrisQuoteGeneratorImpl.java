package person.biki.learnspring.sfgjokegen.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisQuoteGeneratorImpl implements ChuckNorrisQuoteGenerator {
    ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();
    @Override
    public String getRandomQuote() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
