abstract public class Animal {
    private String noise;

    public Animal(String noise) {
        this.noise = noise;
    }

    public String getNoise() {
        return noise;
    }

    public void setNoise(String noise) {
        this.noise = noise;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "noise='" + noise + '\'' +
                '}';
    }
    public abstract void printAnimalNoise();
}
