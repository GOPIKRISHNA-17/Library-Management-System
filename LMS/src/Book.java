// Book class inheriting from Item
class Book extends Item { // Declaration of the Book class, which extends the Item class
    private String author; // Private attribute to store the author of the book

    // Constructor to initialize a book with title and author
    public Book(String title, String author) { // Constructor of the Book class
        super(title); // Call the constructor of the superclass (Item) to initialize the title
        this.author = author; // Initialize the author attribute with the provided value
    }

    // Getter for book author
    public String getAuthor() { // Method to get the author of the book
        return author; // Return the value of the author attribute
    }

    // Override toString method to provide a string representation of the book
    @Override // Annotation to indicate that this method overrides a method from the superclass
    public String toString() { // Method to provide a string representation of the book
        return "Book: " + getTitle() + ", Author: " + author + ", Borrowed: " + isBorrowed(); // Return a string with the book's title, author, and borrowed status
    }
}
