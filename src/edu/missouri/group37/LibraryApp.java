package edu.missouri.group37;

public class LibraryApp {
    public static void main(String[] args) {
        String ISBNToSearchFor = "4321";
        // Want to be able to confirm the correct book was retrieved, so keep track of its title.
        String titleForSearchedBook = "This is Book 2";
        
        Library library = new Library();
        
        //String title, String author, String ISBN, double price
        Book book1 = new Book("Book 1 Title", "Me", "1234", 20.5);
        
        Book book2 = new Book();
        book2.setAuthor("You");
        book2.setTitle(titleForSearchedBook);
        book2.setISBN(ISBNToSearchFor);
        book2.setPrice(30.0);
        
        Book book3 = new Book(book2);
        book3.setTitle("This is Book 2: Part 2");
        book3.setISBN(book3.getISBN() + "9");
        book3.setPrice(book3.getPrice() + 5.25);
        
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        
        Book book4 = new Book("Book 4", "Me", "5678", 20.5);
        Book book5 = new Book(book4);
        book5.setISBN("345");
        book5.setTitle("Book 5");
        

        Book book6 = new Book(book4);
        book5.setISBN("3427");
        book5.setTitle("Should not be in the library (book 6)");
        
        library.addBook(book4);
        library.addBook(book5);
        boolean sixthBookAdditionResult = library.addBook(book6);
       
        System.out.println("Did the library reject the sixth book?: " + (sixthBookAdditionResult ? "No" : "Yes"));
        
        
        Book searchForISBNResult = library.searchByISBN(ISBNToSearchFor);
        
        if (searchForISBNResult == null) {
        	System.out.println("No book was found!");
        } else {
        	System.out.println("Book search result for ISBN " + ISBNToSearchFor + ": ");
        	System.out.println(searchForISBNResult.toString());
        	
        	boolean titleMatches = searchForISBNResult.getTitle().equals(titleForSearchedBook);
        	System.out.println("Retrieved book title matches expected title?: " + (titleMatches ? "Yes" : "No"));
        }
        
        
        boolean removeValidBookResult = library.removeBook(book1);
        System.out.println("Attempt to remove a book that exists in the library result: " + (removeValidBookResult ? "Success" : "Failure"));
        
        boolean removeInvalidBookResult = library.removeBook(book6);
        System.out.println("Attempt to remove a book that is not in the library result (failure expected): " + (removeInvalidBookResult ? "Success" : "Success"));
        
        
        System.out.println("List all books in the library:");
        library.displayBooks();
    }
}