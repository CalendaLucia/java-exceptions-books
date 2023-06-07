package org.learning.java.books;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanti libri da inserire?");

        int numberBooks = Integer.parseInt(scanner.nextLine());
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
//                    System.out.println(book.toString());
                    flag = true;
                } catch (IllegalArgumentException e) {
                    System.out.println("Inserisci un titolo, autore ed editore validi");
                }

            } while (!flag);

            books[i] = book;
            System.out.println(books[i].toString());
        }
        System.out.println("Fine");
        scanner.close();




    }
}
