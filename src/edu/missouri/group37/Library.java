package edu.missouri.group37;


/**
 * A class that represents a collection of books. It is designed to store up to
 * five books and provides utility methods for managing the collection.
 */
public class Library {
	private Book[] books = new Book[5];
    private int count = 0;

    /**
     * Add a book to the library. Will reject an addition if the library is full.
     * @param book The book to be added to the library. Should not be null.
     * @return true for successful addition, false otherwise.
     */
    public boolean addBook(Book book) {
    	// It is important to check for null books, as a null entry could create
    	// null reference errors within other functions.
    	if (book != null && count < books.length) {
    		books[count] = book;
    		count++;
    		return true;
    	}
        return false;
    }

    /**
     * Remove a book from the library.
     * @param book The book to be removed from the library. Should not be null.
     * @return true for successful removal, false otherwise.
     */
    public boolean removeBook(Book book) {
    	if (book == null) {
    		return false;
    	}
    	for (int i=0; i < count; i++) {
    		if (books[i].equals(book)) {
    			for (int j = i; j < count - 1; j++) {
    				books[j] = books[j + 1];
    			}
    			// There is not a null reference concern with filling unpopulated spaces
    			// with null as the count variable prevents accessing these indices.
    			books[count - 1] = null;
    			count--;
    			return true;
    		}
    	}
        return false;
    }

    /**
     * Search for a book in the library based on its ISBN.
     * @param ISBN the ISBN to search for. Should not be null.
     * @return the book corresponding to the ISBN, if it exists in the library. Otherwise, null.
     */
    public Book searchByISBN(String ISBN) {
    	if (ISBN == null) {
    		return null;
    	}
    	for (int i = 0; i < count; i++) {
    		if (books[i].getISBN().equals(ISBN)) {
    			return books[i];
    		}
    	}
        return null;
    }

    /**
     * Displays all books in the library. Results are printed to stdout.
     */
    public void displayBooks() {
    	if (count == 0) {
    		System.out.println("There no books in the library");
    	} else {
    		for (int i = 0; i < count; i++) {
    			System.out.println(books[i].toString());
    		}
    	}
    }
}