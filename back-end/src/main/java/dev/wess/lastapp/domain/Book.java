package dev.wess.lastapp.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @JsonProperty("titel")
    private String title;
    @JsonProperty("auteur")
    private String author;
    @JsonProperty("aantalExemplaren")
    private int copies;
    @JsonProperty("afbeeldingURL")
    private String imageURL;


    public Book(long id, String title, String author, int copies, String imageURL) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.copies = copies;
        this.imageURL = imageURL;
    }

    public Book() {
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getCopies() {
        return copies;
    }
    public void setCopies(int copies) {
        this.copies = copies;
    }
    public String getimageURL() {
        return imageURL;
    }
    public void setimageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
