package classes;

import exceptions.SeatNumberException;
import interfaces.RadioTv;

import java.io.Serializable;

public class Car implements RadioTv, Serializable {

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getMinimumHeight() {
        return minimumHeight;
    }

    public void setMinimumHeight(int minimumHeight) {
        this.minimumHeight = minimumHeight;
    }

    public int getMaximumHeight() {
        return maximumHeight;
    }

    public void setMaximumHeight(int maximumHeight) {
        this.maximumHeight = maximumHeight;
    }

    private String color;
    private int numberOfSeats;
    private int minimumHeight;
    private int maximumHeight;

    public Car(int numberOfSeats, String color, int minimumHeight, int maximumHeight) throws SeatNumberException {
        if (numberOfSeats > 100) {
            throw new SeatNumberException("The number of seats is beyond 100");
        }
        this.numberOfSeats = numberOfSeats;
        this.minimumHeight = minimumHeight;
        this.maximumHeight = maximumHeight;
        this.color = color;
    }

    @Override
    public void watchTelevision() {
        System.out.println("Watching television");
    }

    @Override
    public void playRadio() {
        System.out.println("Playing the radio");
    }

    @Override
    public String toString() {
        return "Car with color: " + color + " ,maxHeight: " + maximumHeight + " ,minHeight: " + minimumHeight
                + " and number of seats: " + numberOfSeats + ";";
    }
}
