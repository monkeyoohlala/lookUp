package com.monkeyoohlala.lookup;

import java.util.HashMap;

public class Word {
    private String word;
    private String definition;

    HashMap<String, String> wordListing = new HashMap<>();

    public String getWord() {
        return this.word;
    }

    public String getDefinition() {
        return this.definition;
    }


    public void setWord(String word) {
        this.word = word;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public void addWord(String word, String definition) {
        this.wordListing.put(word ,definition);
    }

    public HashMap<String, String> getWordListing() {
        return this.wordListing;
    }

    public void setWordListing(HashMap<String, String> wordListing) {
        this.wordListing = wordListing;
    }

    public boolean isWord(String word) {
        return this.wordListing.containsKey(word);
    }

}
