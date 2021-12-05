package Lesson6;

public class RiverShip extends waterTransport {
private double cost;

    public RiverShip(String number, int capacity, double cost) {
        super(number, capacity);
        this.cost = cost;
    }

    @Override
    public int StopTimeSec() {
        return 0;
    }

    @Override
    public void dinDon() {
        System.out.println("River ship ringing");
    }
}
