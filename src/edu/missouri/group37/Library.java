package edu.missouri.group37;

public class Library {
<<<<<<< HEAD
	private Book[] books = new Book[5];
=======
    private Book[] books = new Book[5];
>>>>>>> 8677bd7a04667b2e700da63c0557b78b1f84cff1
    private int count = 0;

    /***
     *
     */
    public boolean addBook(Book book) {
    	if (count < books.length) {
    		books[count] = book;
    		return true;
    	}
        return false;
    }

    /***
     *
     */
    public boolean removeBook(Book book) {
        return false;
    }

    /***
     *
     */
    public Book searchByISBN(String ISBN) {
        return null;
    }

    /***
     *
     */
    public void displayBooks() {
        return;
    }
}