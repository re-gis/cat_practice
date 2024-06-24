package classes;

import exceptions.SeatNumberException;
import interfaces.AirConditioner;

public class Benz extends Car implements AirConditioner {
    public Benz(int numberOfSeats, String color, int min, int max) throws SeatNumberException {
        super(numberOfSeats, color, min, max);
        super.setMaximumHeight(500);
        super.setMinimumHeight(200);
    }
    @Override
    public void manageTemperature() {
        System.out.println("Managing the temperature...");
    }
}
