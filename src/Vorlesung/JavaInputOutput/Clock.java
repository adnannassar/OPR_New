package Vorlesung.JavaInputOutput;


public class Clock {
    private long start;
    private long end;

    public void startTime() {
        start = System.nanoTime();
    }

    public void stopTime() {
        end = System.nanoTime();
    }

    public long getDuration() {
        return end - start;
    }
}
