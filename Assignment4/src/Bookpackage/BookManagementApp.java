package Bookpackage;


	import java.time.LocalDate;
	import java.time.format.DateTimeParseException;
	import java.util.Comparator;
	import java.util.HashSet;
	import java.util.List;
	import java.util.Scanner;
	import java.util.Set;

	public class BookManagementApp {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        List<Book> bookList = BookFileManager.loadBooks();
	        Set<String> isbnSet = new HashSet<>();
	        for (Book book : bookList) {
	            isbnSet.add(book.getIsbn());
	        }

	        Set<String> validCategories = Set.of("Science", "Fiction", "Health", "History", "Mystery", "Biography");
	        LocalDate startDate = LocalDate.of(2023, 4, 1);
	        LocalDate endDate = LocalDate.of(2024, 3, 31);

	        int choice;

	        do {
	            System.out.println("\n--- Book Management System ---");
	            System.out.println("1. Add Book");
	            System.out.println("2. Display Books");
	            System.out.println("3. Sort Books by ISBN");
	            System.out.println("4. Sort Books by Author");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1: {
	                    System.out.print("Enter ISBN: ");
	                    String isbn = sc.next();

	                    if (isbnSet.contains(isbn)) {
	                        System.out.println("Error: ISBN already exists!");
	                        break;
	                    }

	                    System.out.print("Enter Title: ");
	                    sc.nextLine();
	                    String title = sc.nextLine();
	                    System.out.print("Enter Author: ");
	                    String author = sc.nextLine();
	                    System.out.print("Enter Category (Science, Fiction, Health, History, Mystery, Biography): ");
	                    String category = sc.next();

	                    if (!validCategories.contains(category)) {
	                        System.out.println("Error: Invalid category!");
	                        break;
	                    }

	                    System.out.print("Enter Publish Date (YYYY-MM-DD): ");
	                    try {
	                        LocalDate publishDate = LocalDate.parse(sc.next());
	                        if (publishDate.isBefore(startDate) || publishDate.isAfter(endDate)) {
	                            System.out.println("Error: Publish date must be between " + startDate + " and " + endDate);
	                            break;
	                        }

	                        Book book = new Book(isbn, title, author, category, publishDate);
	                        bookList.add(book);
	                        isbnSet.add(isbn);
	                        BookFileManager.saveBooks(bookList);
	                        System.out.println("Book added successfully!");
	                    } catch (DateTimeParseException e) {
	                        System.out.println("Error: Invalid date format!");
	                    }

	                    break;
	                }

	                case 2: {
	                    if (bookList.isEmpty()) {
	                        System.out.println("No books to display!");
	                    } else {
	                        System.out.println("\n--- Book List ---");
	                        for (Book book : bookList) {
	                            System.out.println(book);
	                        }
	                    }
	                    break;
	                }

	                case 3: {
	                    bookList.sort(Comparator.comparing(Book::getIsbn));
	                    System.out.println("Books sorted by ISBN.");
	                    for (Book book : bookList) {
	                        System.out.println(book);
	                    }
	                    break;
	                }

	                case 4: {
	                    bookList.sort(Comparator.comparing(Book::getAuthor));
	                    System.out.println("Books sorted by Author.");
	                    for (Book book : bookList) {
	                        System.out.println(book);
	                    }
	                    break;
	                }

	                case 5: {
	                    System.out.println("Exiting... Thank you!");
	                    break;
	                }

	                default: {
	                    System.out.println("Invalid choice! Please try again.");
	                }
	            }
	        } while (choice != 5);

	        sc.close();
	    }
	}

