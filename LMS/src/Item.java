// Base class for library items
public class Item { // Declaration of the Item class, which will be the base class for other items
    private String title; // Private attribute to store the title of the item
    private boolean isBorrowed; // Private attribute to store the borrowed status of the item

    // Constructor to initialize an item with a title
    public Item(String title) { // Constructor of the Item class
        this.title = title; // Initialize the title attribute with the provided value
        this.isBorrowed = false; // Initialize the isBorrowed attribute to false
    }

    // Getter for item title
    public String getTitle() { // Method to get the title of the item
        return title; // Return the value of the title attribute
    }

    // Check if the item is borrowed
    public boolean isBorrowed() { // Method to check if the item is borrowed
        return isBorrowed; // Return the value of the isBorrowed attribute
    }

    // Borrow the item
    public void borrowItem() { // Method to borrow the item
        if (!isBorrowed) { // If the item is not already borrowed
            isBorrowed = true; // Set the isBorrowed attribute to true
            System.out.println("You successfully borrowed " + title); // Print a success message
        } else { // If the item is already borrowed
            System.out.println("Sorry, " + title + " is already borrowed."); // Print a message indicating the item is already borrowed
        }
    }

    // Return the item
    public void returnItem() { // Method to return the item
        if (isBorrowed) { // If the item is currently borrowed
            isBorrowed = false; // Set the isBorrowed attribute to false
            System.out.println("You successfully returned " + title); // Print a success message
        } else { // If the item is not currently borrowed
            System.out.println("This item wasn't borrowed."); // Print a message indicating the item wasn't borrowed
        }
    }

    // Override toString method to provide a string representation of the item
    @Override // Annotation to indicate that this method overrides a method from the superclass
    public String toString() { // Method to provide a string representation of the item
        return "Item: " + title + ", Borrowed: " + isBorrowed; // Return a string with the item's title and borrowed status
    }
}
