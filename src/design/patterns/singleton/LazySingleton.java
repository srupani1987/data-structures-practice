package design.patterns.singleton;

/**
 * Bill Pugh Singleton (Best for Lazy + Thread-Safe)
 * 1. Lazy Loaded using class loader mechanism
 * 2. Threadsafe without synchronization
 * 3. clean and efficient
 */
public class LazySingleton {
    private String value;

    private static class SingletonHelper {
        private static final LazySingleton INSTANCE = new LazySingleton();
    }

    private static LazySingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
