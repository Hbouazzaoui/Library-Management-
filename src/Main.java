import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Books> books = new ArrayList<>();

<<<<<<< HEAD
    public static void addBook() {
        System.out.println("Enter book ID:");
        int id = scanner.nextInt();
        scanner.nextLine();
=======
        Books  newBook = new Books();
>>>>>>> ebe077ee9a058bd57d8a744490039dc774fb072e

        Books newBook = new Books();

        System.out.println("Enter title:");
        newBook.setTitle(scanner.nextLine());

        System.out.println("Enter author:");
        newBook.setAuteur(scanner.nextLine());

        System.out.println("Enter ISBN:");
        newBook.setIsbn(scanner.nextLine());

        System.out.println("Enter availability (TRUE/FALSE):");
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

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n-_-_-_-- Library Management System --_-_-_-");
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
                    break;
                case 4:
                    break;
                case 5:

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
