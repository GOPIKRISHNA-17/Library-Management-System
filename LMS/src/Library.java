import java.util.ArrayList; // Import the ArrayList class for managing a collection of items

// Represents a library containing items
public class Library {
    private ArrayList<Item> items; // ArrayList to store the items in the library

    // Constructor to initialize the library
    public Library() {
        items = new ArrayList<>(); // Initialize the items ArrayList
    }

    // Add an item to the library
    public void addItem(Item item) {
        items.add(item); // Add the given item to the items list
        System.out.println("Item added: " + item.getTitle()); // Print a message indicating the item was added
    }

    // Remove an item from the library by title
    public void removeItem(String title) {
        for (Item item : items) { // Iterate over each item in the items list
            if (item.getTitle().equalsIgnoreCase(title)) { // Check if the item's title matches the given title (case insensitive)
                items.remove(item); // Remove the item from the list
                System.out.println("Item removed: " + title); // Print a message indicating the item was removed
                return; // Exit the method
            }
        }
        System.out.println("Item not found: " + title); // Print a message if the item was not found
    }

    // List all items in the library
    public void listItems() {
        if (items.isEmpty()) { // Check if the items list is empty
            System.out.println("No items in the library."); // Print a message if there are no items
        } else {
            for (Item item : items) { // Iterate over each item in the items list
                System.out.println(item); // Print the details of the item
            }
        }
    }

    // Borrow an item from the library by title
    public void borrowItem(String title) {
        for (Item item : items) { // Iterate over each item in the items list
            if (item.getTitle().equalsIgnoreCase(title)) { // Check if the item's title matches the given title (case insensitive)
                item.borrowItem(); // Call the borrowItem method on the item
                return; // Exit the method
            }
        }
        System.out.println("Item not found: " + title); // Print a message if the item was not found
    }

    // Return an item to the library by title
    public void returnItem(String title) {
        for (Item item : items) { // Iterate over each item in the items list
            if (item.getTitle().equalsIgnoreCase(title)) { // Check if the item's title matches the given title (case insensitive)
                item.returnItem(); // Call the returnItem method on the item
                return; // Exit the method
            }
        }
        System.out.println("Item not found: " + title); // Print a message if the item was not found
    }
}
