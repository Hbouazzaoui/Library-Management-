import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Books> books = new ArrayList<>();


    public static void addBook() {
        System.out.print("Enter book ID:");
        int id = scanner.nextInt();
        scanner.nextLine();

        Books newBook = new Books();

        System.out.print("Enter title:");
        newBook.setTitle(scanner.nextLine());

        System.out.print("Enter author:");
        newBook.setAuteur(scanner.nextLine());

        System.out.print("Enter ISBN:");
        newBook.setIsbn(scanner.nextLine());

        System.out.print("Enter availability (TRUE/FALSE):");
        newBook.setDispo(scanner.nextBoolean());

        newBook.setId(id);

        books.add(newBook);
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
        System.out.print("Enter the ID of the book to update:");
        int bookId = scanner.nextInt();
        scanner.nextLine();

        boolean bookFound = false;

        for (Books book : books) {
            if (book.getId() == bookId) {
                bookFound = true;

                System.out.print("Enter new title :");
                String newTitle = scanner.nextLine();
                if (!newTitle.isEmpty()) {
                    book.setTitle(newTitle);
                }

                System.out.print("Enter new author :");
                String newAuthor = scanner.nextLine();
                if (!newAuthor.isEmpty()) {
                    book.setAuteur(newAuthor);
                }

                System.out.print("Enter new ISBN :");
                String newIsbn = scanner.nextLine();
                if (!newIsbn.isEmpty()) {
                    book.setIsbn(newIsbn);
                }

                System.out.println("Enter new availability (true/false) :");
                String newDispo = scanner.nextLine();
                if (!newDispo.isEmpty()) {
                    book.setDispo(Boolean.parseBoolean(newDispo));
                }

                System.out.println("Book updated successfully: " + book);
                break;
            }
        }

        if (!bookFound) {
            System.out.println("No book found with the given ID.");
        }
    }

    public static void removeBook() {
        System.out.print("Enter the ID of the book to remove: ");
        int bookId = scanner.nextInt();
        scanner.nextLine();

        boolean bookFound = false;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == bookId) {
                books.remove(i);
                System.out.println("Book removed successfully.");
                bookFound = true;
                break;
            }
        }

        if (!bookFound) {
            System.out.println("No book found with the given ID.");
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


