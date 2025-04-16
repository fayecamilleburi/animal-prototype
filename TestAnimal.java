public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        Animal dolly = registry.createSheep("Dolly");
        dolly.makeSound();

        Animal bessie = registry.createCow();
        bessie.makeSound();

        Animal spirit = registry.createHorse();
        spirit.makeSound();
    }
}
