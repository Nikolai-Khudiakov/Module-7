public class Main {
    public static void main(String[] args) {
        Transport[] transports = new Transport[3];
        transports[0] = new Car("Машина", 5);
        transports[1] = new Plane("Самолет", 100);
        transports[2] = new Boat("Лодка", 8);
        for (Transport t : transports) {
            System.out.print(t);
            t.moving();
        }
    }
}