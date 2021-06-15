public class Car extends Transport {

    public Car(String name, int volume) {
        super(name, volume);
    }
    @Override
    public String toString() {
        return "Машина.";
    }
    public void moving() {
        System.out.println("Едет по земле");
    }
}
