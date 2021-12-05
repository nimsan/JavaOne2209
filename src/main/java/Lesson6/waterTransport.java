package Lesson6;

public abstract class waterTransport extends Transport {
    protected String startMonth;
    protected String endMonth;

    public waterTransport(String number, int capacity) {
        super(number, capacity);
    }

    public abstract void dinDon();
}
