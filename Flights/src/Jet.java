
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
public class Jet extends Flight {
    private boolean massage;
    private boolean inFlightEnt;
    private double costStd; //2 free drinks
    private double costPrem; //Open Bar with complementary meal
    private int x;
    
    
    
    Jet(){
        super();
        massage=true;
        inFlightEnt=true;
        costStd=0.0;
        costPrem=0.0;
        x=2000;
    }

    public Jet(boolean massage, boolean inFlightEnt, double costStd, double costPrem, String destination, String flightId, String airline, int noOfSeats) {
        super(destination, flightId, airline, noOfSeats);
        this.massage=massage;
        this.inFlightEnt = inFlightEnt;
        this.costStd = costStd;
        this.costPrem = costPrem;
    }
    
    //Connor
    public void compute() {
        costStd = x;
        costPrem = x*1.25;
        massage = true;
        
        /*if(massageRBYes instanceof massage){
            massage=x*1;
        }*/
    }

    public boolean getMassage() {
        return massage;
    }

    public void setMassage(boolean massage) {
        this.massage = massage;
    }

    public boolean getInFlightEnt() {
        return inFlightEnt;
    }

    public void setInFlightEnt(boolean inFlightEnt) {
        this.inFlightEnt = inFlightEnt;
    }

    public double getCostStd() {
        return costStd;
    }

    public void setCostStd(double costStd) {
        this.costStd = costStd;
    }

    public double getCostPrem() {
        return costPrem;
    }

    public void setCostPrem(double costPrem) {
        this.costPrem = costPrem;
    }
    
    
    
    
    
}

