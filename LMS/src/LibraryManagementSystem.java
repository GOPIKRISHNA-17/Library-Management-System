import java.util.Scanner; // Import the Scanner class for reading user input

public class LibraryManagementSystem { // Main class for the library management system
    public static void main(String[] args) { // Main method to start the program
        Library library = new Library(); // Create a new library instance
        Scanner scanner = new Scanner(System.in); // Create a scanner object for user input
        int choice; // Variable to store the user's menu choice

        // Display the menu and process user choices
        do { // Start of the do-while loop to repeatedly show the menu until the user exits
            System.out.println("\nLibrary Management System:"); // Display the system name
            System.out.println("1. Add Book"); // Option to add a new book
            System.out.println("2. Remove Item"); // Option to remove an item from the library
            System.out.println("3. List All Items"); // Option to list all items in the library
            System.out.println("4. Borrow Item"); // Option to borrow an item from the library
            System.out.println("5. Return Item"); // Option to return a borrowed item
            System.out.println("6. Exit"); // Option to exit the system
            System.out.print("Enter your choice: "); // Prompt the user to enter their choice
            choice = scanner.nextInt(); // Read the user's choice
            scanner.nextLine(); // Consume the newline character left by nextInt()

            switch (choice) { // Switch statement to handle different menu options
                case 1: // Case for adding a new book
                    System.out.print("Enter book title: "); // Prompt the user to enter the book title
                    String title = scanner.nextLine(); // Read the book title
                    System.out.print("Enter book author: "); // Prompt the user to enter the book author
                    String author = scanner.nextLine(); // Read the book author
                    library.addItem(new Book(title, author)); // Add the new book to the library
                    break; // Exit the switch statement
                case 2: // Case for removing an item from the library
                    System.out.print("Enter item title to remove: "); // Prompt the user to enter the item title
                    title = scanner.nextLine(); // Read the item title
                    library.removeItem(title); // Remove the item from the library
                    break; // Exit the switch statement
                case 3: // Case for listing all items in the library
                    library.listItems(); // List all items in the library
                    break; // Exit the switch statement
                case 4: // Case for borrowing an item from the library
                    System.out.print("Enter item title to borrow: "); // Prompt the user to enter the item title
                    title = scanner.nextLine(); // Read the item title
                    library.borrowItem(title); // Borrow the item from the library
                    break; // Exit the switch statement
                case 5: // Case for returning an item to the library
                    System.out.print("Enter item title to return: "); // Prompt the user to enter the item title
                    title = scanner.nextLine(); // Read the item title
                    library.returnItem(title); // Return the item to the library
                    break; // Exit the switch statement
                case 6: // Case for exiting the system
                    System.out.println("Exiting system. Goodbye!"); // Display exit message
                    break; // Exit the switch statement
                default: // Case for an invalid choice
                    System.out.println("Invalid choice! Please try again."); // Display error message
            }
        } while (choice != 6); // Continue the loop until the user chooses to exit

        scanner.close(); // Close the scanner to free up resources
    }
}
