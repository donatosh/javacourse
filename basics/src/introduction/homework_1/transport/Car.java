package introduction.homework_1.transport;

import java.util.Date;

public class Car extends Transport {

    private String vin;
    private TransportType transportType;
    private double length;
    private double width;
    private double height;
    private int maxSpeed;
    private Date creationDate;

    public Car(String vin,
               TransportType transportType,
               double length,
               double width,
               double height,
               int maxSpeed,
               Date creationDate) {
        super(vin, transportType, length, width, height, maxSpeed, creationDate);
    }
}
