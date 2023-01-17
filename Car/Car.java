package Car;

import java.sql.Date;

public class Car {
    private String manufacturer;
    private String color;
    private int gear;
    private String fuel;
    private boolean manualGear = true;
    private int seat;
    
    public Car(String manufacturer, String color, String fuel){
        this.manufacturer =  manufacturer;
        this.color = color;
        this.fuel = fuel;
        this.seat = 5;
        this.gear = 0;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setGear(int gear) {
        this.gear += 1;
    }

    public int getGear() {
        return this.gear;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getFuel() {
        return this.fuel;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public int getSeat() {
        return this.seat;
    }

    public static void main(String[] args) {
        Car car = new Car("Ford", "black", "Gasoline");
        System.out.println("Manufacturer " + car.getManufacturer() + " color " + car.getColor() + " fuel type " + car.getFuel());
    }
}
