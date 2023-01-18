package Car;

import java.sql.Date;

public class Car {
    private String manufacturer;
    private String color;
    private int gear;
    private String fuel;
    private boolean manualGear = true;
    private int seat;
    
    public Car(String manufacturer, String color, String fuel, int seat){
        this.manufacturer =  manufacturer;
        this.color = color;
        this.fuel = fuel;
        this.seat = seat;
        this.gear = 0;
    }
}
