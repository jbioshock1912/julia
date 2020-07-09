package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {

        Book firstBook = new Book("It", 580);
        Book secondBook = new Book("Beach", 65);
        Book thirdBook = new Book("Sky", 200);
        Book fourthBook = new Book("Clean code", 1);

        Book[] books = new Book[4];
        books[0] = firstBook;
        books[1] = secondBook;
        books[2] = thirdBook;
        books[3] = fourthBook;

        for (int i = 0; i < books.length; i++) {
            Book value = books[i];
            System.out.println(value.getTitle() + ", " + value.getNumberOfPage());
        }

        System.out.println("replacement");
        Book forReplace = books[0];
        books[0] = books[3];
        books[3] = forReplace;

        for (int i = 0; i < books.length; i++) {
            Book value = books[i];
            System.out.println(value.getTitle() + ", " + value.getNumberOfPage());
        }
    }
}
