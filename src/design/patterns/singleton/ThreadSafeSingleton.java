package design.patterns.singleton;

public class ThreadSafeSingleton {
    private String value;
    private static volatile ThreadSafeSingleton uniqueInstance; //Ensures visibility across threads

    private ThreadSafeSingleton() {
        //Prevents reflection attacks
        if(uniqueInstance != null) {
            throw new RuntimeException("Use getInstance() method ");
        }
    }

    //Double-Checked locking ensures synchronization only during initialization
    public static ThreadSafeSingleton getInstance() {
        if(uniqueInstance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new ThreadSafeSingleton();
                }
            }
        }
        return uniqueInstance;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
