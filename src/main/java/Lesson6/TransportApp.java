package Lesson6;

public class TransportApp {
    public static void main(String[] args) {
        Bus bus = new Bus("1K",40,"Ikarus");
        bus.move();
        System.out.println(bus.StopTimeSec());
        MiniBus miniBus = new MiniBus("1m",60,"Ford","rock");
        miniBus.move();
        System.out.println(miniBus.StopTimeSec());

    }
}
