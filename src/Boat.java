public class Boat extends Transport {

    public Boat(String name, int volume) {
        super(name, volume);
    }
    @Override
    public String toString() {
        return "Машина.";
    }
    public void moving() {
        System.out.println("Плавает по воде");
    }
}
