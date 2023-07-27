package HomeworkObject;

public class Author {
    private String name;
    private String surname;


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

    @Override
    public String toString() {
        return name + " " + surname;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author a2 = (Author) other;
        return name.equals(a2.name) && name.equals(a2.surname);
    }


    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, surname);
    }

}
