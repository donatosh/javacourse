package introduction.homework_1;

import introduction.homework_1.transport.TransportType;
import introduction.homework_1.builders.TransportBuilder;
import introduction.homework_1.transport.Car;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Car car = new TransportBuilder()
                .vin("WDB2030041F071931")
                .transportType(TransportType.VEHICLE)
                .length(5.462)
                .width(1.889)
                .height(1.498)
                .maxSpeed(350)
                .creationDate(new Date())
                .build();
        car.carInfo();
    }
}
