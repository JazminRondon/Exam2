public class Hippo extends Animal {
    public Hippo(String noise) {
        super(noise);
    }

    @Override
    public void printAnimalNoise() {
        System.out.println("hippo sound");
    }
}