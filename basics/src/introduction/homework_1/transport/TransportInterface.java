package introduction.homework_1.transport;

import java.util.Date;

public interface TransportInterface {
    String getVin();
    TransportType getCarType();
    double getLength();
    double getWidth();
    double getHeight();
    int getMaxSpeed();
    Date getCreationDate();
    void carInfo();
}
