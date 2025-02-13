package edu.missouri.group37;

public class LibraryApp {
    public static void main(String[] args) {
        String ISBNToSearchFor = "4321";
        // Want to be able to confirm the correct book was retrieved, so keep track of its title.
        String titleForSearchedBook = "This is Book 2";
        
        Library library = new Library();
        
        System.out.println("Creating and adding books to the library.");
        
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
        book6.setISBN("3427");
        book6.setTitle("Should not be in the library (book 6)");
        
        library.addBook(book4);
        library.addBook(book5);
        
        
        System.out.println("\nAttempting to add one extra book to the library beyond its capacity.");
        boolean sixthBookAdditionResult = library.addBook(book6);
       
        System.out.println("Did the library reject the sixth book?: " + (sixthBookAdditionResult ? "No" : "Yes"));
        
        
        System.out.println("\nSearching for book with ISBN: " + ISBNToSearchFor);
        Book searchForISBNResult = library.searchByISBN(ISBNToSearchFor);
        
        if (searchForISBNResult == null) {
        	System.out.println("No book was found!");
        } else {
        	System.out.println("Book found: " + searchForISBNResult.toString());
        	
        	boolean titleMatches = searchForISBNResult.getTitle().equals(titleForSearchedBook);
        	System.out.println("Retrieved book title matches expected title?: " + (titleMatches ? "Yes" : "No"));
        }
        
        System.out.println("\nList all current books in the library:");
        library.displayBooks();
        
        boolean removeValidBookResult = library.removeBook(book1);
        System.out.println("\nAttempt to remove a book that exists in the library result: " + (removeValidBookResult ? "Success" : "Failure"));
        
        boolean removeInvalidBookResult = library.removeBook(book6);
        System.out.println("Attempt to remove a book that is NOT in the library result (failure expected): " + (removeInvalidBookResult ? "Success" : "Failure"));
        
        
        System.out.println("\nList all books in the library:");
        library.displayBooks();
    }
}