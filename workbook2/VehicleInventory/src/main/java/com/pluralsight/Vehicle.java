package com.pluralsight;

public class Vehicle {
    private long vehicleId;
    private String makeModel;
    private String color;
    private int odometerReading;
    private float price;

    //getters
    public long getVehicleId(){
        return this.vehicleId;
    }
    public String getMakeModel(){
        return this.makeModel;
    }
    public String getColor(){
        return this.color;
    }
    public int getOdometerReading(){
        return this.odometerReading;
    }
    public float getPrice() {
        return price;
   }

    public Vehicle(long vehicleId, String makeModel, String color, int odometerReading, float price) {
        this.vehicleId = vehicleId;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;
    }


    //setters
    public void setVehicleId(long vehicleId){
        this.vehicleId = vehicleId;
    }
    public void setMakeModel(String makeModel){
        this.makeModel = makeModel;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setOdometerReading(int odometerReading){
        this.odometerReading = odometerReading;
    }
    public void setPrice(float price){
        this.price = price;
    }
    public String toString() {
        return vehicleId + " | " + makeModel + " | " + color + " | " + odometerReading + " miles | $" + price;
    }
}
