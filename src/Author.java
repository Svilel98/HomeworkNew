public class Author {
    private String name;
    private String surname;

    @Override
    public String toString() {
        return  name + " " +  surname ;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getAuthor() {
        return this.name + this.surname;
    }
}
