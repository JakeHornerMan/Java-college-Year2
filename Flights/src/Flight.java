/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x16399856
 */

//LAUREN
public class Flight {
     protected String destination;
     protected String flightId;
     protected String airline;
     protected int noOfSeats;

    public Flight(){
        destination="";
        flightId="";
        airline="";
        noOfSeats=0;
    }

    public Flight(String destination, String flightId, String airline, int noOfSeats) {
        this.destination = destination;
        this.flightId = flightId;
        this.airline = airline;
        this.noOfSeats = noOfSeats;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }
    
    

   
    
    


}