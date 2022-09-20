public class Dog extends Canine implements Pet{

    public Dog(String noise) {
        super(noise);
    }

    @Override
    public void printAnimalNoise() {
        System.out.println("wolf wolf");

    }

    @Override
    public void beFriendly() {

    }

    @Override
    public void play() {

    }
}
