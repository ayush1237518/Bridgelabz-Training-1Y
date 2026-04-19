package com.gla;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LibraryService libraryService = new LibraryService();

        // ---------------- MAIN MENU ----------------
        while (true) {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Admin");
            System.out.println("2. Student");
            System.out.println("3. Exit");
            System.out.print("Select Option : ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    adminMenu(sc, libraryService);
                    break;
                case 2:
                    studentMenu(sc, libraryService);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    // ---------------- ADMIN MENU ----------------
    public static void adminMenu(Scanner sc, LibraryService service) {
        while (true) {
            System.out.println("\n--- ADMIN MENU ---");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. View Books");
            System.out.println("4. Back");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    service.addBook(sc);
                    break;
                case 2:
                    service.removeBook(sc);
                    break;
                case 3:
                    service.viewBooks();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    // ---------------- STUDENT MENU ----------------
    public static void studentMenu(Scanner sc, LibraryService service) {
        while (true) {
            System.out.println("\n--- STUDENT MENU ---");
            System.out.println("1. View Books");
            System.out.println("2. Search Book");
            System.out.println("3. Rent Book");
            System.out.println("4. Return Book");
            System.out.println("5. Back");

            int choice = sc.nextInt();

            switch (choice) {
                case 1: service.viewBooks();
                    break;
                case 2: service.searchBook(sc);
                    break;
                case 3: service.rentBook(sc);
                    break;
                case 4: service.returnBook(sc);
                    break;
                case 5: return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}