package d_programmingWithClasses.a_simpleClassesAndObjects.Task4n;

import java.time.LocalTime;

//TODO Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
public class Train {
    private String destination;
    private int trainNumber;
    private LocalTime departureTime;

    public Train(String destination, int trainNumber, LocalTime departureTime) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

    public Train() {
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }
}
