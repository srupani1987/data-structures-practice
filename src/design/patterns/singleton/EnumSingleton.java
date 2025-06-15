package design.patterns.singleton;

/**
 * Simplest
 * Safe from serialization, cloning, and reflection
 * Singleton guarantee from JVM
 */
public enum EnumSingleton {
    INSTANCE;

    private String value;

    public String getValue() {
        return value;
    }

    public void getValue(String value) {
        this.value = value;
    }
}
