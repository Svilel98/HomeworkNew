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

    public Book(String nameBook, int age, Author author) {
        this.nameBook = nameBook;
        this.age = age;
        this.author = author;
    }
}
