import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Books> books = new ArrayList<>();

    public static void addBook() {
        System.out.print("Enter book ISBN: ");
        String isbn = scanner.nextLine();

        Books newBook = new Books();
        newBook.setIsbn(isbn);

        System.out.print("Enter title: ");
        newBook.setTitle(scanner.nextLine());

        System.out.print("Enter author: ");
        newBook.setAuteur(scanner.nextLine());

        System.out.print("Enter availability (true/false): ");
        newBook.setDispo(scanner.nextBoolean());
        scanner.nextLine();

        books.add(newBook);
        System.out.println("Book added successfully.");
    }

    public static void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Books book : books) {
                System.out.println(book);
            }
        }
    }

    public static void searchBooks(String isbnToSearch) {
        for (Books book : books) {
            if (book.getIsbn().equals(isbnToSearch)) {
                System.out.println("The book is found: " + book);
                return;
            }
        }
        System.out.println("No book found with this ISBN.");
    }

    public static void updateBook() {
        System.out.print("Enter the ISBN of the book to update: ");
        String isbnToUpdate = scanner.nextLine();

        boolean bookFound = false;

        for (Books book : books) {
            if (book.getIsbn().equals(isbnToUpdate)) {
                bookFound = true;

                System.out.print("Enter new title : ");
                String newTitle = scanner.nextLine();
                if (!newTitle.isEmpty()) {
                    book.setTitle(newTitle);
                }

                System.out.print("Enter new author : ");
                String newAuthor = scanner.nextLine();
                if (!newAuthor.isEmpty()) {
                    book.setAuteur(newAuthor);
                }

                System.out.print("Enter new availability (true/false): ");
                String newDispo = scanner.nextLine();
                if (!newDispo.isEmpty()) {
                    book.setDispo(Boolean.parseBoolean(newDispo));
                }

                System.out.println("Book updated successfully: " + book);
                break;
            }
        }

        if (!bookFound) {
            System.out.println("No book found with the given ISBN.");
        }
    }

    public static void removeBook() {
        System.out.print("Enter the ISBN of the book to remove: ");
        String isbnToRemove = scanner.nextLine();

        boolean bookFound = false;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getIsbn().equals(isbnToRemove)) {
                books.remove(i);
                System.out.println("Book removed successfully.");
                bookFound = true;
                break;
            }
        }

        if (!bookFound) {
            System.out.println("No book found with the given ISBN.");
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n==-_-_--== Library Management System ==--_-_-==");
            System.out.println("1 - Add a Book");
            System.out.println("2 - Display All Books");
            System.out.println("3 - Find Book by ISBN");
            System.out.println("4 - Update a Book");
            System.out.println("5 - Remove a Book");
            System.out.println("6 - Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    displayBooks();
                    break;
                case 3:
                    System.out.print("Enter the ISBN of the book to search: ");
                    String isbnToSearch = scanner.nextLine();
                    searchBooks(isbnToSearch);
                    break;
                case 4:
                    updateBook();
                    break;
                case 5:
                    removeBook();
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
