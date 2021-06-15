public class Plane extends Transport {

    public Plane(String name, int volume) {
        super(name, volume);
    }

    @Override
    public String toString() {
        return "Самолет.";
    }
    public void moving() {
        System.out.println("Летает по воздуху");
    }
}
