package design.patterns.factorymethod;

import static design.patterns.factorymethod.VehicleType.BIKE;
import static design.patterns.factorymethod.VehicleType.CAR;

public class FactoryMethodTest {
    public static void main(String[] args) {

        //Registry Based Factory Method
        System.out.println("Testing Registry Based Factory Method...");
        Vehicle bike = RegistryBasedFactoryMethod.createVehicle("BIKE");
        System.out.println(bike.getType());

        Vehicle car = RegistryBasedFactoryMethod.createVehicle("CAR");
        System.out.println(car.getType());

//        Vehicle bus = RegistryBasedFactoryMethod.createVehicle("BUS");
//        System.out.println(bus.getType());


        //Enum Based Factory Method
        System.out.println("Testing Enum Based Factory Method...");
        Vehicle car1 = EnumBasedFactoryMethod.createVehicle(CAR);
        System.out.println(car1.getType());


        Vehicle bike1 = EnumBasedFactoryMethod.createVehicle(BIKE);
        System.out.println(bike1.getType());
    }
}
