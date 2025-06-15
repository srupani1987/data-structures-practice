package design.patterns.factorymethod;

public class EnumBasedFactoryMethod {
    public static Vehicle createVehicle(VehicleType vehicleType) {
        return switch (vehicleType) {
            case CAR -> new Car();
            case BIKE -> new Bike();
            case TRUCK -> new Truck();
        };
    }
}
