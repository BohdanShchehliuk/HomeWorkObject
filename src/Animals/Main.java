package Animals;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Васька", 45, false);
        Animal animal1 = new Animal("Васька", 45, true);
        System.out.println(animal.toString());
        System.out.println(animal.hashCode());
        System.out.println(animal1.hashCode());
        System.out.println(animal.equals(animal1));
    }
}
