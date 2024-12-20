import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Books> books = new ArrayList<>();
    public  static void  addBook (){

        Books  newBook = new Books();//kteb lktab

        System.out.println("enter title :");
        newBook. title= scanner.nextLine();
        System.out.println("enter l'autheur :");
        newBook.auteur = scanner.nextLine();
        System.out.println("enter L'ISBN :");
        newBook.isbn=scanner.nextLine();
        System.out.println("enter la disponibile ( true / false)");
        newBook.dispo = scanner.nextBoolean();

        books.add(newBook);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n-_-_-_-Library Management System-_-_-_-");
            System.out.println("1 - Add a Book");
            System.out.println("2 - Display All Books");
            System.out.println("3 - Find Book by ID");
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