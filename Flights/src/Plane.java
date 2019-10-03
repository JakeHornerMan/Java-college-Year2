/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x16399856
 */

//JAKE
public class Plane extends Flight{
    private boolean inFlightMovie;
    private boolean wifi;
    private double passenger; 
    private double firstClass;
    //0 represents passemger
    //1 represents firstClass
    private int planeType;
    private double price;

    public int getPlaneType() {
        return planeType;
    }

    public void setPlaneType(int planeType) {
        this.planeType = planeType;
    }
    
    Plane(){
        super();
        inFlightMovie=true;
        wifi=true;
        //passenger=100.0;
        //firstClass=150.0;
        planeType = 0;
        price = 0.0;
    }

    public Plane(boolean inFlightMovie, boolean wifi, double passenger, double firstClass, String destination, String flightId, String airline, int noOfSeats) {
        super(destination, flightId, airline, noOfSeats);
        this.inFlightMovie = inFlightMovie;
        this.wifi = wifi;
        this.passenger = passenger;
        this.firstClass = firstClass;
    }

    public boolean getInFlightMovie() {
        return inFlightMovie;
    }

    public void setInFlightMovie(boolean inFlightMovie) {
        this.inFlightMovie = inFlightMovie;
    }

    public boolean getWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public double getPassenger() {
        return passenger;
    }

    public void setPassenger(double passenger) {
        this.passenger = passenger;
    }

    public double getFirstClass() {
        return firstClass;
    }

    public void setFirstClass(double firstClass) {
        this.firstClass = firstClass;
    }

    String printDetails() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setPrice (int planeType) {
        if (planeType==0) {
            price = 100.0;
        }
        else if (planeType == 1) {
            price = 150.0;
        }
      
    }
}
