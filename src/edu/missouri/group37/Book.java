package edu.missouri.group37;

/**
 * A class designed to represent a book item. Stores several attributes related
 * to the book and provides methods to interface with these attributes.
 */
public class Book {
    private String title;
    private String author;
    private String ISBN;
    private double price;

    /**
     * Constructor that initializes values to defaults.
     */
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.ISBN = "Unknown";
        this.price = 0.0;
    }

    /**
     * Constructor with initialization. The provided parameters will be used to initialize the object.
     * @param title the title of the book
     * @param author the author of the book
     * @param ISBN the ISBN of the book
     * @param price the price of the book in dollars
     */
    public Book(String title, String author, String ISBN, double price) {
    	this.title = title;
    	this.author = author;
    	this.ISBN = ISBN;
    	this.price = price;
    }

    /**
     * Copy constructor. Copies the attributes of the given book into the newly created instance.
     * @param otherBook the book from which to copy the attributes
     */
    public Book(Book otherBook) {
    	if (otherBook != null) {
    		this.title = otherBook.title;
        	this.author = otherBook.author;
        	this.ISBN = otherBook.ISBN;
        	this.price = otherBook.price;
    	}
    }

    /**
     * Get the title of the book.
     * @return the String title of the book
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set the title of the book.
     * @param title the desired title of the book (should not be null)
     * @return True if setting the title succeeded, false otherwise.
     */
    public void setTitle(String title) {
    	if (title == null) {
    		return;
    	}
    	this.title = title;
    }

    /**
     * Get the author of the book.
     * @return the String author of the book
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Set the author of the book.
     * @param author the desired author of the book (should not be null)
     * @return True if setting the author succeeded, false otherwise.
     */
    public void setAuthor(String author) {
    	if (author == null) {
    		return;
    	}
    	this.author = author;
    }

    /**
     * Get the ISBN of the book.
     * @return the String ISBN of the book
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * Set the ISBN of the book.
     * @param ISBN the desired ISBN of the book (should not be null)
     * @return True if setting the ISBN succeeded, false otherwise.
     */
    public void setISBN(String ISBN) {
    	if (ISBN == null) {
    		return;
    	}
    	this.ISBN = ISBN;
    }

    /**
     * Get the price of the book in dollars
     * @return the double price of the book in dollars
     */
    public double getPrice() {
        return price;
    }

    /**
     * Set the price of the book.
     * @param price the desired price of the book in dollars
     * @return True if setting the price succeeded, false otherwise.
     */
    public void setPrice(double price) {
    	// Primitive type cannot be null, so no parameter checking.
    	this.price = price;
    }

    /**
     * Convert the object to a string representation of its contents.
     * @return the string representation of the book's attributes
     */
    @Override
    public String toString() {
        return String.format("%s by %s (ISBN: %s, $%.2f)", this.title, this.author, this.ISBN, this.price);
    }

    /**
     * Compare the book to another object. Returns false if the other object is not also a book.
     * Otherwise, it compares the attributes of the provided instance to those of this instance
     * and returns true only if all attributes are identical in value.
     * @return True if the object are exactly equal in attribute values, otherwise false. 
     */
    @Override
    public boolean equals(Object obj) {
    	if (obj == null || obj.getClass() != this.getClass()) {
    		return false;
    	}
    	Book book = (Book)obj;

    	if (this.author.equals(book.author) && this.title.equals(book.title) && this.ISBN.equals(book.ISBN) && this.price == book.price){
    		return true;
    	}
        return false;
    }
}