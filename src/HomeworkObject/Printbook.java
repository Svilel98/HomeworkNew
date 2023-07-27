package HomeworkObject;

import HomeworkObject.Book;

public class Printbook {
    public static void printbook(Book book) {
        System.out.println("book = " + book.getNameBook());
        System.out.println("book = " + book.getAuthor());
        System.out.println("book = " + book.getAge());
        System.out.println("hashCode = " + book.hashCode());
        System.out.println("book.equals() = " + book.equals(new Book("Кролик Питер", 1999, book.getAuthor())));
    }
}
