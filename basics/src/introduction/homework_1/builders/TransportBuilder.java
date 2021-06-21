package introduction.homework_1.builders;

import java.util.Date;
import introduction.homework_1.transport.TransportType;
import introduction.homework_1.transport.Car;

/**
 * Данный билдер призван устранить недостаток анти-паттерна "телескопического конструктора".
 * Он должен уметь собирать транспорт устанавливая необходимые свойства.
 * Для построения каждого типа транспорта нужно создать отдельный подтип TransportBuilder, например, для создания автомобиля new CarBuilder().vin("vin").<установить другие свойства>.build();
 */

public class TransportBuilder {

    private String vin;
    private TransportType transportType;
    private double length;
    private double width;
    private double height;
    private int maxSpeed;
    private Date creationDate;

    public TransportBuilder vin(String vin) {
        this.vin = vin;
        return this;
    }

    public TransportBuilder transportType(TransportType transportType) {
        this.transportType = transportType;
        return this;
    }

    public TransportBuilder length(double length) {
        this.length = length;
        return this;
    }

    public TransportBuilder width(double width) {
        this.width = width;
        return this;
    }

    public TransportBuilder height(double height) {
        this.height = height;
        return this;
    }

    public TransportBuilder maxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }

    public TransportBuilder creationDate(Date date) {
        creationDate = date;
        return this;
    }

    public Car build() {
        return new Car(vin, transportType, length, width, height, maxSpeed, creationDate);
    }
}
