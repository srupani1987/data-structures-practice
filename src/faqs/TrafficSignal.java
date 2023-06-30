package faqs;

import java.util.Arrays;
import java.util.List;

public class TrafficSignal implements Runnable {
    private static final Object lock = new Object();
    private static volatile int counter = 0;
    private final List<Color> lightColors = Arrays.asList(Color.GREEN, Color.ORANGE, Color.RED);
    private final int index;

    public TrafficSignal(Color color) {
        this.index = lightColors.indexOf(color);
    }

    public static void main(String[] args) {
        new Thread(new TrafficSignal(TrafficSignal.Color.GREEN)).start();
        new Thread(new TrafficSignal(TrafficSignal.Color.ORANGE)).start();
        new Thread(new TrafficSignal(TrafficSignal.Color.RED)).start();
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                while (true) {
                    while (counter % lightColors.size() != index) {
                        lock.wait();
                    }

                    System.out.println(Thread.currentThread().getName() + " :: " + lightColors.get(counter % lightColors.size()));
                    switch (lightColors.get(counter % lightColors.size())) {
                        case GREEN:
                        case RED :
                            Thread.sleep(5000);
                            break;
                        case ORANGE:
                            Thread.sleep(1000);
                            break;
                    }
                    counter++;
                    lock.notifyAll();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public enum Color {RED, ORANGE, GREEN}
}
