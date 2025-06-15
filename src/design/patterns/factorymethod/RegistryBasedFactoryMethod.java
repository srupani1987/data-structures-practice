package design.patterns.factorymethod;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class RegistryBasedFactoryMethod {
    static Map<String, Supplier<Vehicle>> registry = new HashMap<>();

    static {
        registry.put("CAR", Car::new);
        registry.put("BIKE", Bike::new);
        registry.put("TRUCK", Truck::new);
    }

    public static Vehicle createVehicle(String vehicleType) {
        Supplier<Vehicle> vehicleSupplier = registry.get(vehicleType);
        if(vehicleSupplier != null) {
            return vehicleSupplier.get();
        }

        throw new IllegalArgumentException("Unknown Vehicle type : "+vehicleType);
    }
}
