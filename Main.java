import classes.Benz;
import classes.Car;
import classes.Toyota;
import exceptions.SeatNumberException;

import java.io.*;

public class Main {
    public static void main(String[] args) throws SeatNumberException, IOException, ClassNotFoundException {
        try {
            Car[] cars = {
                    new Benz(1000, "red", 200, 400),
                    new Toyota(40, "black", 300, 600)
            };
            String filePath = "E:\\Workspace\\java\\JavaCatPractise\\assets\\objectdb.txt";

            /**
             * Writing the car object to the file
             */
            writeCars(cars, filePath);

            /**
             * Reading the same cars from the file
             */
            Car[] readCars = readCars(filePath);

            for(Car car : readCars) {
                System.out.println(car);
            }

            /**
             * Testing the interfaces implemented by Car
             * */
            for(Car car: cars){
                car.watchTelevision();
                car.playRadio();
            }

            /**
             * Testing the air conditioner interface implemented by Benz
             */

            Benz b = new Benz(100, "blue", 100, 300);
//            b.manageTemperature();

        } catch (SeatNumberException e) {
            e.printStackTrace();
        }
    }

    public static void writeCars(Car[] cars, String filepath) throws IOException {
        try (
                ObjectOutputStream ous = new ObjectOutputStream(
                        new FileOutputStream(filepath));) {
            ous.writeObject(cars);
            System.out.println("Cars written successfully in the database...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Car[] readCars(String filePath) throws IOException, ClassNotFoundException {
        Car[] cars = null;
        try (
                ObjectInputStream ois = new ObjectInputStream(
                        new FileInputStream(filePath));) {
            cars = (Car[]) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return cars;
    }
}