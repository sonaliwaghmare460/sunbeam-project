package Bookpackage;


	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.ObjectInputStream;
	import java.io.ObjectOutputStream;
	import java.util.ArrayList;
	import java.util.List;

	class BookFileManager {
	    private static final String FILE_NAME = "books.dat";

	    public static void saveBooks(List<Book> bookList) {
	        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
	            oos.writeObject(bookList);
	            System.out.println("Books saved to file.");
	        } catch (IOException e) {
	            System.out.println("Error saving books to file: " + e.getMessage());
	        }
	    }

	    public static List<Book> loadBooks() {
	        File file = new File(FILE_NAME);
	        if (!file.exists()) {
	            return new ArrayList<>();
	        }

	        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
	            return (List<Book>) ois.readObject();
	        } catch (IOException | ClassNotFoundException e) {
	            System.out.println("Error loading books from file: " + e.getMessage());
	            return new ArrayList<>();
	        }
	    }
	}


