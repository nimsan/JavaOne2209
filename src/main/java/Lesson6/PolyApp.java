package Lesson6;

public class PolyApp {
    public static void main(String[] args) {
        // is a
        Transport bus = new Bus("a123bc", 40, "Liaz");

        Transport miniBus = new MiniBus("f23df", 20, "Gazel", "rock");

        Transport riverShip = new RiverShip("admiral", 100, 500);

        Transport[] transports = new Transport[]{bus, miniBus, riverShip};

        for (Transport transport : transports) {
            if (transport instanceof waterTransport){
                System.out.println(transport + " is a ship");
            }
            if (transport.getCapacity() < 30) {
                continue;
            }
            System.out.println(transport);
        }
    }
}
