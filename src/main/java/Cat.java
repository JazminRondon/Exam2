public class Cat extends Feline implements Pet{
    public Cat(String noise) {
        super(noise);
    }

    @Override
    public void printAnimalNoise() {
        System.out.println("Meowww");

    }

    @Override
    public void beFriendly() {

    }

    @Override
    public void play() {

    }
}
