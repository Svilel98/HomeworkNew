package HomeworkObject;

import HomeworkObject.Author;

public class Book {
    private Author author;

    String nameBook;

    int age;

    public Author getAuthor() {
        return this.author;
    }


    public String getNameBook() {
        return this.nameBook;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return nameBook + " " + age + " " + author;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book a2 = (Book) other;
        return nameBook.equals(a2.nameBook);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(nameBook);
    }
    public Book(String nameBook, int age, Author author) {
        this.nameBook = nameBook;
        this.age = age;
        this.author = author;
    }
}
