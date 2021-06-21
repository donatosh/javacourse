package introduction.homework_1.transport;

import java.util.Date;

public abstract class Transport implements TransportInterface {

    private String vin;
    private TransportType transportType;
    private double length;
    private double width;
    private double height;
    private int maxSpeed;
    private Date creationDate;

    public Transport(String vin,
               TransportType transportType,
               double length,
               double width,
               double height,
               int maxSpeed,
               Date creationDate) {
        this.vin = vin;
        this.transportType = transportType;
        this.length = length;
        this.width = width;
        this.height = height;
        this.maxSpeed = maxSpeed;
        this.creationDate = creationDate;
    }

    @Override
    public String getVin() { return this.vin; }

    @Override
    public TransportType getCarType() { return this.transportType; }

    @Override
    public double getLength() { return this.length; }

    @Override
    public double getWidth() { return this.width; }

    @Override
    public double getHeight() {
        return this.height;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public Date getCreationDate() {
        return this.creationDate;
    }

    @Override
    public void carInfo() {
        System.out.println("VIN: " + this.vin);
        System.out.println("TYPE: " + this.transportType);
        System.out.println("LENGTH: " + this.length);
        System.out.println("WIDTH: " + this.width);
        System.out.println("HEIGHT: " + this.height);
        System.out.println("MAX SPEED: " + this.maxSpeed);
        System.out.println("CREATED: " + this.creationDate);
    }
}