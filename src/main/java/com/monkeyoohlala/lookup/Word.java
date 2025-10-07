package com.monkeyoohlala.lookup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.HashMap;
import java.util.List;

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

    public void fetchDefinitionOfWord(String word) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.dictionary.com/browse/" + word);
        List<WebElement> definitions = driver.findElements(By.xpath("//div[@id='dictionary-entry-1']//li//span"));
        StringBuilder definition = new StringBuilder();
        definitions.forEach(e -> {
            definition.append(e.getText());
            definition.append("\n");
        });
        wordListing.put(word, definition.toString());

        System.out.println(wordListing); // You can delete this line. This is just to show you that it captures the definition in the map
        driver.quit();
    }

    // You can delete this main method, it's just here for you to run to test the code I wrote
    public static void main(String[] args) {
        Word obj = new Word();
        obj.fetchDefinitionOfWord("diode");
        obj.fetchDefinitionOfWord("circuit");
    }

}
