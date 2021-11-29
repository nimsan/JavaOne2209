package Lesson6;

public class MiniBus extends Bus {
    private String musicGenre;

    public MiniBus(String number, int capacity, String model, String musicGenre) {
        super(number, capacity, model);
        this.musicGenre = musicGenre;
    }

    @Override
    public void move() {
        System.out.println("Black eyes move");
    }

    @Override
    public int StopTimeSec() {
        return 4;
    }
}
