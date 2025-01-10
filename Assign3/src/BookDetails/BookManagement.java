package BookDetails;
import java.util.ArrayList;
import java.util.Scanner;
public class BookManagement  {
    public static ArrayList<Books> books = new ArrayList<>();
   
    public static void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (Books book : books) {
                System.out.println(book);
            }
        }
    }
    public static Books findBook(String isbn) {
        for (Books book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }
    public static void addBook(Books book) {
        if (findBook(book.getIsbn()) != null) {
            System.out.println("Book with this ISBN already exists.");
        } else {
            books.add(book);
            System.out.println("Book added successfully.");
        }
    }
    public static void removeBook(String isbnToRemove) {
        if (findBook(isbnToRemove) != null) {
            System.out.println("Book with this ISBN already exists.");
        } else {
            books.remove(isbnToRemove);
            System.out.println("Book removed Successfully .");
        }
    }
    public static void editBookQuantity(String isbn, int newQuantity) {
        Books book = findBook(isbn);
        if (book != null) {
            book.quantity = newQuantity;
            System.out.println("Book quantity updated successfully.");
        } else {
            System.out.println("Book not found.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        books.add(new Books("book-0001", Category.SCIENCE, 500, "12-3-2020", "Rama", 10));
        books.add(new Books("book-0009", Category.FICTION, 400, "12-12-2010", "Kishor", 20));
        books.add(new Books("book-0003", Category.SCIENCE, 1500, "1-3-2021", "Shubham", 15));
        books.add(new Books("book-0005", Category.SCIENCE, 600, "12-3-2020", "Rama", 12));
        books.add(new Books("book-0004", Category.HEALTH, 700, "12-3-2020", "Rama", 30) );

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Display All Books");
            System.out.println("2. Find a Book");
            System.out.println("3. Add New Book");
            System.out.println("4. Remove a Book");
            System.out.println("5. Edit Book Quantity");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    displayAllBooks();
                    break;
                case 2:
                    System.out.print("Enter ISBN to find: ");
                    String isbnToFind = sc.nextLine();
                    Books foundBook = findBook(isbnToFind);
                    if (foundBook != null) {
                        System.out.println(foundBook);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter ISBN: ");
                    String isbn = sc.nextLine();
                    System.out.print("Enter Category (SCIENCE/FICTION/HEALTH): ");
                    String categoryStr = sc.nextLine().toUpperCase();
                    Category category = Category.valueOf(categoryStr);
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter Publish Date: ");
                    String publishDate = sc.nextLine();
                    System.out.print("Enter Author Name: ");
                    String authorName = sc.nextLine();
                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();

                    addBook(new Books(isbn, category, price, publishDate, authorName, quantity));
                    break;
                case 4:
                    System.out.print("Enter ISBN to remove: ");
                    String isbnToRemove = sc.nextLine();
                    removeBook(isbnToRemove);
                    break;
                case 5:
                    System.out.print("Enter ISBN to edit quantity: ");
                    String isbnToEdit = sc.nextLine();
                    System.out.print("Enter new quantity: ");
                    int newQuantity = sc.nextInt();
                    editBookQuantity(isbnToEdit, newQuantity);
                    break;
                case 6:
                    System.out.println("Exiting Library Management System.");
                    
            }
        }
    }
}



 