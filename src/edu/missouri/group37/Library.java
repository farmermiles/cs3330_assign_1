package edu.missouri.group37;

public class Library {
	private Book[] books = new Book[5];
    private int count = 0;

    /***
     *Added the ability to store books
     */
    public boolean addBook(Book book) {
    	if (count < books.length) {
    		books[count] = book;
    		count++;
    		return true;
    	}
        return false;
    }

    /***
     *Added the ability to remove books
     */
    public boolean removeBook(Book book) {
    	for (int i=0; i < count; i++) {
    		if (books[i].equals(book)) {
    			for (int j = i; j < count -1; j++) {
    				books[j] = books[j +1];
    			}
    			books[count -1] = null;
    			count--;
    			return true;
    		}
    	}
        return false;
    }

    /***
     *this searches a book by its ISBN
     */
    public Book searchByISBN(String ISBN) {
    	for (int i = 0; i < count; i++) {
    		if (books[i].getISBN().equals(ISBN)) {
    			return books[i];
    		}
    	}
        return null;
    }

    /***
     *Displays all of the books
     */
    public void displayBooks() {
    	if (count == 0) {
    		System.out.println("There no books in the library");
    	}else {
    		for (int i = 0; i < count; i++) {
    			System.out.println(books[i].toString());
    		}
    	}
    }
}