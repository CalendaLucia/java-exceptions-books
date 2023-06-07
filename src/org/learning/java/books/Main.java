package org.learning.java.books;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberBooks;
        do {
            System.out.println("Quanti libri da inserire?");
            numberBooks = Integer.parseInt(scanner.nextLine());
            if (numberBooks <= 0) {
                System.out.println("Inserire un numero di libri valido (maggiore di zero).");
            }
        } while (numberBooks <= 0);



        Book[] books = new Book[numberBooks];

        for (int i = 0; i < numberBooks; i++) {
            boolean flag = false;
            Book book = null;

            do {
                try {
                    System.out.println("Inserisci Titolo: ");
                    String title = scanner.nextLine();
                    System.out.println("Inserisci numero di pagine: ");
                    int numberPage = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci autore: ");
                    String author = scanner.nextLine();
                    System.out.println("Inserisci editore: ");
                    String publisher = scanner.nextLine();
                    book = new Book(title, numberPage, author, publisher);

                    flag = true;
                } catch (IllegalArgumentException e) {
                    System.out.println("Dettagli libro non validi! Riprova");
                }

            } while (!flag);

            books[i] = book;
            System.out.println(books[i].toString());
        }
        System.out.println("Fine");
        scanner.close();




    }
}
