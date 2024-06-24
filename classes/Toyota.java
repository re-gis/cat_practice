package classes;

import exceptions.SeatNumberException;

public class Toyota extends Car {
    public Toyota (int numberOfSeats, String color, int min, int max) throws SeatNumberException {
        super(numberOfSeats, color, min, max);
    }
}
