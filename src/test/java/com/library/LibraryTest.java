package com.library;




public class LibraryTest {
    public static void main(String[] args) {
        System.out.println("Memulai Automasi Pengujian Java Assertion...");
        testAddBook();
        
    }

    public static void testAddBook() {
        Library library = new Library();
        Book book = new Book("Verity", "Colleen Hoover");
        library.addBook(book);
        assert book.isAvailable() == true : "ERROR: Buku baru harusnya berstatus Available!";
        System.out.println("[PASSED] testAddBook");
    }
}
