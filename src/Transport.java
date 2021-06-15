abstract public class Transport implements Rideable{
    protected String name;
    protected int volume;

    public Transport(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String toString() {
        return name;
    }
}
