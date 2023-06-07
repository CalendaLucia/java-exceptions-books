package org.learning.java.books;

public class Book {
    private String title;
    private int numberPage;
    private String author;
    private String publisher ;

    public Book(String title, int numberPage, String author, String publisher) {
        if (title != null && !title.isEmpty() && numberPage > 0
                && author != null && !author.isEmpty() && publisher != null && !publisher.isEmpty()) {
            this.title = title;
            this.numberPage = numberPage;
            this.author = author;
            this.publisher = publisher;
        } else {
            throw new IllegalArgumentException("Invalid book details");

        }

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberPage() {
        return numberPage;
    }

    public void setNumberPage(int numberPage) {
        if (numberPage <= 0) {
            throw new NumberFormatException ();
        }
        this.numberPage = numberPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

//    SOVRASCRIVO METODO TOSTRING
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", numberPage=" + numberPage +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
