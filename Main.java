
public class Main {
    public static void main(String[] args) {
        // Membuat objek Animal
        Animal genericAnimal = new Animal("Hewan Umum");
        genericAnimal.makeSound(); // Output: Hewan bersuara...

        // Membuat objek Cat
        Cat kitty = new Cat("Kitty");
        kitty.makeSound(); // Output: Kitty berkata: Meow! Meow!
    }
}
