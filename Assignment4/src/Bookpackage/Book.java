package Bookpackage;

	import java.io.*; 
	import java.time.LocalDate; 
	import java.time.format.DateTimeParseException; 
	import java.util.*; 
	import java.util.Comparator;


	class Book implements Serializable {
	    private String isbn;
	    private String title;
	    private String author;
	    private String category;
	    private LocalDate publishDate;

	    public Book(String isbn, String title, String author, String category, LocalDate publishDate) {
	        this.isbn = isbn;
	        this.title = title;
	        this.author = author;
	        this.category = category;
	        this.publishDate = publishDate;
	    }

	    public String getIsbn() {
	        return isbn;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public String getCategory() {
	        return category;
	    }

	    public LocalDate getPublishDate() {
	        return publishDate;
	    }

	    @Override
	    public String toString() {
	        return String.format("ISBN: %-10s | Title: %-20s | Author: %-15s | Category: %-10s | Publish Date: %s",
	                isbn, title, author, category, publishDate);
	    }
	}


