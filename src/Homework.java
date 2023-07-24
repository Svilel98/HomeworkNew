public class Homework {
    public static void main(String[] args) {
        Author king = new Author("Steven", "King");
        Book it = new Book("IT", 1986, king);
        Author pushkin = new Author("Александр", "Пушкин");
        System.out.println("it = " + it);
        Book goldFish = new Book("Золотая рыбка", 1728, pushkin);
        System.out.println("goldFish = " + goldFish);
        goldFish.setAge(1703);
        System.out.println("goldFish = " + goldFish);
        Printbook.printbook(it);
        System.out.println("printbook = " + it);
    }
}
