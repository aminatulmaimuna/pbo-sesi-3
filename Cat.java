
public class Cat extends Animal {
    // Konstruktor untuk inisialisasi nama
    public Cat(String name) {
        super(name); // Memanggil konstruktor kelas induk
    }

    // Override metode makeSound untuk kucing
    @Override
    public void makeSound() {
        System.out.println(name + " berkata: Meow! Meow!");
    }
}
