package HomeworkObject;

import HomeworkObject.Book;

public class Printbook {
    public static void printbook(Book book){
        System.out.println("book = " + book.nameBook);
        System.out.println("book = " + book.getAuthor());
        System.out.println("book = " + book.age);
    }
}
