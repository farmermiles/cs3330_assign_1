package edu.missouri.group37;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private double  price;

    /***
     * Default constructor
     */
    public Book() {
        return;
    }

    /***
     *
     */
    public Book(String title, String author, String ISBN, double price) {
    	this.title = title;
    	this.author = author;
    	this.ISBN = ISBN;
    	this.price = price;
        return;
    }

    /***
     * Copy constructor
     */
    public boolean Book(Book otherBook) {
    	if (!otherBook) {
    		return false;
    	}
    	title = otherBook.title;
    	author = otherBook.author;
    	ISBN = otherBook.ISBN;
    	price = otherBook.price;
    	
        return true;
    }

    /***
     *
     */
    public String getTitle() {
    	
        return title;
    }

    /***
     *
     */
    public boolean setTitle(String title) {
    	if (!title) {
    		return false;
    	}
    	this.title = title;
        return true;
    }

    /***
     *
     */
    public String getAuthor() {
        return author;
    }

    /***
     *
     */
    public boolean setAuthor(String author) {
    	if (!author) {
    		return false;
    	}
    	author = author;
        return true;
    }

    /***
     *
     */
    public String getISBN() {
        return ISBN;
    }

    /***
     *
     */
    public boolean setISBN(String ISBN) {
    	if (!ISBN) {
    		return false;
    	}
    	ISBN = ISBN;
        return true;
    }

    /***
     *
     */
    public double getPrice() {
    	if (!price){
    		return -1.0;
    	}
        return price;
    }

    /***
     *
     */
    public boolean setPrice(double price) {
    	if (!price) {
    		return false;
    	}
    	price = price;
        return true;
    }

    /***
     *
     */
    public String toString() {
        return "";
    }

    /***
     *
     */
    public boolean equals(Book book) {
    	if (this.author == book.author & this.title == book.title & this.ISBN == book.ISBN & this.price == book.price){
    		return true;
    	}
        return false;
    }
}