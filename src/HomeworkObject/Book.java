package HomeworkObject;

import HomeworkObject.Author;

public class Book {
    private Author author;

    private String nameBook;

    private int age;

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
        return author.equals(a2.author) && nameBook.equals(a2.nameBook) && a2.age == age;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(nameBook, author, age);
    }

    public Book(String nameBook, int age, Author author) {
        this.nameBook = nameBook;
        this.age = age;
        this.author = author;
    }
}
