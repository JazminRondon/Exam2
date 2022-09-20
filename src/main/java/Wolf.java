public class Wolf extends Canine{
    public Wolf(String noise) {
        super(noise);
    }

    @Override
    public void printAnimalNoise() {
        System.out.println("Wolf sound");
    }
}
